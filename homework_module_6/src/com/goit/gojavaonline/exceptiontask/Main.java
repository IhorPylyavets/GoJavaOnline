package com.goit.gojavaonline.exceptiontask;

import java.math.BigDecimal;

public class Main {
    public static void main(String [] args) {
        TransactionController controller = new TransactionController();
        TransactionManager.getInstance().setController(controller);
        //TransactionManager.getInstance().execute();

        /*BigDecimal payment0 = new BigDecimal("1115.37");
        System.out.println(payment0.toString());
        BigDecimal payment1 = new BigDecimal("1115.37");
        System.out.println(payment1.toString());

        BigDecimal payment2 = new BigDecimal("1114.094");
        System.out.println(payment2.toString());

        System.out.println("withdrawMoney 1_2 " + payment1.compareTo(payment2));
        System.out.println("withdrawMoney 2_1 " + payment2.compareTo(payment1));
        System.out.println("withdrawMoney 0_1 " + payment0.compareTo(payment1));*/

        TransactionManager.getInstance().openTransaction();
        TransactionManager.getSecurityModule().authorize();

        /*MoneyDepositary moneyDepositary = new MoneyDepositary();
        BigDecimal payment1 = new BigDecimal("1115.37");
        moneyDepositary.setTransactionMoneyAmount(payment1);
        TransactionManager.setMoneyDepositary(moneyDepositary);


        BigDecimal moneyAmount = TransactionManager.getMoneyDepositary().getTransactionMoneyAmount();
        System.out.println(moneyAmount);

        TransactionManager.getMoneyDepositary().withdrawMoney(moneyAmount);
        TransactionManager.getInstance().completeTransaction();
        TransactionManager.getInstance().closeTransaction();*/
    }
}
