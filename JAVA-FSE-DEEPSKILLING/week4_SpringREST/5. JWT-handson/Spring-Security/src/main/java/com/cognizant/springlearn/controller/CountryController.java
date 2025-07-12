package com.cognizant.springlearn.controller;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Map<String, String>> getCountries() {
        return Arrays.asList(
            Map.of("code", "IN", "name", "India"),
            Map.of("code", "US", "name", "United States"),
            Map.of("code", "JP", "name", "Japan")
        );
    }
}