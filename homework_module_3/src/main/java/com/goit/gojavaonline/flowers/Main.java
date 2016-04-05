package com.goit.gojavaonline.flowers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower aster = new Aster();
        Flower rose = new Rose();
        Flower tulip = new Tulip();
        Flower chamomile = new Chamomile();

        List<Flower> flowers = new ArrayList<>();
        flowers.add(aster);
        flowers.add(tulip);

        BouquetFlowers bouquetFlowers = new BouquetFlowers(flowers);

        List<Rose> roseBush = new ArrayList<>();
        roseBush.add((Rose) rose);

        Rosebush rosebush = new Rosebush(roseBush);
    }
}
