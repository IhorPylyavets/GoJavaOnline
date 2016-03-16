package com.goit.gojavaonline.musicshop;

public abstract class Instrument {
    private String title;

    public Instrument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
