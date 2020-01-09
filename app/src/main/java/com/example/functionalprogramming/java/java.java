package com.example.functionalprogramming.java;

import java.util.ArrayList;
import java.util.List;

public class java {

    public static void main(String[] args) {

        List li = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            li.add(i);
        }

        System.out.println(li);
        System.out.println(java.class.getResource(""));
    }
}
