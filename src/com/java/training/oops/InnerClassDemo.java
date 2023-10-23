package com.java.training.oops;

class OuterClassA {
    int x = 10;

    class InnerClassB {
        int y = 5;
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        OuterClassA myOuter = new OuterClassA();
        OuterClassA.InnerClassB myInner = myOuter.new InnerClassB();
        System.out.println(myInner.y + myOuter.x);

    }
}

