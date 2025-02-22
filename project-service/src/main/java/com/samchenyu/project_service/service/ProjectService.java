package com.samchenyu.project_service.service;

import com.samchenyu.project_service.model.Project;
import com.samchenyu.project_service.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(int id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

}
