package com.java.training.collections;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Create an ArrayList object of Integers

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        // Integer -> class -
        // int - simple - >

        for(int i=0;i<myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));
        }

        Collections.sort(myNumbers);  // Sort myNumbers

        System.out.println("+++++++++++++++++++++");
        for (Integer i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("+++++++++++++++++++++");

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);  // Sort myNumbers

        for (String i : cars) {
            System.out.println(i);
        }

    }
}
