package com.samchenyu.developer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DeveloperServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperServiceApplication.class, args);
		System.out.println("Developer Service is running...");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
