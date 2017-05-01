package io.github.aaronclong.inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by aaronlong on 5/1/17.
 */
public class CheckingAccountTest {

    private CheckingAccount checking;

    @Before
    public void SetUp() {
        checking = new CheckingAccount(1000);
    }

    @Test
    public void testOwner() {
        checking.setOwner("Molly");
        Assert.assertTrue("Confirming name in and out","Molly".equals(checking.getOwner()));
    }

    @Test
    public void checkingAccountName() {
        checking.setOwner("Molly");
        Assert.assertTrue("Confirming name in and out","checking-Molly".equals(checking.getAccName()));
    }

    @Test
    public void checkCredit() {
        checking.atmTerminal("CREDIT", 400);
        Assert.assertEquals("Checking current debt on credit", 400.0, checking.getCredit(), .003);
        checking.atmTerminal("CREDIT", 150);
        Assert.assertEquals("Checking borrowing over credit limit", 400.0, checking.getCredit(), .003);
        checking.atmTerminal("PAYDEBT", 400);
        Assert.assertEquals("Checking paying down debt", 0.0, checking.getCredit(), .003);
    }

    @Test
    public void checkDebit() {
        checking.atmTerminal("ADDFUNDS", 9000);
        Assert.assertEquals("Checking adding values to debit", 10000, checking.getDebit(), .003);
        checking.atmTerminal("DEBIT", 11000);
        Assert.assertEquals("Checking overdraft on debit", 10000, checking.getDebit(), .003);
    }
}
