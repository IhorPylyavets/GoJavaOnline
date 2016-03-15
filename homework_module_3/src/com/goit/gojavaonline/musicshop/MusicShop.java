package com.goit.gojavaonline.musicshop;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MusicShop {
    private List<Instrument> instruments;
    private String[] titleInstrument = {"piano", "guitar", "trumpet"};

    public MusicShop(List<Instrument> instruments) {
        setInstruments(instruments);
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        if (instruments.size() == 0) {
            throw new IllegalStateException("[Error]: Music Shop without music instruments isn't possible!");
        }
        this.instruments = instruments;
    }

    private boolean isCorrectOrder(Map<String, Integer> order) {
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (!Arrays.asList(titleInstrument).contains(key)) {
                try {
                    throw new IncorrectOrderKeyException(key);
                } catch (IncorrectOrderKeyException e) {
                    System.err.println("[Error]: Key '" + e.getOrderKey() + "' not found");
                    return false;
                }
            }
            if (value <= 0) {
                throw new IllegalArgumentException("[Error]: Value '" + value + "', value should be > 0");
            }
        }
        return true;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {
        if (isCorrectOrder(order)) {

        }
        return getInstruments();
    }
}
