package com.java.training.oops;

import java.util.Objects;

class Person {

    private String firstName;
    private String lastName;

    public Person(){
        this.firstName = "Srini";
        this.lastName = "Komatip";

    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println(person1.hashCode());

        Person person2 = new Person("Srini", "Komatip");
        System.out.println(person2);

        if(person1.equals(person2)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

    }

}
