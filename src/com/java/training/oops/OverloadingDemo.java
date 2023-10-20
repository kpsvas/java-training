package com.java.training.oops;

public class OverloadingDemo {

    //overloading, compile polymorphism, ealry binding..
    //overriding, run time polymorphism, late binding

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10,20));
        System.out.println(cal.add(10,20, 30));
    }
}

//method overloading
class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

}
