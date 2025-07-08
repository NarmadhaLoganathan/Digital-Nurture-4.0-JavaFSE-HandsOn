package com.example.ormlearn;

import com.example.ormlearn.model.Country;
import com.example.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Countries containing 'ou':");
        List<Country> result1 = countryRepository.findByNameContaining("ou");
        result1.forEach(System.out::println);

        System.out.println("\nCountries containing 'ou' in ascending order:");
        List<Country> result2 = countryRepository.findByNameContainingOrderByNameAsc("ou");
        result2.forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z':");
        List<Country> result3 = countryRepository.findByNameStartingWith("Z");
        result3.forEach(System.out::println);
    }
}
