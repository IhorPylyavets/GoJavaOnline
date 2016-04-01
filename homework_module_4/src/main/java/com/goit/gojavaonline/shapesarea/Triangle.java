package com.goit.gojavaonline.shapesarea;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        checkSideLength(sideA);
        checkSideLength(sideB);
        checkSideLength(sideC);

        isTrianglePossible(sideA, sideB, sideC);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private void checkSideLength(double side) {
        if (side <= 0) {
            throw new IllegalStateException("[Error]: Triangle side should be > 0!");
        }
    }

    private boolean checkTriangleInequality(double sideA, double sideB, double sideC) {
        if (sideA >= sideB + sideC) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible.");
        }
        return true;
    }

    private boolean isTrianglePossible(double firstSide, double secondSide, double thirdSide) {
        return checkTriangleInequality(firstSide, secondSide, thirdSide) &&
                checkTriangleInequality(secondSide, firstSide, thirdSide) &&
                checkTriangleInequality(thirdSide, firstSide, secondSide);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        checkSideLength(sideA);
        isTrianglePossible(sideA, this.sideB, this.sideC);
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        checkSideLength(sideB);
        isTrianglePossible(sideB, this.sideA, this.sideC);
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        checkSideLength(sideC);
        isTrianglePossible(sideC, this.sideA, this.sideB);
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
