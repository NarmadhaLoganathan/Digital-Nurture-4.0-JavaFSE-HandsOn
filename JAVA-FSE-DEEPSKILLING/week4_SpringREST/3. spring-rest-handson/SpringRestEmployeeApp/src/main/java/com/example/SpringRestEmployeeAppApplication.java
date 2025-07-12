package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class SpringRestEmployeeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestEmployeeAppApplication.class, args);
    }
}
