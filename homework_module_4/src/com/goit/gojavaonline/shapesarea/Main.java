package com.goit.gojavaonline.shapesarea;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6.9);
        System.out.println("Circle area:" + circle.area());

        Rectangle rectangle = new Rectangle(6.9, 9);
        System.out.println("Rectangle area:" + rectangle.area());

        Triangle triangle = new Triangle(4, 3, 3);
        System.out.println("Triangle area:" + triangle.area());
    }
}
