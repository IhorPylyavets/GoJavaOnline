package com.goit.gojavaonline.flowers;

import java.util.List;

public class Rosebush {
    private List<Rose> roseBush;

    public Rosebush(List<Rose> roseBush) {
        setRoseBush(roseBush);
    }

    public List<Rose> getRoseBush() {
        return roseBush;
    }

    public void setRoseBush(List<Rose> roseBush) {
        if (roseBush.size() == 0) {
            throw new IllegalStateException("[Error]: Rosebush isn't create!");
        }
        this.roseBush = roseBush;
    }
}
