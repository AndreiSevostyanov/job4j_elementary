package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.001);
    }

    @Test
    public void whenP8K2Square3Dot55555() {
        double p = 8;
        double k = 2;
        double expected = 3.55555;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.001);
    }

    @Test
    public void whenP6K3Square1Dot6875() {
        double p = 6;
        double k = 3;
        double expected = 1.6875;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.001);
    }
}