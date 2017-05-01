package io.github.aaronclong.inheritance.abstractclass;

/**
 * Created by aaronlong on 5/1/17.
 */
public class SavingsAccount extends Accounts {

    private String owner;

    public SavingsAccount() {
    }

    public SavingsAccount(double initBalance) {
        super();
        addFunds(initBalance);
    }

    public String getOwner() {
        return owner;
    }

    private void setAccName() {
        super.setAccName("saving-" + owner);
    }

    public void setOwner(String theOwner) {
        owner = theOwner;
        setAccName();
    }

    public void atmTerminal(String action, double amount) {
        if (action.equals(Actions.WITHDRAW.name())) super.withDrawBalance(amount);
        else if (action.equals(Actions.ADDFUNDS.name())) super.addFunds(amount);
        atmPrint();
    }

    public void atmPrint() {
        System.out.println(getAccName());
        System.out.printf("Saving account Balance %s\n", super.getBalance());
    }
}
