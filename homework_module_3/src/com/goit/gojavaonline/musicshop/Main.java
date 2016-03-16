package com.goit.gojavaonline.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Instrument guitar0 = new Guitar("guitar0");
        Instrument guitar1 = new Guitar("guitar1");
        Instrument guitar2 = new Guitar("guitar2");
        Instrument guitar3 = new Guitar("guitar3");

        Instrument piano0 = new Piano("piano0");
        Instrument piano1 = new Piano("piano1");
        Instrument piano2 = new Piano("piano2");

        Instrument trumpet0 = new Trumpet("trumpet0");
        Instrument trumpet1 = new Trumpet("trumpet1");
        Instrument trumpet2 = new Trumpet("trumpet2");

        List<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar0);
        instruments.add(guitar1);
        instruments.add(guitar2);
        instruments.add(guitar3);

        instruments.add(piano0);
        instruments.add(piano1);
        instruments.add(piano2);

        instruments.add(trumpet0);
        instruments.add(trumpet1);
        instruments.add(trumpet2);

        System.out.println("Map instruments on shop:");
        Map<String, Integer> instrumentsMap =  Order.determineInstrumentsMap(instruments);
        for (Map.Entry<String, Integer> entry : instrumentsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();

        MusicShop shop = new MusicShop(instruments);

        Map<String, Integer> order = new HashMap<>();
        order.put("Piano", 2);
        order.put("Guitar", 1);
        order.put("Trumpet", 1);

        System.out.println("Map instruments on order:");
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();

        shop.prepareInstruments(order);

        System.out.println("Map instruments on shop after prepareInstruments:");
        instrumentsMap =  Order.determineInstrumentsMap(instruments);
        for (Map.Entry<String, Integer> entry : instrumentsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();


        Map<String, Integer> order2 = new HashMap<>();
        order2.put("Piano", 1);
        order2.put("Guitar", 1);
        order2.put("Trumpet", 3);

        System.out.println("Map instruments on order2:");
        for (Map.Entry<String, Integer> entry : order2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();

        shop.prepareInstruments(order2);

        System.out.println("Map instruments on shop after prepareInstruments2:");
        instrumentsMap =  Order.determineInstrumentsMap(instruments);
        for (Map.Entry<String, Integer> entry : instrumentsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();
    }
}
