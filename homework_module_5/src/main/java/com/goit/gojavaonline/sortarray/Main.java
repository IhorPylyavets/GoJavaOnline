package com.goit.gojavaonline.sortarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, -9, 11, -45, 23, -6, -10, 0, 12, -5, 1, -90, 34, 1, 3, 5, 8, -456, 23, 789, 54, -123, -235,
        -987, 56, 34, -763, 234, 764, -234, 3, 5, 5, 32, 542, 235, 67, 78, 90, -98, 3, 13, -23, -24, 56, 76, 127, -7,
        34, 56, -112, 54, 87, 98, 23, 76, 98, 0, 33, -456, 678, 23, 76, 91, -39, 61, -9, 567, -8, 25, 8, 5, 1, 2, 1, -3};

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
