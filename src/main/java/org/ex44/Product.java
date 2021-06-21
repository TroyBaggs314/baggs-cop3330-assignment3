package org.ex44;

public class Product
{
    private double price;
    private String name;
    private int quantity;

    public double getId() {
        return price;
    }
    public void setId(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}