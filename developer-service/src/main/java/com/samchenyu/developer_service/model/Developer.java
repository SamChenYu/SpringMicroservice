package com.samchenyu.developer_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "developers")
public class Developer {
    @Id
    private String id;
    private String name;
    private String email;
    private Integer projectId;

    // for some reason lombok isn't working so I'm going to manually add these for now
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getProjectId() {
        return projectId;
    }




}
