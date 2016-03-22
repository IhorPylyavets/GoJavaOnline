package com.goit.gojavaonline.sortarray;

public class ArraySort {
    public static void sortBubble(int[] array) {
        for (int i = array.length - 1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tempVariable = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = tempVariable;
                }
            }
        }
    }

    public static void sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tempVariable = array[i];
            int j;

            for (j = i-1; j >= 0 && array[j] > tempVariable; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = tempVariable;
        }
    }

    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int tempVariable = array[i];

            array[i] = array[minIndex];
            array[minIndex] = tempVariable;
        }
    }

    public static int[] sortMerge(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int middle = array.length/2;
        int[] first = copyOfRange(array, 0, middle);
        int[] second = copyOfRange(array, middle, array.length);

        sortMerge(first);
        sortMerge(second);

        merge(first, second, array);
        return array;
    }

    private static int[] copyOfRange(int[] origin, int from, int to) {
        int[] array = new int[to-from];

        for (int i = 0, j = from; j<to; i++, j++) {
            array[i] = origin[j];
        }
        return array;
    }

    private static void merge(int[] first, int[] second, int[] result) {
        int totalElement = first.length + second.length;

        int i = 0;
        int iFirst = 0;
        int iSecond = 0;

        while ( i < totalElement) {
            if ((iFirst < first.length) && (iSecond<second.length)) {
                if (first[iFirst] < second[iSecond]) {
                    result[i] = first[iFirst];
                    iFirst++;
                } else {
                    result[i] = second[iSecond];
                    iSecond++;
                }
                i++;
            }
            else {
                if (iFirst >= first.length) {
                    while (iSecond < second.length) {
                        result[i] = second[iSecond];
                        i++;
                        iSecond++;
                    }
                }
                if (iSecond >= second.length) {
                    while (iFirst < first.length) {
                        result[i] = first[iFirst];
                        iFirst++;
                        i++;
                    }
                }
            }
        }
    }

    public static void sortQuick(int[] array) {
        recursiveSortQuick(array, 0, array.length-1);
    }

    private static void recursiveSortQuick(int[] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index-1) {
            recursiveSortQuick(array, left, index - 1);
        }
        if (index < right) {
            recursiveSortQuick(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int tempVariable;
        int pilot = array[(left+right) / 2];

        while (i <= j) {
            while (array[i] < pilot) { //0 < 1 ,,,, a b
                i++;
            }
            while (array[j] > pilot) {
                j--;
            }
            if (i <= j) {
                tempVariable = array[i];
                array[i] = array[j];
                array[j] = tempVariable;
                i++;
                j--;
            }
        }

        return i;
    }
}
