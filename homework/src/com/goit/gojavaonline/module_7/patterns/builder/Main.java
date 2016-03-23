package com.goit.gojavaonline.module_7.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("habr")
                .build();

    }
}
