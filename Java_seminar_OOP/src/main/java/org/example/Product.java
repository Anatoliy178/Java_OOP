package org.example;
/**
 * Лукьянов Анатолий
 * группа 4619
 */

import java.util.Calendar;



public abstract class Product {
    private String name;
    private int price;
    private int quantity;
    private Calendar bestBefore;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }
    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }



    public Product(String name, int price, int quantity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "/" + bestBefore.get(Calendar.DATE) +
                '}';
    }


}