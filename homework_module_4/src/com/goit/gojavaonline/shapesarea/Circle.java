package com.goit.gojavaonline.shapesarea;

public class Circle extends Shape {
    private double radius;
    final double pi = Math.PI;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }
}
