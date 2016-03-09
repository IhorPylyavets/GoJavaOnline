package com.goit.gojavaonline.shapesarea;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(4.9);
        System.out.println("Circle area:" + shape.area());

        shape = new Rectangle(4, 9);
        System.out.println("Rectangle area:" + shape.area());

        shape = new Triangle(4, 9, 8);
        System.out.println("Triangle area:" + shape.area());
    }
}
