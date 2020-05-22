package com.example.restServiceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("com.example.restServiceDemo")
//@EnableJpaRepositories("com.example.restServiceDemo")
public class RestServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceDemoApplication.class, args);
	}

}
