package com.goit.gojavaonline.module_9.caesar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int shift = 0;
        String text = "";

        System.out.println("Enter Caesar shift here : ");

        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            shift = Integer.parseInt(bufferRead.readLine());
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Enter Text for CipherCaesar here : ");

        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            text = bufferRead.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Your text: " + text);

        String encryptText = CipherCaesar.encrypt(text, shift);
        String decryptText = CipherCaesar.decrypt(encryptText, shift);

        System.out.println("EncryptText: " + encryptText);
        System.out.println("DecryptText: " + decryptText);
    }
}
