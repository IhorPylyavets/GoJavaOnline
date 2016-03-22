package com.goit.gojavaonline.module_8.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*final List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bruce", "Willis", 56));
        personList.add(new Person("Roman", "Zozulia", 32));
        personList.add(new Person("Sergii", "Prutyla", 34));

        personList
                .stream()
                .forEach(p -> System.out.println(p));

        personList
                .stream()
                .map(person -> person.getLastName())
                .forEach(lastName -> System.out.println(lastName));*/

        String[] nameArray = new String[] { "Tina Tully", "Bill Simpson", "Dana Smith"/*, "Ralph Andrews", "Greg Smithers",
                "Lisa Krump", "Gill Bitters", "Barbara West", "Sandra McDonald", "Bart Willis", "Bucky Zimmerman",
                "Richard Vicks", "Velma Tarp", "Winslow Tunnell", "Andrew Letterman", "Betty Trump", "Waldo Smith",
                "Kyle Ronno", "Vivian West", "Wendy Tunnell" */};

        final List<Person> personList = new ArrayList<>();

        for (String str : nameArray) {
            String[] parts = str.split(" ");
            personList.add(new Person(parts[0], parts[1], new Random().nextInt(70) + 15));
        }

        personList
                .stream()
                .forEach(p -> System.out.println(p));



        /*List<String> namesList = new ArrayList<>(Arrays.asList(nameArray));

        final List<Person> personList = new ArrayList<>();

        namesList
                .stream()
                .forEach(p -> System.out.println(p));*/

        /*namesList
                .stream()
                .forEach(p -> System.out.println(p));*/

        /*Collections.sort(namesList);

        System.out.println("Arraylist after sorting");
        namesList
                .stream()
                .forEach(p -> System.out.println(p));

        System.out.println(namesList);*/
    }
}