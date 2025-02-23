package com.samchenyu.developer_service.service.dto;



import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {

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
