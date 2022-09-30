package com.example.Spring.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataApplication {

	@Autowired
	@PostConstruct
	void String(){

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

}
