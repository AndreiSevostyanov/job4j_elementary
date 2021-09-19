package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.0001);
    }

    @Test
    public void when00to30then3() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double expected = 3.0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.0001);
    }

    @Test
    public void when00to90then9() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 9;
        int y2 = 0;
        double expected = 9.0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.0001);
    }
}