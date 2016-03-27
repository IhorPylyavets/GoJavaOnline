package com.goit.gojavaonline.musicshop;

public class CipherCaesar {
    private static final int ALPHABET_COUNT = 26;
    private static final int LOWERCASE_START = 97;
    private static final int LOWERCASE_END = 122;

    public static String encrypt(String textForCrypt, int shift) {
        StringBuilder sb = new StringBuilder();

        shift %= ALPHABET_COUNT;
        textForCrypt = textForCrypt.toLowerCase();

        for (int i = 0; i < textForCrypt.length(); i++) {
            int shiftValue = (int) textForCrypt.charAt(i);

            if (shiftValue >= LOWERCASE_START && shiftValue <= LOWERCASE_END) {
                shiftValue += shift;

                if (shiftValue > LOWERCASE_END) {
                    shiftValue -= ALPHABET_COUNT;
                }
            }

            sb.append((char) shiftValue);
        }

        return sb.toString();
    }

    public static String decrypt(String textForDecrypt, int shift) {
        StringBuilder sb = new StringBuilder();

        shift %= ALPHABET_COUNT;
        textForDecrypt = textForDecrypt.toLowerCase();

        for (int i = 0; i < textForDecrypt.length(); i++) {
            int shiftValue = (int) textForDecrypt.charAt(i);

            if (shiftValue >= LOWERCASE_START && shiftValue <= LOWERCASE_END) {
                shiftValue -= shift;

                if (shiftValue < LOWERCASE_START) {
                    shiftValue += ALPHABET_COUNT;
                }
            }

            sb.append((char) shiftValue);
        }

        return sb.toString();
    }
}
