package com.example.ormlearn;

import com.example.ormlearn.model.Stock;
import com.example.ormlearn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        stockRepository.findByStCodeAndStDateBetween("FB",
                LocalDate.of(2019, 9, 1), LocalDate.of(2019, 9, 30)).forEach(System.out::println);

        stockRepository.findByStCodeAndStCloseGreaterThan("GOOGL",
                new BigDecimal("1250")).forEach(System.out::println);

        stockRepository.findTop3ByOrderByStVolumeDesc().forEach(System.out::println);

        stockRepository.findTop3ByStCodeOrderByStCloseAsc("NFLX").forEach(System.out::println);
    }
}
