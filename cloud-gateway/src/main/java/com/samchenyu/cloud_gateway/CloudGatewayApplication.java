package com.samchenyu.cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(CloudGatewayApplication.class, args);
		System.out.println("Cloud Gateway is running...");
	}

}
