package com.samchenyu.project_service.model;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private double budget;



    // idk why but lombok wasn't working so I'm just gonna put these here
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBudget() {
        return budget;
    }


}
