package io.github.aaronclong.inheritance.abstractclass;

/**
 * Created by aaronlong on 5/1/17.
 */
public class ATM {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(1000);
        checking.setOwner("Molly");
        System.out.println("Checking account");
        checking.atmTerminal("WITHDRAW", 500);
        SavingsAccount savings = new SavingsAccount(10000);
        savings.setOwner("John");
        System.out.println("Business account");
        savings.atmTerminal("ADDFUNDS", 45000);
        BusinessAccount businessAccount = new BusinessAccount(100000);
        businessAccount.nameBusiness("Zip Code Wilmington");
        businessAccount.atmTerminal("ADDFUNDS", 3000);
    }
}
