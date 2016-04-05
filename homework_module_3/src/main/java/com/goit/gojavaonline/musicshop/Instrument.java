package com.goit.gojavaonline.musicshop;

public abstract class Instrument {
    private String title;
    private String price;
    private int issueYear;

    public Instrument(String title, String price, int issueYear) {
        this.title = title;
        this.price = price;
        this.issueYear = issueYear;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getIssueYear() {
        return issueYear;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }
}
