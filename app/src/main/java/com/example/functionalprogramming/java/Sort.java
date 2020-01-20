package com.example.functionalprogramming.java;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Sort {

    //冒泡排序
    private static void bubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        int temp;
        //n个数 比较n-1趟
        for (int i = 0; i < arr.length - 1; i++) {

            //相邻的俩个依次比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        System.out.print("冒泡耗时 :");
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println();
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();

        //优化 是否需要继续比较 增加标记 无交换 数据已经排好不需要交换
    }

    private static void selectSort(@NotNull int[] arr) {
        long start = System.currentTimeMillis();
        int min;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j] > arr[min] ? min : j;
            }
            if (i != min) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.print("选择排序耗时 :");
        System.out.println(System.currentTimeMillis() - start);
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
    }

    private static void insertSort(@NotNull int[] arr) {
        long start = System.currentTimeMillis();
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
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
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
    }

    public static void quickSort(int[] a, int l, int r){
        if(l>=r)
            return;

        int i = l; int j = r; int key = a[l];//选择第一个数为key

        while(i<j){

            while(i<j && a[j]>=key)//从右向左找第一个小于key的值
                j--;
            if(i<j){
                a[i] = a[j];
                i++;
            }

            while(i<j && a[i]<key)//从左向右找第一个大于key的值
                i++;

            if(i<j){
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i-1);//递归调用
        quickSort(a, i+1, r);//递归调用
    }


    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
//        System.out.println("冒泡排序");
//        bubbleSort(arr);
//        System.out.println("选择排序");
//        selectSort(arr);
//        System.out.println("插入排序");
//        insertSort(arr);

        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length -1);
        System.out.print("插入排序耗时 :");
        System.out.println(System.currentTimeMillis() - start);
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
    }
}
