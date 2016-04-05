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

        String table = PrintCollections.instrumentsToString(instrumentList);
        System.out.println(table);

        System.out.println("Map instruments on shop:");
        Map<Class, Integer> instrumentsMap =  OrderUtils.determineInstrumentsMap(instrumentList);
        for (Map.Entry<Class, Integer> entry : instrumentsMap.entrySet()) {
            Class key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key.getSimpleName() + "(" + value + ")");
        }
        System.out.println();

        MusicShop shop = new MusicShop(instrumentList);

        Map<Class, Integer> order = new HashMap<>();
        order.put(Piano.class, 2);
        order.put(Guitar.class, 1);
        order.put(Trumpet.class, 1);

        System.out.println("Map instruments on order:");
        for (Map.Entry<Class, Integer> entry : order.entrySet()) {
            Class key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key.getSimpleName() + "(" + value + ")");
        }
        System.out.println();

        shop.prepareInstruments(order);

        System.out.println("Map instruments on shop after prepareInstruments:");
        instrumentsMap =  OrderUtils.determineInstrumentsMap(instrumentList);
        for (Map.Entry<Class, Integer> entry : instrumentsMap.entrySet()) {
            Class key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key.getSimpleName() + "(" + value + ")");
        }
        System.out.println();
        System.out.println();

        System.out.println("Order #2");

        Map<Class, Integer> order2 = new HashMap<>();
        order2.put(Piano.class, 1);
        order2.put(Guitar.class, 1);
        order2.put(Trumpet.class, 2);

        System.out.println("Map instruments on order2:");
        for (Map.Entry<Class, Integer> entry : order2.entrySet()) {
            Class key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key.getSimpleName() + "(" + value + ")");
        }
        System.out.println();

        shop.prepareInstruments(order2);

        System.out.println("Map instruments on shop after prepareInstruments2:");
        instrumentsMap =  OrderUtils.determineInstrumentsMap(instrumentList);
        for (Map.Entry<Class, Integer> entry : instrumentsMap.entrySet()) {
            Class key = entry.getKey();
            int value = entry.getValue();

            System.out.print(" " + key.getSimpleName() + "(" + value + ")");
        }
        System.out.println();
    }
}
