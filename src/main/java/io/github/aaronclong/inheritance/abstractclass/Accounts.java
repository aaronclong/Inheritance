package io.github.aaronclong.inheritance.abstractclass;

/**
 * Created by aaronlong on 5/1/17.
 */
public abstract class Accounts {
    private double credit = 0;
    private double balance = 0;
    private String accName;

    public enum Actions {

        WITHDRAW("WITHDRAW"),
        CREDIT("CREDIT"),
        ADDFUNDS("ADDFUNDS"),
        PAYDEBT("PAYDEBT");

        private String action;

        Actions(String theAction){
            action = theAction;
        }
    }

    public double getCredit() {
        return credit;
    }


    public double withDrawCredit(double newCredit) {
        credit += newCredit;
        return credit;
    }

    public double getBalance() {
        return balance;
    }

    public double withDrawBalance(double newBalance) {
        if (balance-newBalance >= 0) {
            balance -= newBalance;
        }
        return balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String newName) {
        accName = newName;
    }

    public void addFunds(double amount) {
        balance += amount;
    }

    public void payDebtCredit(double amount) {
        if (credit - amount >= 0) {
            credit -= amount;
        }
    }

    public abstract void atmTerminal(String action, double amount);
    public abstract void atmPrint();

}
