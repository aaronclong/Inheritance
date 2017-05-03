package io.github.aaronclong.inheritance.classmanager;

import java.util.ArrayList;

/**
 * Created by aaronlong on 5/1/17.
 */
public class Inventory {

    private ArrayList<Product> inventory;

    public Inventory() {
        inventory = new ArrayList<Product>();
    }

    public void addItem(Product product) {
        inventory.add(product);
    }

    public double getInventorySum() {
        double price = 0;
        for (Product p : inventory) {
            price += p.getTotalValue();
        }
        return price;
    }

    public static void main(String[] args) {
        Inventory online = new Inventory();
        Product hayaoMiyazakiPoster = new Product("miyazaki");
        hayaoMiyazakiPoster.setQuantity(700);
        hayaoMiyazakiPoster.setPrice(15);
        Product lordOfTheRings = new Product("Lord of the Rings");
        hayaoMiyazakiPoster.setQuantity(1000);
        hayaoMiyazakiPoster.setPrice(9);
        online.addItem(hayaoMiyazakiPoster);
        online.addItem(lordOfTheRings);
        System.out.println(online.getInventorySum());
    }
}

class Product {
    private String id;
    private int quantity;
    private double price;

    public Product() {
        quantity = 0;
        price = 0;
    }

    public Product(String productID) {
        this();
        id = productID;
    }

    public void setQuantity(int productQuantity) {
        quantity = productQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double productPrice) {
        price = productPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalValue() { return getQuantity() * getPrice(); }

}