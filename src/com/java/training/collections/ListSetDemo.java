package com.java.training.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDemo {

    public static void main(String[] args) {

        // List declaration
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(5);
        l.add(4);

        // Set declaration
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(3);
        s.add(5);
        s.add(4);

        // printing list
        System.out.println("List = " + l);
        // printing Set
        System.out.println("Set = " + s);
    }
}
