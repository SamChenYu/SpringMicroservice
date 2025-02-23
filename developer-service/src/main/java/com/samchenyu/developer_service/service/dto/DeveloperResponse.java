package com.samchenyu.developer_service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperResponse {
    private String id;
    private String name;
    private String email;
    private Project project;

    // for some reason lombok isn't working so I'm going to manually add these for now
    public DeveloperResponse(String id, String name, String email, Project project) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.project = project;
    }
}
