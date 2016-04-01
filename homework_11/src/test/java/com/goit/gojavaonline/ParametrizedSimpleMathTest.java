package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedSimpleMathTest {

    private static final SimpleMath simpleMath = new SimpleMath();
    private int numberA;
    private int numberB;
    private int expected;

    public ParametrizedSimpleMathTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: multiply({0}*{1})={2}")
    // If parameter is *{ 3, 4, 8 }*, then {index} = test run # {from 0}, {0} = 3, {2} = 4, {2} = 8
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 1 },
                { 2, 3, 6 },
                { 8, 7, 56 },
                { 4, 5, 20 }
        });
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(expected, simpleMath.multiply(numberA, numberB));
    }
}
