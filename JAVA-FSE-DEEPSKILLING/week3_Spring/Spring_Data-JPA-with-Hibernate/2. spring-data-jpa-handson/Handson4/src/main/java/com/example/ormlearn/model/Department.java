
package com.example.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    // Getters and Setters
}
