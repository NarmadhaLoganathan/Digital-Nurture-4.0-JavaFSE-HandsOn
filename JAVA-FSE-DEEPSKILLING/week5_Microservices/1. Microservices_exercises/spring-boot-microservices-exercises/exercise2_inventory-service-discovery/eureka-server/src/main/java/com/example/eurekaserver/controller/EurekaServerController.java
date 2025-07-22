package com.example.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServerController {

    @GetMapping("/")
    public String greet() {
        return "Eureka Discovery Server";
    }
}
