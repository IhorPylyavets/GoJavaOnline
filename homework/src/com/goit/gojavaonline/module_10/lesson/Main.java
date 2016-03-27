package com.goit.gojavaonline.module_10.lesson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*try {
            ExampleClass.scanXan("xanadu.txt", "outagain.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //ExampleClass.simplePrint();
        try {
            ExampleClass.objectStream("invoicedata");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
