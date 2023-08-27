package org.example;
/**
 * Лукьянов Анатолий
 * группа 4619
 */

import java.util.ArrayList;
import java.util.List;

public class TorgAvtomat {
    List<Product> listProduct = new ArrayList<>();

    public TorgAvtomat(List<Product> myList) {
    }

    public TorgAvtomat() {

    }


    public void initProduct(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product el : listProduct) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }

}
