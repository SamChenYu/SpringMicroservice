package com.samchenyu.developer_service.controller;

import org.springframework.web.bind.annotation.RestController;
import com.samchenyu.developer_service.service.DeveloperService;
import com.samchenyu.developer_service.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/developers")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchDeveloperById(@PathVariable String id) {
        return developerService.fetchDeveloperById(id);
    }

    @GetMapping
    public ResponseEntity<?> fetchAllDevelopers() {
        return developerService.fetchAllDevelopers();
    }

    @PostMapping
    public ResponseEntity<?> createDeveloper(@RequestBody Developer developer) {
        return developerService.createDeveloper(developer);
    }

    /*
    {
        "id": "1",
        "name": "John Doe",
        "email": "johndoe@example.com",
        "projectId": 123
    }

     */

}
