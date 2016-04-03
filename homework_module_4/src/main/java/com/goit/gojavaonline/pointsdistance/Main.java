package com.goit.gojavaonline.pointsdistance;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(3, 4);

        System.out.println("Distance: " + PointDistance.distance(second, first));
    }
}
