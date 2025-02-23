package com.samchenyu.developer_service.service;


import com.samchenyu.developer_service.model.Developer;
import com.samchenyu.developer_service.repository.DeveloperRepository;
import com.samchenyu.developer_service.service.dto.DeveloperResponse;
import com.samchenyu.developer_service.service.dto.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> createDeveloper(Developer developer) {
        try {
            return new ResponseEntity<Developer>(developerRepository.save(developer), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<?> fetchDeveloperById(String id) {
        Optional<Developer> developer = developerRepository.findById(id);
        if(developer.isPresent()) {
            // Fetching from project microservice
            // Better to have url in application.properties
            Project project = restTemplate.getForObject("http://localhost:8080/project/" + developer.get().getProjectId(), Project.class);
            DeveloperResponse developerResponse = new DeveloperResponse(
                                            developer.get().getId(),
                                            developer.get().getName(),
                                            developer.get().getEmail(),
                                            project
                                );
            return new ResponseEntity<DeveloperResponse>(developerResponse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Developer not found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<?> fetchAllDevelopers() {
        List<Developer> developers = developerRepository.findAll();
        if(!developers.isEmpty()) {
            return new ResponseEntity<List<Developer>>(developers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No developers found", HttpStatus.NOT_FOUND);
        }
    }

}

