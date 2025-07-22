package com.example.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {

    @GetMapping("/customers")
    public String greet() {
        return "Hello from Customer Service!";
    }
}
