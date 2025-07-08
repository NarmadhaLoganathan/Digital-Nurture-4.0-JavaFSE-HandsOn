
package com.example.ormlearn.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;
    private boolean permanent;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;

    // Getters and Setters
}
