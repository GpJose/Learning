package com.habr.tasks.basics_1;
/*
1.0. Максимальное, минимальное и среднее значение
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива

1.2. Поиск простых чисел
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].

1.3. Удаление из массива
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */

import java.util.Scanner;

public class BasicMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements");
        int n = in.nextInt();

        //1.0. Заполните массив случайным числами
        ArrayActions mas = new ArrayActions(n);
        mas.fillArray();

        //1.0. и выведите максимальное, минимальное и среднее значение.
        mas.MinMaxAvg();

        //1.1. сортировка пузырьком
        mas.BubbleSorting();

        //1.3 Удаление из массива
        mas.deleteArray();

        //1.2. Поиск простых чисел
        isSimple();

    }

    //1.2. Поиск простых чисел
    private static void isSimple(){
        boolean check;
        System.out.println("Простые числа от 2 до 100:");
        for (int i =2; i<100; i++){
            check = false;
            for (int k = 2; k<i; k++){
                if(i%k==0){
                    check=true;
                    break;
                }
            }
            if(!check){
                System.out.print(i+" ");
            }
        }
    }
}