package com.example.functionalprogramming.java;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestAnno {

    public static final int M = 0;
    public static final int L = 1;


    @IntDef({L, M})
    @Retention(RetentionPolicy.SOURCE)
    public @interface cc{}


    public void fun1(@cc int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestAnno testAnno = new TestAnno();
        testAnno.fun1(M);
    }
}
