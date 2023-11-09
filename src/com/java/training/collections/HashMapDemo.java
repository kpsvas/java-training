package com.java.training.collections;

// Import the HashMap class
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));

       // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }


        // Print keys and values
        for (String key : capitalCities.keySet()) {
            System.out.println("key: " + key + " value: " + capitalCities.get(key));
        }

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);

        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        Iterator<String> it = hashtable.keySet().iterator();
        while(it.hasNext())
        {
            System.out.println(hashtable.get(it.next()));
        }

        // Print keys and values
        for (String i : hashtable.keySet()) {
            System.out.println("key: " + i + " value: " + hashtable.get(i));
        }


        //vector, hashtable, enumeration - synchronized collections.

    }
}
