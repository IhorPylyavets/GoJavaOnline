package com.goit.gojavaonline.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(PrintCollections.getJSONCollections(instrumentList));

        /*System.out.println("Map instruments on shop:");
        Map<String, Integer> instrumentsMap =  Order.determineInstrumentsMap(instrumentList);
        for (Map.Entry<String, Integer> entry : instrumentsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();

        MusicShop shop = new MusicShop(instrumentList);

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
        instrumentsMap =  Order.determineInstrumentsMap(instrumentList);
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
        instrumentsMap =  Order.determineInstrumentsMap(instrumentList);
        for (Map.Entry<String, Integer> entry : instrumentsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key + "(" + value + ")");
        }
        System.out.println();*/
    }
}
