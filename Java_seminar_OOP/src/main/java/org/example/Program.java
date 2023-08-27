package org.example;
/**
 * Лукьянов Анатолий
 * группа 4619
 */


import java.util.*;

public class Program {
    public static void main(String[] args) {
        Product shokolate1 = new Food("twix", 100, 5, new GregorianCalendar(2023, 0,10), 75);
        Product shokolate2 = new Food("mars", 100, 5, new GregorianCalendar(2023, 11, 12), 75);
        Product shokolate3 = new Food("alenka", 100, 5, new GregorianCalendar(2023,03,15), 100);
        Product shokolate4 = new Food("mishka", 100, 5, new GregorianCalendar(2023,10,23), 25);
        Product drink3 = new Beverage("limonad", 50, 20, new GregorianCalendar(2023, 10, 5),200);
        Product drink4 = new Beverage("milk", 45, 15, new GregorianCalendar(2023, 9, 25),200);

        TorgAvtomat list = new TorgAvtomat();
        List<Product> myList = new ArrayList<>();
        myList.add(shokolate1);
        myList.add(shokolate2);
        myList.add(shokolate3);
        myList.add(shokolate4);

        myList.add(drink3);
        myList.add(drink4);

        list.initProduct(myList);

        String name = "mars";
        System.out.println(list.getProduct(name).toString());

        String name2 = "milk";
        System.out.println(list.getProduct(name2).toString());

        TorgAvtomatHotDrink listHD = new TorgAvtomatHotDrink();
        List<Product> myListHD = new ArrayList<>();
        Product drink1 = new HotDrink("tea", 10, 5, new GregorianCalendar(2023,0,10), 150, 60);
        Product drink2 = new HotDrink("coffee", 100, 5, new GregorianCalendar(2023, 11, 12), 120, 65);
        myListHD.add(drink1);
        myListHD.add(drink2);

        list.initProduct(myListHD);



        String name1 = "tea";
        System.out.println(list.getProduct(name1).toString());






    }
}
