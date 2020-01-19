package com.example.functionalprogramming.java;

import android.graphics.Point;

public class TestClass {

    private float x = 0f;

    public Float getX(){
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }
    public static void func(){
        System.out.println("func");
    }

    class Ts extends TestClass{
    }
}
