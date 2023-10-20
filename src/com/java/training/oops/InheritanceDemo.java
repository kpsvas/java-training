package com.java.training.oops;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}

