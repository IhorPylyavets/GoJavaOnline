package com.goit.gojavaonline.musicshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainCryptCollections {
    public static void main(String[] args) {
        String s = "Hello GoIt GoOnlineJava";
        String encryptS = CipherCaesar.encrypt(s, 7);
        System.out.println("s: " + s);
        System.out.println("encryptS: " + encryptS);

        final List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new Guitar("Guitar1", "2000", 2013));
        instrumentList.add(new Guitar("Guitar2", "3300", 2010));
        instrumentList.add(new Guitar("Guitar3", "1870", 2000));
        instrumentList.add(new Guitar("Guitar4", "870", 1990));

        instrumentList.add(new Piano("Piano1", "1900", 1997));
        instrumentList.add(new Piano("Piano2", "1300", 2007));
        instrumentList.add(new Piano("Piano3", "1450", 1991));

        instrumentList.add(new Trumpet("Trumpet1", "450", 1991));
        instrumentList.add(new Trumpet("Trumpet2", "950", 1994));
        instrumentList.add(new Trumpet("Trumpet3", "880", 2009));

        String instrumentsTable = PrintCollections.instrumentsToString(instrumentList);
        System.out.println(instrumentsTable);

        int shift = 0;

        System.out.println("Enter Caesar shift here : ");

        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            shift = Integer.parseInt(bufferRead.readLine());
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        String encryptText = CipherCaesar.encrypt(instrumentsTable, shift);
        String decryptText = CipherCaesar.decrypt(encryptText, shift);

        System.out.println("EncryptTable: ");
        System.out.println(encryptText);

        System.out.println("DecryptTable: ");
        System.out.println(decryptText);

        try {
            ReadWriteFile.writeToFileEncryptedText("crypt.txt", instrumentsTable, shift);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ReadWriteFile.decryptTextFromFile("crypt.txt", "decrypt.txt", shift);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
