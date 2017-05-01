package io.github.aaronclong.inheritance;

/**
 * Created by aaronlong on 5/1/17.
 */
public abstract class Accounts {
    private double credit;
    private double debit;
    private String accName;

    public double getCredit() {
        return credit;
    }

    public double withDrawCredit(double newCredit) {
        if (credit - newCredit >= 0){
            credit -= newCredit;
        }
        return credit;
    }

    public double getDebit() {
        return debit;
    }

    public double withDrawDebit(double newDebit) {
        if (debit-newDebit >= 0) {
            debit -= newDebit;
        }
        return debit;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String newName) {
        accName = newName;
    }

    public abstract void atmTerminal();

}
