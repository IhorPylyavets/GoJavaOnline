package com.goit.gojavaonline.shapesarea;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(6.9);
        System.out.println("Circle area:" + shape.area());

        shape = new Rectangle(6.9, -9);
        System.out.println("Rectangle area:" + shape.area());

        shape = new Triangle(13, 3, 3);
        System.out.println("Triangle area:" + shape.area());
    }
}
