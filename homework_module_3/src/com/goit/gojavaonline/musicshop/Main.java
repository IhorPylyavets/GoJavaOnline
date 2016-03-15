package com.goit.gojavaonline.musicshop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicInstrument guitar = new Guitar();
        MusicInstrument piano = new Piano();

        List<MusicInstrument> musicInstruments = new ArrayList<>();
        musicInstruments.add(guitar);
        musicInstruments.add(piano);

        MusicShop shop = new MusicShop(musicInstruments);
    }
}
