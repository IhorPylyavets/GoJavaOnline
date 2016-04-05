package com.goit.gojavaonline.flowers;

import java.util.List;

public class BouquetFlowers {
    private List<Flower> flowers;

    public BouquetFlowers(List<Flower> flowers) {
        setFlowers(flowers);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        if (flowers.size() == 0) {
            throw new IllegalStateException("[Error]: BouquetFlowers isn't create!");
        }
        this.flowers = flowers;
    }
}
