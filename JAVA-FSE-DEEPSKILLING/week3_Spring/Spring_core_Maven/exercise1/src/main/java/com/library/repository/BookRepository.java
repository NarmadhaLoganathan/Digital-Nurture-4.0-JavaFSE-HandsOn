package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> findAllBooks() {
        return Arrays.asList("The Alchemist", "Clean Code", "Effective Java");
    }
}
