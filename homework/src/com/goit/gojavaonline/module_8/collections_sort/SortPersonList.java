package com.goit.gojavaonline.module_8.collections_sort;

import java.util.List;

public class SortPersonList {
    public static void sortPersonList(List<Person> personList) {
        for (int i = personList.size() - 1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (personList.get(j).getName().compareTo(personList.get(j+1).getName()) > 0) {
                    Person tempVariable = personList.get(j);

                    personList.set(j, personList.get(j+1));
                    personList.set(j+1, tempVariable);
                }
            }
        }

    }

    public static void quickSort(List<Person> personList) {
        recursiveQuickSort(personList, 0, personList.size()-1);
    }

    private static void recursiveQuickSort(List<Person> list, int first, int last) {
        if(first < last) {
            int index = partition(list, first, last);

            recursiveQuickSort(list, first, index-1);
            recursiveQuickSort(list, index+1, last);
        }
    }

    private static int partition(List<Person> list, int left, int right) {
        int pilot = left;

        for(int i = pilot+1; i <= right; i++)
            if(list.get(i).getName().compareTo(list.get(pilot).getName()) < 0) {
                swap(list, i, pilot+1);
                swap(list, pilot, pilot+1);
                pilot++;
            }
        return pilot;
    }

    private static void swap(List<Person> list, int first, int second) {
        Person tempVariable = list.get(first);

        list.set(first, list.get(second));
        list.set(second, tempVariable);
    }
}
