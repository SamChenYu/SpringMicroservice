package com.samchenyu.project_service.repository;


import com.samchenyu.project_service.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
}
