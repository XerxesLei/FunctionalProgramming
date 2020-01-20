package com.example.functionalprogramming.java;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TestAnno {

    public static final int M = 2;


    @IntDef({M})
    @Retention(RetentionPolicy.SOURCE)
    public @interface cc{}


    public static void fun1(@cc int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        fun1(M);
    }
}
