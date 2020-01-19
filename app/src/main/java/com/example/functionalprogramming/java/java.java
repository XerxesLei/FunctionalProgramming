package com.example.functionalprogramming.java;

import java.util.ArrayList;
import java.util.List;

public class java {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("1111111111");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        TestClass t = new TestClass();
        TestClass.func();
    }
}
