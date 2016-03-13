package com.goit.gojavaonline.my;

import java.util.Scanner;

public class ExceptionExampleRunner {
    public static void main(String[] args) {
        System.out.println("enter age");
        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();

        try {
            final int age = Integer.parseInt(userInput);
            if (age < 0) {
                throw new NegativeAgeException(age);
            }
            System.out.println("Age: " + age);
        } catch (NumberFormatException ex) {
            System.out.println("Error: Enter integer number");
        } catch (NegativeAgeException e) {
            System.out.println("[Error]: Enter age is '" + e.getAgeValue() + "'. Age should be >= 0 !!!");
        }
    }
}
