package com.goit.gojavaonline.pointsdistance;

public class Main {
    public static void main(String[] args) {
        Point first = new Point();
        first.setX(0);
        first.setY(9);

        Point second = new Point(3, 4);
        System.out.println("Distance: " + PointDistance.distance(second, first));
    }
}
