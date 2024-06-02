package com.ms.school_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SchoolServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServicesApplication.class, args);
	}

}
