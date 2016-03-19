package com.goit.gojavaonline.test;

public class Dog {
    private static Dog instance = new Dog();
    private String name;

    //private constructor to avoid client applications to use constructor
    private Dog(){}

    public static synchronized Dog getInstance(){
        if(instance == null){
            instance = new Dog();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void dogSayGav() {
        System.out.println("Gav-gav-gav");
    }

    public void dogSay(String dogWords) {
        System.out.println("Dog " + getInstance().getName() + " say: " + dogWords);
    }
}
