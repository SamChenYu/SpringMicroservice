# 🌱 Spring Microservices 🔗

This repository demonstrates a microservices architecture in Spring Boot

* **project-services:** Handles project information.
* **developer-services:** Handles developer information and interacts with `project-services` to fetch project details for each developer.
* **Service Registry (Eureka):** Enables service discovery.
* **Cloud Gateway (Spring Cloud Gateway):** Provides API routing, load balancing and gateway functionality.

A `docker-compose.yml` file is included for running all services locally using Docker.
```bash
docker-compose up -d
```

For users, all requests should be accessed through the Cloud Gateway at ```http://localhost:8085```, with either ```/developers``` or ```/projects``` endpoint.

## Default Container Ports

* **developer-services:**
    * Backend: 8080
    * MongoDB: 27017
    * Mongo Express: 8081
* **project-services:**
    * Backend: 8082
    * MySQL: 3306
    * phpMyAdmin: 8083
* **Service Registry (Eureka):** 8761
* **Cloud Gateway:** 8085