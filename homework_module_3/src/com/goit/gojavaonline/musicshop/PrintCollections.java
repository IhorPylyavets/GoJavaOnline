package com.goit.gojavaonline.musicshop;

import java.util.List;

public class PrintCollections {
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
