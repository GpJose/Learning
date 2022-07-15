package com.habr.tasks.recursion_3.task3_0;

/*
Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
Используйте перебор и двоичный поиск для решения этой задачи.
Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
 */

import java.util.Arrays;

public class BinarySearchMain {
    public static void main (String [] args) {
        MyArray array = new MyArray();
        array.fill();
        int n = (int) (Math.random() * 100000000);
        array.binarySearch(n);
        array.search(n);
    }
}

class MyArray {
    int [] ar;
    protected long start;
    protected long end;
    MyArray () {
        ar = new int[100000000];
        start = 0;
        end = 0;
    }
    protected void getText () {
        System.out.println("time: "+ (end - start) + " ms");
    }
    public void fill(){
        start = System.currentTimeMillis();
        System.out.println("Filling");
        for (int i = 0; i<ar.length;i++) {
            ar[i] =(int) (Math.random() * 100000000);
        }
        System.out.println("Array was filled");
        end = System.currentTimeMillis();
        getText();
    }
    public void binarySearch(int n ){
        start = System.currentTimeMillis();
        System.out.println("Sorting");
        Arrays.sort(ar);
        end = System.currentTimeMillis();
        System.out.println("Array was sorted");
        getText();
        start = System.currentTimeMillis();
        int g = Arrays.binarySearch(ar,n);
        if( g >=0 ) {
            System.out.println(n +" Found: " + " index ["+g+"]: " + ar[g]);
        } else System.out.println(n+" Not found");
        end = System.currentTimeMillis();
        System.out.print("Binart search ");
        getText();
    }
    public void search (int n){
        start = System.currentTimeMillis();
        boolean find = false;
        for (int a: ar ) {
            if(a==n) {
                System.out.println("Found");
                find = true;
                break;
            }
        }
        if (!find) System.out.println("Not found");
        end =  System.currentTimeMillis();
        System.out.print("Force search ");
        getText();
    }
}
