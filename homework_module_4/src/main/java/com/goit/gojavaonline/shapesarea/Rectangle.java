package com.goit.gojavaonline.shapesarea;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalStateException("[Error]: Rectangle Width should be > 0!");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalStateException("[Error]: Rectangle Length should be > 0!");
        }
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}
