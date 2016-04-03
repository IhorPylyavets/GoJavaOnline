package com.goit.gojavaonline.shapesarea;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test(timeout = 1000)
    public void testArea() throws Exception {
        final double radius = 5;

        Circle circle = new Circle();
        circle.setRadius(8.72);

        final double result = circle.area();

        Assert.assertEquals(Math.PI * radius * radius, result, 0.0002);
    }
}