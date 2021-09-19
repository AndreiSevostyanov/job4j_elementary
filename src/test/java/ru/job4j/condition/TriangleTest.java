package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExists() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        assertTrue(Triangle.exists(ab, ac, bc));
    }

    @Test
    public void whenNotExists() {
        double ab = 2;
        double ac = 2;
        double bc = 20;
        assertFalse(Triangle.exists(ab, ac, bc));
    }
}