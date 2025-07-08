package com.example.countrymanagement.repository;

import com.example.countrymanagement.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {}
