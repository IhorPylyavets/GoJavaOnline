package com.goit.gojavaonline.pointsdistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointDistanceTest {

    @Test(timeout = 3000)
    public void testDistance() throws Exception {
        final int x1 = 0;
        final int y1 = 0;

        final int x2 = 3;
        final int y2 = 4;

        final double result = PointDistance.distance(new Point(x1, y1), new Point(x2, y2));

        assertEquals(5, result, 0.0002);
    }
}