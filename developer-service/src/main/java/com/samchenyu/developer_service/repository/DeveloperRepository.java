package com.samchenyu.developer_service.repository;


import com.samchenyu.developer_service.model.Developer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends MongoRepository<Developer, String>{
}
