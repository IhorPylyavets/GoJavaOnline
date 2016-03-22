package com.goit.gojavaonline.module_8.collections_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nameArray = new String[] { "Tina Tully", "Bill Simpson", "Dana Smith", "Ralph Andrews", "Greg Smithers"};

        final List<Person> personList = new ArrayList<>();
        for (String str : nameArray) {
            personList.add(new Person(str, new Random().nextInt(70) + 15));
        }

        personList
                .stream()
                .forEach(p -> System.out.println(p));

        System.out.println();

        SortPersonList.quickSort(personList);

        personList
                .stream()
                .forEach(p -> System.out.println(p));

    }
}