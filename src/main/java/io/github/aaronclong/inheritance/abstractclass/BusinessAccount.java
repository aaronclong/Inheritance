package io.github.aaronclong.inheritance.abstractclass;

/**
 * Created by aaronlong on 5/1/17.
 */
public class BusinessAccount extends Accounts {

    private String business;

    public BusinessAccount() {}
    public BusinessAccount(double initBalance) {
        super();
        addFunds(initBalance);
    }

    private void setAccName() {
        super.setAccName("Busines-" + business);
    }

    public void nameBusiness(String theBusinessName) {
        business = theBusinessName;
        setAccName();
    }

    public void atmTerminal(String action, double amount) {
        if (action.equals(Actions.WITHDRAW.name())) super.withDrawBalance(amount);
        else if (action.equals(Actions.ADDFUNDS.name())) super.addFunds(amount);
        atmPrint();
    }

    public void atmPrint() {
        System.out.println(getAccName());
        System.out.printf("Business account Balance %s\n", super.getBalance());
    }
}
