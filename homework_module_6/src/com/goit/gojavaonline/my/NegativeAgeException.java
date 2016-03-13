package com.goit.gojavaonline.my;

public class NegativeAgeException extends Exception {
    private int ageValue;

    public NegativeAgeException(final int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}
