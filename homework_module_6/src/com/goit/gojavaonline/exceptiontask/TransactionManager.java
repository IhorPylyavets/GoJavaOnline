package com.goit.gojavaonline.exceptiontask;

import java.math.BigDecimal;

public class TransactionManager {
    private static TransactionManager instance = new TransactionManager();
    private TransactionController controller;
    private Transaction transaction = new Transaction();
    /*private static TransactionManager instance = new TransactionManager();
    private static MoneyDepositary moneyDepositary = new MoneyDepositary();
    private Transaction transaction = new Transaction();
    private TransactionController controller;*/

    private TransactionManager(){}

    public static synchronized TransactionManager getInstance(){
        if(instance == null){
            instance = new TransactionManager();
        }
        return instance;
    }

    public void setController(TransactionController controller) {
        this.controller = controller;
    }

    public void openTransaction() {
        if (!this.transaction.isTransactionFlag()) {
            this.transaction.setTransactionFlag(true);
        }
        System.out.println("User's transaction is open");
    }

    public void closeTransaction() {
        if (this.transaction.isTransactionFlag()) {
            this.transaction.setTransactionFlag(false);
            System.out.println("User's transaction is close");
        } else {
            System.out.println("User's transaction isn't open");
        }

    }

    public static TransactionManager getSecurityModule() {
        return instance;
    }

    public void authorize() {
        try {
            if (!this.transaction.isTransactionFlag()) {
                throw new ExceptionTransaction();
            }
            System.out.println("User is authorize");
        } catch (ExceptionTransaction exceptionTransaction) {
            exceptionTransaction.transactionIsClosed();
        }
    }

    /*public static MoneyDepositary getMoneyDepositary() {
        return moneyDepositary;
    }

    public static void setMoneyDepositary(MoneyDepositary moneyDepositary) {
        moneyDepositary.setTransactionMoneyAmount(moneyDepositary.getTransactionMoneyAmount());
    }

    public void completeTransaction() {
        moneyDepositary.setTransactionMoneyAmount(BigDecimal.valueOf(0));
        System.out.println("Your transaction is successful. You completed all money. " + this.moneyDepositary.getTransactionMoneyAmount());
    }*/
}
