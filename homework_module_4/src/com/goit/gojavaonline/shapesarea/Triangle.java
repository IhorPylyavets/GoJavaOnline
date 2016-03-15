package com.goit.gojavaonline.shapesarea;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        checkSideA(sideA);
        checkSideB(sideB);
        checkSideC(sideC);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        isSideACorrect(this.sideA);
        isSideBCorrect(this.sideB);
        isSideCCorrect(this.sideC);
    }

    private void checkSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideA should be > 0!");
        }
    }

    private void checkSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideB should be > 0!");
        }
    }

    private void checkSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalStateException("[Error]: Triangle SideC should be > 0!");
        }
    }

    private boolean isTrianglePossible(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide + secondSide) > thirdSide) {
            return true;
        }
        return false;
    }

    private boolean isSideACorrect(double valueSideA) {
        if (!isTrianglePossible(this.sideC, this.sideB, valueSideA)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideA is very big");
        }
        return true;
    }

    private boolean isSideBCorrect(double valueSideB) {
        if (!isTrianglePossible(this.sideA, this.sideC, valueSideB)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideB is very big");
        }
        return true;
    }

    private boolean isSideCCorrect(double valueSideC) {
        if (!isTrianglePossible(this.sideA, this.sideB, valueSideC)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideC is very big");
        }
        return true;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        checkSideA(sideA);
        if (isSideACorrect(sideA)) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        checkSideB(sideB);
        if (isSideBCorrect(sideB)) {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        checkSideC(sideC);
        if (isSideCCorrect(sideC)) {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
