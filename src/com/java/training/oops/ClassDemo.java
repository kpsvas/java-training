package com.java.training.oops;

public class ClassDemo {
    public static void main(String[] args) {

        Student st1;
        st1 = new Student();
        Student st2 = new Student();

        st1.insertStudentRecord("Jon", "Waley", 25);
        st1.displayInformation();

        st2.insertStudentRecord("Dave", "Taylor", 30);
        st2.displayInformation();

    }
}

class Student {

    private String firstName;
    private String lastName;
    private int age;

    void insertStudentRecord(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void displayInformation(){
        System.out.println("Name: "+ firstName+" "+lastName + "\n" + "Age: " + age);
    }

}