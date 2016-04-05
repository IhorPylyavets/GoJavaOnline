package com.goit.gojavaonline.musicshop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherCaesarTest {

    @Test
    public void testEncrypt() throws Exception {
        String text = "Hello GoIt GoOnlineJava";
        String expectedText = "olssv nvpa nvvuspulqhch";
        int shift = 7;

        String encryptText = CipherCaesar.encrypt(text, shift);

        Assert.assertTrue(expectedText.equals(encryptText));

    }

    @Test
    public void testDecrypt() throws Exception {
        String encryptText = "olssv nvpa nvvuspulqhch";
        int shift = 7;
        String expectedText = "hello goit goonlinejava";

        String decryptText = CipherCaesar.decrypt(encryptText, shift);

        Assert.assertTrue(expectedText.equals(decryptText));

    }
}