
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    
    @GetMapping("/inventory")
    public String getInventory() {
        return "Inventory list from Inventory Service";
    }

}
