package com.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

    @GetMapping("/products")
    public String greet() {
        return "Hello from Product Service!";
    }
}
