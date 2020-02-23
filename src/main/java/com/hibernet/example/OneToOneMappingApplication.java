package com.hibernet.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
		System.out.println("SpringBoot Data JPA");
	}

}
