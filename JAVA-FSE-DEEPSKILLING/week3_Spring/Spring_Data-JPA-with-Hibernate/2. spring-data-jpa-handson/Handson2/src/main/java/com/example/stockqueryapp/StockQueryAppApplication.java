package com.example.stockqueryapp;

import com.example.stockqueryapp.model.Stock;
import com.example.stockqueryapp.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class StockQueryAppApplication implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    public static void main(String[] args) {
        SpringApplication.run(StockQueryAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Facebook - Sep 2019:");
        List<Stock> fb = stockRepository.findByStCodeAndStDateBetween("FB", LocalDate.of(2019,9,1), LocalDate.of(2019,9,30));
        fb.forEach(System.out::println);

        System.out.println("\nGoogle > 1250:");
        List<Stock> google = stockRepository.findByStCodeAndStCloseGreaterThan("GOOGL", new BigDecimal("1250"));
        google.forEach(System.out::println);

        System.out.println("\nTop 3 volume:");
        stockRepository.findTop3ByOrderByStVolumeDesc().forEach(System.out::println);

        System.out.println("\nNetflix lowest:");
        stockRepository.findTop3ByStCodeOrderByStCloseAsc("NFLX").forEach(System.out::println);
    }
}