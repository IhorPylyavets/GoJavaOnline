package com.goit.gojavaonline.musicshop;

public class IncorrectOrderKeyException extends Exception {
    private String orderKey;

    public IncorrectOrderKeyException(final String orderKey) {
        this.orderKey = orderKey;
    }

    public String getOrderKey() {
        return orderKey;
    }
}
