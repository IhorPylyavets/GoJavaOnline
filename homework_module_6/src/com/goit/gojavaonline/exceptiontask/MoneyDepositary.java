package com.goit.gojavaonline.exceptiontask;

import java.math.BigDecimal;

public class MoneyDepositary {
    private BigDecimal transactionMoneyAmount;

    public BigDecimal getTransactionMoneyAmount() {
        return transactionMoneyAmount;
    }

    public void setTransactionMoneyAmount(BigDecimal transactionMoneyAmount) {
        this.transactionMoneyAmount = transactionMoneyAmount;
        System.out.println("setTransactionMoneyAmount() " + this.transactionMoneyAmount);
    }

    public void withdrawMoney(BigDecimal moneyAmount) {
        try {
            if (transactionMoneyAmount.compareTo(moneyAmount) == -1) {
                throw new ExceptionTransaction();
            }
            this.transactionMoneyAmount = this.transactionMoneyAmount.subtract(moneyAmount);
            System.out.println("Your transaction is successful");
        } catch (ExceptionTransaction exceptionTransaction) {
            exceptionTransaction.transactionIsImpossible();
        }
    }
}
