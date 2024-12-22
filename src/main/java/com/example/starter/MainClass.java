package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = {"com.example"})
@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}

// http://localhost:8080/swagger-ui/index.html
