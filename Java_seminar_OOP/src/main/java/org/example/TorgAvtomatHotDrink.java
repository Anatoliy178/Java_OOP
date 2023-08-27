package org.example;

import java.util.ArrayList;
import java.util.List;

public class TorgAvtomatHotDrink  extends TorgAvtomat {
    public TorgAvtomatHotDrink(List<Product> myList) {
        super(myList);
    }

    public TorgAvtomatHotDrink() {

    }


    public Product getProduct(String name, double volume, int temperature) {
        ArrayList<Product> tempProduct = new ArrayList<>();
        for (Product drH : listProduct) {
            if (drH instanceof HotDrink & drH.getName().equals(name)) {
                if (((HotDrink) drH).getVolume() == volume && ((HotDrink) drH).getTemperature() == temperature) {
                    tempProduct.add((HotDrink) drH);
                }
            }
        }
        return null;
    }

}


