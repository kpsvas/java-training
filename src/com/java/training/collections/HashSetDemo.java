package com.java.training.collections;

import java.util.HashSet;
import java.util.Iterator;

//A HashSet is a collection of items where every item is unique

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase("BMW")) {
                it.remove();
            }
        }

    }
}
