package com.goit.gojavaonline.musicshop;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MusicShop {
    private List<Instrument> instruments;
    private String[] titleInstrument = {"Piano", "Guitar", "Trumpet"};

    public MusicShop(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public List<Instrument> prepareInstruments(Map<Class, Integer> order) {
        Map<Class, Integer> instrumentsMap = OrderUtils.determineInstrumentsMap(this.instruments);

        if (OrderUtils.isAvailabilityInstrumentByOrder(instrumentsMap, order)) {
            for (Map.Entry<Class, Integer> entry : order.entrySet()) {
                Class key = entry.getKey();
                int value = entry.getValue();

                for (Iterator<Instrument> iterator = this.instruments.iterator(); iterator.hasNext() && value>0;) {
                    Instrument instrument = iterator.next();

                    if (instrument.getClass().equals(key)) {
                        iterator.remove();
                        value -= 1;
                    }
                }
            }
        }

        return getInstruments();
    }
}
