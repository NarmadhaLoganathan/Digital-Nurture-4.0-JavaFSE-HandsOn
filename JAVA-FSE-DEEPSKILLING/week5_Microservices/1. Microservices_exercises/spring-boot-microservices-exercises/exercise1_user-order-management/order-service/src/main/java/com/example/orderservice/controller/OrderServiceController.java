package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

    @GetMapping("/orders")
    public String greet() {
        return "Hello from Order Service!";
    }
}
