package com.example.functionalprogramming.java;

public class TestSync {

    public synchronized static void fun1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("fun1");
    }
    public void fun3() {
        synchronized (TestSync.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("fun3");
        }
    }

    public void fun2() {
        System.out.println(System.currentTimeMillis());
        System.out.println("fun2");
    }

    public synchronized void fun4() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("fun4");
    }

    public void fun5() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("fun5");
        }
    }

    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        System.out.println(current);
        final TestSync testSync = new TestSync();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                fun1();
//                testSync.fun3();
                testSync.fun2();
                testSync.fun4();
                testSync.fun5();
            }
        }

        ).start();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
//                        fun1();
//                        testSync.fun3();
                        testSync.fun2();
                        testSync.fun4();
                        testSync.fun5();
                    }
                }
        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
//                        fun1();
//                        testSync.fun3();
                        testSync.fun2();
                        testSync.fun4();
                        testSync.fun5();
                    }
                }
        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
//                        fun1();
//                        testSync.fun3();
                        testSync.fun2();
                        testSync.fun4();
                        testSync.fun5();
                    }
                }
        ).start();
    }
}
