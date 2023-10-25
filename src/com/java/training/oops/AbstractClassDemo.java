package com.java.training.oops;

// declaring abstract or creating an interface

abstract class Car {
    abstract void start();
}

class Tesla extends Car {
    public void start(){
        System.out.println("Tesla Drive Safely");
    }
}

class Honda extends Car {
    public void start(){
        System.out.println("Honda Drive Safely");
    }
}

public class AbstractClassDemo {
    public static void main (String args[]) {
        Car obj = new Tesla();
        obj.start();
    }
}