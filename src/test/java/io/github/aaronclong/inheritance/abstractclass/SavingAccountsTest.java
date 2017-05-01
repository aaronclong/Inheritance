package io.github.aaronclong.inheritance.abstractclass;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 5/1/17.
 */
public class SavingAccountsTest {
    @Test
    public void testSavingAccounts() {
        SavingsAccount savings = new SavingsAccount(10000);
        savings.setOwner("John");
        savings.atmTerminal("ADDFUNDS", 4000);
        Assert.assertEquals("Checking adding funds", 14000, savings.getBalance(), .003);
        savings.atmTerminal("WITHDRAW", 11000);
        Assert.assertEquals("Checking adding funds", 3000, savings.getBalance(), .003);
    }
}
