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
    }
}
