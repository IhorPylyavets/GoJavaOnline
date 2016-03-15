package com.goit.gojavaonline.musicshop;

import java.util.List;

public class MusicShop {
    private List<MusicInstrument> musicInstruments;

    public MusicShop(List<MusicInstrument> musicInstruments) {
        setMusicInstruments(musicInstruments);
    }

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }

    public void setMusicInstruments(List<MusicInstrument> musicInstruments) {
        if (musicInstruments.size() == 0) {
            throw new IllegalStateException("[Error]: Music Shop without music instruments isn't possible!");
        }
        this.musicInstruments = musicInstruments;
    }
}
