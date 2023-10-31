package com.java.training.oops;

import java.util.*;

class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   @Override
    public String toString() {
        return "Person: {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Srini", "Komatip");
        Person person2 = new Person("Deepak", "K");

        HashMap<String, Person> personHashMap = new HashMap<>();
        personHashMap.put(person1.getLastName(), person1);
        personHashMap.put(person2.getLastName(), person2);

        for (String key : personHashMap.keySet()){
            Person person = personHashMap.get(key);
            System.out.println(person.getFirstName());
        }

    }

}
