package com.example.countrymanagement.service;

import com.example.countrymanagement.entity.Country;
import com.example.countrymanagement.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country getCountryByCode(String code) {
        return repository.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    public List<Country> searchCountriesByName(String name) {
        return repository.findByCoNameContainingIgnoreCase(name);
    }
}