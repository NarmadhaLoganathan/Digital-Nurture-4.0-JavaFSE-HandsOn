package com.example.configserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerController {

    @GetMapping("/")
    public String greet() {
        return "Config Server";
    }
}
