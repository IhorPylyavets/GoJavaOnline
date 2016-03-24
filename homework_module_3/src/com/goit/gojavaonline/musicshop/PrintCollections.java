package com.goit.gojavaonline.musicshop;

import java.util.List;

public class PrintCollections {
    public static void printInstruments(List<Instrument> instrumentList) {
        String title = "Title";
        String price = "Price";
        String issueYear = "IssueYear";
        System.out.format("%14s %10s   %10s%n", title, price, issueYear);

        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        final int[] id = {1};

        instrumentList.stream()
                .forEach(instrument -> {
                    System.out.format("%2d. %10s %10s   %10d%n", id[0],
                            instrument.getTitle(), instrument.getPrice(), instrument.getIssueYear());
                    id[0] += 1;
                });
    }

    public static String getJSONCollections(List<Instrument> instrumentList) {
        String listString = "{\"instruments\":[";

        for (Instrument instrument : instrumentList) {
            String instrumentString = String.format("{\"classType\":\"%s\", \"title\":\"%s\"" +
                    ", \"price\":\"%s\", \"issueYear\":\"%d\"},"
                    , instrument.getClass().getSimpleName(), instrument.getTitle()
                    , instrument.getPrice(), instrument.getIssueYear());

            listString = listString.concat(instrumentString);
        }

        listString = listString.substring(0, listString.length()-1);

        listString = listString.concat("]}");

        return listString;
    }
}
