package org.example;

import java.util.Calendar;

public class HotDrink extends Beverage {
    private int temperature;

    public HotDrink(String name, int price, int quantity, Calendar bestBefore,double volume, int temperature) {
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток {" +
                "температура =" + temperature +
                "} " + super.toString();
    }



}
