package com.example.billingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingServiceController {

    @GetMapping("/billing")
    public String greet() {
        return "Hello from Billing Service!";
    }
}
