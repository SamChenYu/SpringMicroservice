package com.samchenyu.project_service.controller;

import com.samchenyu.project_service.service.ProjectService;
import com.samchenyu.project_service.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RequestMapping("/projects")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project addProject(@RequestBody Project project) {

        return projectService.addProject(project);
    }
    /*
        {
          "name": "Project1",
          "description": "Project Description",
          "budget": 5000.00
        }
     */

}
