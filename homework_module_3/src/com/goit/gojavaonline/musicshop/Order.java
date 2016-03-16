package com.goit.gojavaonline.musicshop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    public static boolean isCorrectOrderByKeyValue(Map<String, Integer> order, String[] titleInstrument) {
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

    public static Map<String, Integer> determineInstrumentsMap(List<Instrument> instruments) {
        Map<String, Integer> orderMap = new HashMap<>();

        for (Instrument instrument : instruments) {
            if (orderMap.containsKey(instrument.getClass().getSimpleName())) {
                orderMap.put(instrument.getClass().getSimpleName(),
                        orderMap.get(instrument.getClass().getSimpleName()) + 1);
            } else {
                orderMap.put(instrument.getClass().getSimpleName(), 1);
            }
        }

        return orderMap;
    }

    public static boolean isAvailabilityInstrumentByOrder(Map<String, Integer> instruments, Map<String, Integer> order) {
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String orderKey = entry.getKey();
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
