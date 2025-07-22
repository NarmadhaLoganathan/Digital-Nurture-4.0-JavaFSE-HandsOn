package com.example.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayServiceController {

    @GetMapping("/gateway")
    public String greet() {
        return "API Gateway here";
    }
}
