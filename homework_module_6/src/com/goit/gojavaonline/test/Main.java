package com.goit.gojavaonline.test;

public class Main {
    public static void main(String [] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog.getInstance().setName("Rex");

        System.out.println("Dog name is " + Dog.getInstance().getName());
        Dog.dogSayGav();
        Dog.getInstance().dogSay("Gav-gav ... Fuck your mother !");
    }
}