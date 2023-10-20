package com.java.training.basics;

public class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        //An enum is a special "class" that represents a group of constants..ex. month, days, colors
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        //loop through enums
        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
}
