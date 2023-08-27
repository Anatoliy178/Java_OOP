package org.example;

/**
 * Лукьянов Анатолий
 * группа 4619
 */

import java.util.Calendar;

public class Beverage extends Product{

    private double volume;


    public Beverage(String name, int price, int quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

//    @Override
//    public Beverage setVolume(double volume) {
//        this.volume = volume;
//        return this;
//    }
    @Override
    public String toString() {
        return "Напиток{" +
                "обьём =" + volume +
                "} " + super.toString();
    }
}
