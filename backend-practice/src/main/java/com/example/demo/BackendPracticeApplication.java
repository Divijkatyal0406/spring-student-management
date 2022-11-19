package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = CrudRepository.class)
public class BackendPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendPracticeApplication.class, args);
		System.out.println("hello");
	}

}
