package com.example.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryServiceController {

    @GetMapping("/inventory")
    public String greet() {
        return "Hello from Inventory Service!";
    }
}
