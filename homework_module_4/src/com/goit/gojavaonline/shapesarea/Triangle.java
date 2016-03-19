package com.goit.gojavaonline.shapesarea;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        checkSideA(sideA);
        checkSideB(sideB);
        checkSideC(sideC);

        isSideACorrect(sideA, sideB, sideC);
        isSideBCorrect(sideB, sideA, sideC);
        isSideCCorrect(sideC, sideA, sideB);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /*как по мне можно сделать один метод(общий) а не три
    checkSide(double side) - и им проверять три стороны
    */

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

    private void checkSide(double side) {
        if (side <= 0) {
            throw new IllegalStateException("[Error]: Triangle side should be > 0!");
        }
    }

    /*с проверками сторон тут тоже много одинакового кода.
    но... я теряюсь... как лучше?
    сделать проверку только в конструкторе, и удалить сеттеры - типа создается триугольник и все, его менять нельзя*/

    private boolean isTrianglePossible(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide + secondSide) > thirdSide) {
            return true;
        }
        return false;
    }

    private boolean isSideACorrect(double valueSideA, double valueSideB, double valueSideC) {
        if (!isTrianglePossible(valueSideB, valueSideC, valueSideA)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideA is very big");
        }
        return true;
    }

    private boolean isSideBCorrect(double valueSideB, double valueSideA, double valueSideC) {
        if (!isTrianglePossible(valueSideA, valueSideC, valueSideB)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideB is very big");
        }
        return true;
    }

    private boolean isSideCCorrect(double valueSideC, double valueSideA, double valueSideB) {
        if (!isTrianglePossible(valueSideA, valueSideB, valueSideC)) {
            throw new IllegalStateException("[Error]: Triangle with this parameters isn't possible. SideC is very big");
        }
        return true;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        checkSideA(sideA);
        if (isSideACorrect(sideA, this.sideB, this.sideC)) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        checkSideB(sideB);
        if (isSideBCorrect(sideB, this.sideA, this.sideC)) {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        checkSideC(sideC);
        if (isSideCCorrect(sideC, this.sideA, this.sideB)) {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
