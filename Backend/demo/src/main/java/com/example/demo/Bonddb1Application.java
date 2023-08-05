package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;

//@SpringBootApplication
@SpringBootApplication 
@OpenAPIDefinition (info = @Info(title = "bondDB Management Service") )
public class Bonddb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bonddb1Application.class, args);
	}

}

