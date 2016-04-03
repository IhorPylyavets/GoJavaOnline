package com.goit.gojavaonline.minmaxarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, -9, 11, 45, 23, -6, -9};

        System.out.println("Max: " + GetArrayElement.getMaxArrayElement(arr));
        System.out.println("Min: " + GetArrayElement.getMinArrayElement(arr));
    }
}

