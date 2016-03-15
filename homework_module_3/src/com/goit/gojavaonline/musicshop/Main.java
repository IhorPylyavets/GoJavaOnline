package com.goit.gojavaonline.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();

        List<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(piano);

        MusicShop shop = new MusicShop(instruments);

        //isCorrectOrder(Map<String, Integer> order)

        Map<String, Integer> order = new HashMap<>();
        order.put("piano", 9);
        order.put("piano1", 8);

        //System.out.println("is: " + shop.isCorrectOrder(order));

    }
}
