package com.goit.gojavaonline.shapesarea;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);

        if (!isTrianglePossible(sideA, sideB, sideC)) {
            throw new IllegalStateException("[Error]: Triangle with this this parameters isn't possible. SideC is very big");
        }
        if (!isTrianglePossible(sideA, sideC, sideB)) {
            throw new IllegalStateException("[Error]: Triangle with this this parameters isn't possible. SideB is very big");
        }
        if (!isTrianglePossible(sideC, sideB, sideA)) {
            throw new IllegalStateException("[Error]: Triangle with this this parameters isn't possible. SideA is very big");
        }
    }

    private boolean isTrianglePossible(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide + secondSide) > thirdSide) {
            return true;
        }
        return false;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideA should be > 0!");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideB should be > 0!");
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideC should be > 0!");
        }
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
