package com.example.firstrestapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "FirstRestAPI", version = "1.0", description = "REST API for Product Management (Task 2)"))
public class FirstRestAPiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestAPiApplication.class, args);
    }
}