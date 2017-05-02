package io.github.aaronclong.inheritance.classmanager;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aaronlong on 5/1/17.
 */
public class InventoryTest {
    @Test
    public void testInventorySum() {
        Inventory inventory = new Inventory();
        Product soap = new Product("soap");
        soap.setPrice(4);
        soap.setQuantity(30);
        Product waterBottles = new Product("water-bottles");
        waterBottles.setPrice(2);
        waterBottles.setQuantity(100);
        inventory.addItem(soap);
        inventory.addItem(waterBottles);
        Assert.assertEquals("Checking the sum", 320, inventory.getInventorySum(), .003);
    }

    @Test
    public void checkProductQuantity() {
        Product soap = new Product("soap");
        soap.setQuantity(9);
        Assert.assertEquals("Checking quantity", 9, soap.getQuantity());
    }

    @Test
    public void checkProductPrice() {
        Product soap = new Product("soap");
        soap.setPrice(9.0);
        Assert.assertEquals("Checking price", 9.0, soap.getPrice(), .003);
    }

}