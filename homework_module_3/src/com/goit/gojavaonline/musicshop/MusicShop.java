package com.goit.gojavaonline.musicshop;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicShop {
    private List<Instrument> instruments;
    private String[] titleInstrument = {"Piano", "Guitar", "Trumpet"};

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

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {
        if (Order.isCorrectOrderByKeyValue(order, this.titleInstrument)) {
            Map<String, Integer> instrumentsMap = Order.determineInstrumentsMap(this.instruments);

            if (Order.isAvailabilityInstrumentByOrder(instrumentsMap, order)) {
                for (Map.Entry<String, Integer> entry : order.entrySet()) {
                    String key = entry.getKey();
                    int value = entry.getValue();

                    for (Iterator<Instrument> iterator = this.instruments.iterator(); iterator.hasNext() && value>0;) {
                        Instrument inst = iterator.next();
                        String instType = inst.getClass().getSimpleName();

                        if (instType.equals(key)) {
                            iterator.remove();
                            value -= 1;
                        }
                    }
                }
            }
        }
        return getInstruments();
    }
}
