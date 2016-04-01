package com.goit.gojavaonline.pointsdistance;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedPointDistanceTest {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double expected;

    public ParametrizedPointDistanceTest(double x1, double y1, double x2, double y2, double expected) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: Math.sqrt(({0}-{2})*({0}-{2}) + ({1}-{3})*({1}-{3})")
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 3, 4, 5 },
                { 1, 1, 1, 8, 7 },
                { -1, -1, -1, 8, 9 }
        });
    }

    @Test
    public void testDistance() {
        Assert.assertEquals(expected, PointDistance.distance(new Point(x1, y1), new Point(x2, y2)), 0.0002);
    }
}
