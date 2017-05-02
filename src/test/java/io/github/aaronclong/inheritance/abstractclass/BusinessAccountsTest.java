package io.github.aaronclong.inheritance.abstractclass;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 5/1/17.
 */
public class BusinessAccountsTest {
    @Test
    public void testBusinessAccount() {
        BusinessAccount businessAccount = new BusinessAccount(1000000);
        businessAccount.nameBusiness("Zip Code Wilmington");
        businessAccount.atmTerminal("WITHDRAW", 100000);
        Assert.assertEquals("Business account withdraw",900000, businessAccount.getBalance(), .003);
        businessAccount.atmTerminal("ADDFUNDS", 50000);
        Assert.assertEquals("Business account deposit", 950000, businessAccount.getBalance(), .003);
    }
}
