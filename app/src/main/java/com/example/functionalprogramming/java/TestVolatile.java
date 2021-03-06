package com.example.functionalprogramming.java;

public class TestVolatile {
    //volatile 不保证原子性 只能保证 单次读或者写是最新的

    private static volatile int i = 0;

    public static void main(String[] args) {
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r).start();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();
    }

    private static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("修改值");
            i = 6;
        }
    };

    private static Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("读取值");
            System.out.println(i);
        }
    };
}
