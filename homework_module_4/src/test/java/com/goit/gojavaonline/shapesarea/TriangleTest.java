package com.goit.gojavaonline.shapesarea;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test(timeout = 1000)
    public void testArea() throws Exception {
        final double sideA = 5;
        final double sideB = 4;
        final double sideC = 3;

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        final double result = triangle.area();

        Assert.assertEquals(6, result, 0.0002);

    }
}