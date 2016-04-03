package com.goit.gojavaonline.shapesarea;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4.87);
        System.out.println("Circle area:" + circle.area());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4.76);
        rectangle.setWidth(3.976);
        System.out.println("Rectangle area:" + rectangle.area());

        Triangle triangle = new Triangle(4, 8, 5);
        System.out.println("Triangle area:" + triangle.area());
        triangle.setSideA(17);
        System.out.println("Triangle area:" + triangle.area());
    }
}
