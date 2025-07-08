package com.example.stockqueryapp.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stId;

    private String stCode;
    private LocalDate stDate;
    private BigDecimal stOpen;
    private BigDecimal stClose;
    private Long stVolume;

    // Getters and Setters
    public int getStId() { return stId; }
    public void setStId(int stId) { this.stId = stId; }

    public String getStCode() { return stCode; }
    public void setStCode(String stCode) { this.stCode = stCode; }

    public LocalDate getStDate() { return stDate; }
    public void setStDate(LocalDate stDate) { this.stDate = stDate; }

    public BigDecimal getStOpen() { return stOpen; }
    public void setStOpen(BigDecimal stOpen) { this.stOpen = stOpen; }

    public BigDecimal getStClose() { return stClose; }
    public void setStClose(BigDecimal stClose) { this.stClose = stClose; }

    public Long getStVolume() { return stVolume; }
    public void setStVolume(Long stVolume) { this.stVolume = stVolume; }

    @Override
    public String toString() {
        return stCode + " | " + stDate + " | Open: " + stOpen + " | Close: " + stClose + " | Volume: " + stVolume;
    }
}