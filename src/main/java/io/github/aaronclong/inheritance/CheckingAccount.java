package io.github.aaronclong.inheritance;

/**
 * Created by aaronlong on 5/1/17.
 */
public class CheckingAccount extends Accounts {
    private String owner;
    private double creditLimit = 500;

    public CheckingAccount() {

    }

    public CheckingAccount(double debit) {
        super();
        super.addFundsDebit(debit);
    }

    public void atmTerminal(String action, double amount) {
        if (action.equals(Actions.WITHDRAW.name())) super.withDrawDebit(amount);
        else if (action.equals(Actions.CREDIT.name())) borrow(amount);
        else if (action.equals(Actions.ADDFUNDS.name())) super.addFundsDebit(amount);
        else if (action.equals(Actions.PAYDEBT.name())) super.payDebtCredit(amount);
        atmPrint();
    }

    public void atmPrint() {
        System.out.println(getAccName());
        System.out.printf("Debit account Balance %s\n", getDebit());
        System.out.printf("Credit Balance %s\n", getCredit());
    }

    public String getOwner() {
        return owner;
    }

    private void setAccName() {
        super.setAccName("checking-" + owner);
    }

    public void setOwner(String theOwner) {
        owner = theOwner;
        setAccName();
    }

    private void borrow(double borrowAmount) {
        if ((creditLimit - super.getCredit()) - borrowAmount >= 0) {
            withDrawCredit(borrowAmount);
        }
    }
}
