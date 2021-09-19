package ru.job4j.calculator;

import org.junit.Test;
import  org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        Assert.assertEquals(expected, rsl, 0.001);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(in);
        Assert.assertEquals(expected, rsl, 0.001);
    }
}