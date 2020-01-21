package com.example.functionalprogramming.java;

import org.jetbrains.annotations.NotNull;

public class Sort {

    //冒泡排序
    private static void bubbleSort(int[] a) {
        int[] arr = new int[a.length];
        System.arraycopy(a,0, arr, 0, a.length);
        long start = System.currentTimeMillis();
        int temp;
        //n个数 比较n-1趟
        long count = 0, compare = 0, swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            //相邻的俩个依次比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;
                compare++;
                if (arr[j] > arr[j+1]) {
                    swap++;
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        System.out.print("冒泡耗时 :");
        System.out.println(System.currentTimeMillis() - start);
        System.out.printf("冒泡排序遍历次数:%d---比较次数:%d---交换次数:%d%n", count, compare, swap);
//        System.out.println();
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();

        //优化 是否需要继续比较 增加标记 无交换 数据已经排好不需要交换
    }

    private static void selectSort(@NotNull int[] a) {
        int[] arr = new int[a.length];
        System.arraycopy(a,0, arr, 0, a.length);
        long start = System.currentTimeMillis();
        int min;
        int temp;
        long count = 0, compare = 0, swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                compare++;
                min = arr[j] > arr[min] ? min : j;
            }
            if (i != min) {
                swap++;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.print("选择排序耗时 :");
        System.out.println(System.currentTimeMillis() - start);
        System.out.printf("选择排序遍历次数:%d---比较次数:%d---交换次数:%d%n", count, compare, swap);

//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
    }

    private static void insertSort(@NotNull int[] a) {
        int[] arr = new int[a.length];
        System.arraycopy(a,0, arr, 0, a.length);
        long start = System.currentTimeMillis();
        int temp;
        long count = 0, compare = 0, swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                count++;
                compare++;
                if (arr[j] < arr[j-1]) {
                    swap++;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        System.out.print("插入排序耗时 :");
        System.out.println(System.currentTimeMillis() - start);
        System.out.printf("插入排序遍历次数:%d---比较次数:%d---交换次数:%d%n", count, compare, swap);

//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
    }

    private static void quickSortWrap(int[] a) {
        int[] arr = new int[a.length];
        System.arraycopy(a,0, arr, 0, a.length);
        long start = System.currentTimeMillis();
        int l = 0, r = arr.length - 1;
        int[] c = {0,0,0};
        quickSort(arr, l, r, c);
        System.out.print("快速排序耗时 :");
        System.out.println(System.currentTimeMillis() - start);
        System.out.printf("快速排序遍历次数:%d---比较次数:%d---交换次数:%d%n", c[0], c[1], c[2] / 3);
    }

    private static void quickSort(int[] a, int l, int r, int[] c){
        if(l>=r)
            return ;
        int i = l; int j = r; int key = a[l];//选择第一个数为key
        while(i<j){
            c[0]++;
            c[1]++;
            while(i<j && a[j]>=key)//从右向左找第一个小于key的值
            {
                c[1]++;
                j--;
            }
            if(i<j){
                c[1]++;
                j--;
                c[2]++;
                a[i] = a[j];
                i++;
            }
            while(i<j && a[i]<key)//从左向右找第一个大于key的值
            {
                c[1]++;
                i++;
            }

            if(i<j){
                c[1]++;
                c[2]++;
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        c[2]++;
        quickSort(a, l, i-1, c);//递归调用
        quickSort(a, i+1, r, c);//递归调用
    }


    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        bubbleSort(arr);
        selectSort(arr);
        insertSort(arr);
        quickSortWrap(arr);
        times();
    }

    private static void times() {
        int a = 0;
//        long start0 = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//        }
//        System.out.println("->: " + (System.currentTimeMillis() - start0));

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a=i;
        }
        System.out.println("=: " + (System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a = a+i;
        }
        System.out.println("+ & =: " + (System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a = a-i;
        }
        System.out.println("- & =: " + (System.currentTimeMillis() - start2));


        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a = a*i;
        }
        System.out.println("* & =: " + (System.currentTimeMillis() - start3));

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            a = a/(i + 1);
        }
        System.out.println("/ & =: " + (System.currentTimeMillis() - start4));

        long start5 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            if (a > 0);
        }
        System.out.println(">: " + (System.currentTimeMillis() - start5));

    }
}
