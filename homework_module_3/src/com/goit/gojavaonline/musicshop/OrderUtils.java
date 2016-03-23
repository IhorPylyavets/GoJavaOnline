package com.goit.gojavaonline.musicshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderUtils {
    public static Map<Class, Integer> determineInstrumentsMap(List<Instrument> instruments) {
        Map<Class, Integer> orderMap = new HashMap<>();

        for (Instrument instrument : instruments) {
            if (orderMap.containsKey(instrument.getClass())) {
                orderMap.put(instrument.getClass(), orderMap.get(instrument.getClass()) + 1);
            } else {
                orderMap.put(instrument.getClass(), 1);
            }
        }

        return orderMap;
    }

    public static boolean isAvailabilityInstrumentByOrder(Map<Class, Integer> instruments, Map<Class, Integer> order) {
        for (Map.Entry<Class, Integer> entry : order.entrySet()) {
            Class orderKey = entry.getKey();
            int orderValue = entry.getValue();

            if (instruments.containsKey(orderKey)) {
                int instrumentsCount = instruments.get(orderKey);

                if (orderValue > instrumentsCount) {
                    throw new IllegalArgumentException("[Error]: Instruments '" + orderKey + "' in quantity '"
                            + orderValue + "' no available!");
                }
            } else {
                throw new IllegalArgumentException("[Error]: Instruments '" + orderKey + "', have already sold!");
            }
        }
        return true;
    }
}
