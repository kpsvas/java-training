package com.java.training.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers.length);
        try {
            System.out.println(myNumbers[2]); //breaking - throwing an exception
        }catch(Exception e){
            System.out.println("Exception occurred " + e.getMessage());
        }finally {
            System.out.println("Inside finally block");
        }
        System.out.println(myNumbers[2]);
    }
}
