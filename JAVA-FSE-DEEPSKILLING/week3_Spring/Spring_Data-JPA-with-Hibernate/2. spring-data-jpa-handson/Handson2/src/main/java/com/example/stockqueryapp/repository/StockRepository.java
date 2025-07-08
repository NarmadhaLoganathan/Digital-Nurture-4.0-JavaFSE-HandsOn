package com.example.stockqueryapp.repository;

import com.example.stockqueryapp.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByStCodeAndStDateBetween(String code, LocalDate from, LocalDate to);
    List<Stock> findByStCodeAndStCloseGreaterThan(String code, BigDecimal close);
    List<Stock> findTop3ByOrderByStVolumeDesc();
    List<Stock> findTop3ByStCodeOrderByStCloseAsc(String code);
}