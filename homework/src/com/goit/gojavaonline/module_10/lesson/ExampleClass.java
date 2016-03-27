package com.goit.gojavaonline.module_10.lesson;

import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Scanner;

public class ExampleClass {
    public static void copyBytes(String fileIn, String fileOut) throws IOException {
        try (final FileInputStream in = new FileInputStream(fileIn);
             FileOutputStream out = new FileOutputStream(fileOut);) {
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }

    public static void copyCharacters(String fileIn, String fileOut) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(fileIn);
            writer = new FileWriter(fileOut);

            int c;

            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void scanXan(String fileIn) throws IOException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileIn)))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }

    public static void simplePrint() {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("the square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println(".");

        int j = 5;
        double r2 = Math.sqrt(j);

        System.out.println("the square root of " + j + " is " + r2 + ".");

        StringBuilder sb = new StringBuilder();
        int k = 8;
        double r3 = Math.sqrt(k);

        sb.append("the square root of ")
                .append(k)
                .append(" is ")
                .append(r3)
                .append(".");
        System.out.println(sb.toString());

        int p = 10;
        double r4 = Math.sqrt(p);

        System.out.format("the square root of %d is %f .%n", p, r4);
    }

    public static void data(String outFile) throws IOException {
        double[] prices = {18.97, 9.00, 3.99, 18.34, 7.23};
        int[] units = {12, 7, 9, 13, 63};
        String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Java Pin",
                "JAva Jugging Dolls",
                "Java Key Chain"
        };

        DataInputStream in = null;

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }

            out.close();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(outFile)));

            while (true) {
                double price = in.readDouble();
                int unit = in.readInt();
                String desc = in.readUTF();

                System.out.format("Your ordered %d units of %s at $%.2f %n", unit, desc, price);
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

    public static void objectStream(String outFile) throws IOException, ClassNotFoundException {
        BigDecimal[] prices = {
                new BigDecimal("18.97"),
                new BigDecimal("9.00"),
                new BigDecimal("3.99"),
                new BigDecimal("18.34"),
                new BigDecimal("7.23")
        };
        int[] units = {12, 7, 9, 13, 63};
        String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Java Pin",
                "JAva Jugging Dolls",
                "Java Key Chain"
        };

        try (final ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)))) {

            out.writeObject(Calendar.getInstance());

            for (int i = 0; i < prices.length; i++) {
                out.writeObject(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        }

        try (final ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(outFile)))) {
            Calendar date;
            BigDecimal price;
            int unit;
            String desc;
            BigDecimal total = new BigDecimal(0);

            date = (Calendar) in.readObject();

            System.out.format("On %tA, %<tB %<tc, %<tY:%n", date);

            try {
                while (true) {
                    price = (BigDecimal) in.readObject();
                    unit = in.readInt();
                    desc = in.readUTF();

                    System.out.format("Your ordered %d units of %s at $%.2f %n", unit, desc, price);

                    total = total.add(price.multiply(new BigDecimal(unit)));
                }
            } catch (EOFException e) {
                System.out.println("Reached enf of file");
            }
            System.out.format("For a TOTAL of: $%.2f%n", total);
        }

    }
}
