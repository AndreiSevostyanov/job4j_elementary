package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        Assert.assertEquals(expected, Max.max(left, right));
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int expected = 2;
        Assert.assertEquals(expected, Max.max(left, right));
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int expected = 3;
        Assert.assertEquals(expected, Max.max(left, right));
    }
}