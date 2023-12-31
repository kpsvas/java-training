package com.java.training.oops;

// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
// Abstract class needs to be extended and its method implemented. 
// It cannot be instantiated.

abstract class Bank{
    abstract int getRateOfInterest();
}
class Chase extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class BOA extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class AbstractRealScenarioExample{
    public static void main(String args[]){

        Bank chase=new Chase();
        System.out.println("Rate of Interest is: "+chase.getRateOfInterest()+" %");
        Bank boa=new BOA();
        System.out.println("Rate of Interest is: "+boa.getRateOfInterest()+" %");
    }
}