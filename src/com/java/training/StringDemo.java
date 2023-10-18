package com.java.training;

public class StringDemo {
    public static void main(String[] args) {

        //	The String class is immutable.
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("World!"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World!"); // now original string is changed
        System.out.println(sb);

        String s1 = "Geeks";
        s1.concat("forgeeks"); // s1 is not changed
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Geeks");
        s2.append("forgeeks");// s2 is changed
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Geeks");
        s3.append("forgeeks"); // s3 is changed
        System.out.println("StringBuffer: " + s3);

        // String is immutable whereas StringBuffer and
        // StringBuilder are mutable classes.
        // StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
        // That's why StringBuilder is faster than StringBuffer.

    }
}
