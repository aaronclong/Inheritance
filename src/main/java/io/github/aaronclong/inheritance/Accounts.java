package io.github.aaronclong.inheritance;

/**
 * Created by aaronlong on 5/1/17.
 */
public abstract class Accounts {
    private double credit = 0;
    private double debit = 0;
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

    public double getDebit() {
        return debit;
    }

    public double withDrawDebit(double newDebit) {
        if (debit-newDebit >= 0) {
            debit = newDebit;
        }
        return debit;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String newName) {
        accName = newName;
    }

    public void addFundsDebit(double amount) {
        debit += amount;
    }

    public void payDebtCredit(double amount) {
        if (credit - amount >= 0) {
            credit -= amount;
        }
    }

    public abstract void atmTerminal(String action, double amount);
    public abstract void atmPrint();

}
