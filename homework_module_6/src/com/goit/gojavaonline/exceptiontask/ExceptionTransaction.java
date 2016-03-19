package com.goit.gojavaonline.exceptiontask;

public class ExceptionTransaction extends Exception{
    public void transactionIsClosed() {
        System.err.println("[Error]: Transaction isn't possible. It is not open.");
    }

    public void transactionIsImpossible() {
        System.err.println("[Error]: Transaction isn't possible. You don't have enough money.");
    }
}
