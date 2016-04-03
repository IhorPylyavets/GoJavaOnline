package com.goit.gojavaonline.shapesarea;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test(timeout = 1000)
    public void testArea() throws Exception {
        final double width = 5;
        final double length = 4;

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setLength(length);

        final double result = rectangle.area();

        Assert.assertEquals(width*length, result, 0.0002);
    }
}