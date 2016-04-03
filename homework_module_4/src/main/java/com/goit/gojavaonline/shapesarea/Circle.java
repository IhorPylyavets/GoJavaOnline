package com.goit.gojavaonline.shapesarea;

public class Circle extends Shape {
    private double radius;

    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalStateException("[Error]: Circle Radius should be > 0!");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
