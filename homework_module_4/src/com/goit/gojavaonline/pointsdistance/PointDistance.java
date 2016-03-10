package com.goit.gojavaonline.pointsdistance;

public class PointDistance {
    public static double distance(Point first, Point second) {
        return Math.hypot(first.getX()-second.getX(), first.getY()-second.getY());
    }
}
