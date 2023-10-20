package com.java.training.oops;

interface Car {
    void drive();
}

class Tesla implements Car {
    public void drive(){
        System.out.println("Drive Safely");
    }
}

public class AbstractClassDemo {
    public static void main (String args[]) {
        Tesla obj = new Tesla();
        obj.drive();
    }
}