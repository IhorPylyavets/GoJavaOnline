package com.goit.gojavaonline.sortarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, -9, 11, 45, 23, -6, -10, 0, 12, -5, 1};

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        ArraySort.sortQuick(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
