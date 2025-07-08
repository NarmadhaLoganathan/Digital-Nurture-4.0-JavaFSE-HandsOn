package com.example.countrymanagement;

import com.example.countrymanagement.entity.Country;
import com.example.countrymanagement.exception.CountryNotFoundException;
import com.example.countrymanagement.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    private void testAddCountry() throws CountryNotFoundException {
        Country country = new Country("NE", "Neverland");
        countryService.addCountry(country);

        Country saved = countryService.findCountryByCode("NE");
        System.out.println("Added Country: " + saved);
    }
}
