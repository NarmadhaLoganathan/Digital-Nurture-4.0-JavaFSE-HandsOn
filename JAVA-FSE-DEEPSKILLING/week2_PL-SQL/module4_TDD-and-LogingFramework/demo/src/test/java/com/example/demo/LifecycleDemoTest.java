package com.example.demo;

import org.junit.jupiter.api.*;

public class LifecycleDemoTest {

    @BeforeEach
    void setUp() {
        System.out.println(" BeforeEach: Setting up test data...");
    }

    @Test
    void testOne() {
        System.out.println(" Running testOne");
        Assertions.assertTrue(10 > 5);
    }

    @Test
    void testTwo() {
        System.out.println(" Running testTwo");
        Assertions.assertEquals("HELLO", "hello".toUpperCase());
    }

    @AfterEach
    void tearDown() {
        System.out.println(" AfterEach: Cleaning up after test...");
    }
}
