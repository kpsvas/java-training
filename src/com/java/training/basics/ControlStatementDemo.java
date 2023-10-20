package com.java.training.basics;

public class ControlStatementDemo {

    public static void main(String[] args) {

        //if-else
        //while
        //for
        //switch
        //break
        //foreach

        int age=20;

        if(age > 18){
            System.out.print("Age is greater than 18");
        }

        int number=13;

        if(number%2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        for(int j=1; j<=10; j++){
            System.out.println(j);
        }

        //complete reference in java ->
        int z=20;

        switch(z){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("default one");
        }

        for(int x=1;x<=10;x++){
            if(x==5){
                continue;
            }
            System.out.println(x);
        }

        int arr[]={12,23,44,56,78};

        for(int k:arr){
            System.out.println(k);
        }

    }
}
