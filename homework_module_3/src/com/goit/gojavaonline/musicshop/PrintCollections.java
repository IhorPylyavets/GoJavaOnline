package com.goit.gojavaonline.musicshop;

import java.util.List;

public class PrintCollections {
    public static String instrumentsToString(List<Instrument> instrumentList) {
        StringBuilder sb = new StringBuilder();

        String title = "Title";
        String price = "Price";
        String issueYear = "IssueYear";

        String titles = String.format("%14s %10s   %10s%n", title, price, issueYear);
        sb.append(titles);

        final int[] id = {1};

        instrumentList.stream()
                .forEach(instrument -> {
                    String row = String.format("%2d. %10s %10s   %10d%n", id[0],
                            instrument.getTitle(), instrument.getPrice(), instrument.getIssueYear());

                    sb.append(row);
                    id[0] += 1;
                });

        return sb.toString();
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
