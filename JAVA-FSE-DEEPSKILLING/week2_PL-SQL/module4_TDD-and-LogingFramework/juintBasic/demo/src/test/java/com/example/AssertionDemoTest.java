package com.example.demo_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionDemoTest {

    @Test
    void testAssertEquals() {
        assertEquals(10, 5 + 5);
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(9, 5 + 5);
    }

    @Test
    void testAssertTrue() {
        assertTrue(3 < 5);
    }

    @Test
    void testAssertFalse() {
        assertFalse(5 < 3);
    }

    @Test
    void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNotNull() {
        String str = "Hello";
        assertNotNull(str);
    }

    @Test
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
}
