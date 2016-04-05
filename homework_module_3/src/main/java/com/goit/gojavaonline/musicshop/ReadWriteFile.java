package com.goit.gojavaonline.musicshop;

import java.io.*;

public class ReadWriteFile {
    public static void writeToFileEncryptedText(String outFile, String textToEncrypt, int shift) throws IOException {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));

            for (int i = 0; i < textToEncrypt.length(); i++) {
                String symbol = String.valueOf(textToEncrypt.charAt(i));
                String encryptSymbol = CipherCaesar.encrypt(symbol, shift);

                out.write(encryptSymbol.getBytes());
            }

            out.close();

        } catch (EOFException e) {
            System.out.println("Reached enf of file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decryptTextFromFile(String outFile, String inFile, int shift) throws IOException {
        DataInputStream in = null;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(outFile)));
            FileOutputStream out = new FileOutputStream(inFile);

            int encryptSymbol;
            while ((encryptSymbol = in.read()) != -1) {
                String decryptSymbol = CipherCaesar.decrypt(String.valueOf((char)encryptSymbol), shift);

                out.write(decryptSymbol.getBytes());
            }

        } catch (EOFException e) {
            System.out.println("Reached enf of file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
