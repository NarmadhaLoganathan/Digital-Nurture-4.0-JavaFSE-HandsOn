package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {

    @GetMapping("/payments")
    public String greet() {
        return "Hello from Payment Service!";
    }
}
