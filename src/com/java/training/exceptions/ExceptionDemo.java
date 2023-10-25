package com.java.training.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception{

        int[] myNumbers = {1, 2, 3};

        System.out.println(myNumbers.length);

            System.out.println(myNumbers[5]); //breaking - throwing an exception

        System.out.println(myNumbers[2]);
    }
}
