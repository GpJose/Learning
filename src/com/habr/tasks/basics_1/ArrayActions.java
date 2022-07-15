package com.habr.tasks.basics_1;


//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

import java.util.Scanner;
import java.util.Arrays;

public class ArrayActions{
    private int [] mas;
    ArrayActions (int n){
        mas = new int[n];
    }
    ArrayActions (){
        mas = new int[10];
    }

    private void GetArray(){
        System.out.printf("Array[%d]:",mas.length);
        for (int ar : mas) {
            System.out.print(ar + " ");
        }
        System.out.println();
    }

    //заполняет массив случайными числами от 0 до 100.
    public void fillArray(){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        GetArray();
        System.out.println("!Array filled!");
    }

    //выводит максимальное, минимальное, среднее значение.
    public void MinMaxAvg() {
        int min = mas[0], max = mas[0];
        double avg = mas[0];
        for (int i = 1; i < mas.length; i++) {
            max = Math.max(max,mas[i]);
            min = Math.min(min,mas[i]);
            avg +=mas[i];
        }
        avg = avg / mas.length +1;
        System.out.printf("Max: %d \nMin: %d\nAvg: %.2f\n",max,min,avg);
    }

    //сортировка пузырьком
    public void BubbleSorting () {
        boolean action;
        for (int i = 0; i<mas.length; i++){
            action = false;
            for (int k = 0; k<mas.length-1; k++){
                if (mas[k+1]>mas[k]){
                    ArraySwap(k);
                    action = true;
                }
            }
            if(!action){
                break;
            }
        }
        GetArray();
        System.out.println("!Bubble Sorting done!");
    }
    private void ArraySwap (int i){
        int temp = mas[i+1];
        mas[i+1] = mas[i];
        mas[i] = temp;
    }
    //1.3 Удаление из массива
    public void deleteArray(){
        GetArray();
        Scanner in = new Scanner(System.in);
        System.out.print("Delete:");
        int number = in.nextInt();

        int count = 0;
        //заменяет элементы массива, пропуская введенное значение, с двигом в количество найденных значений
        for(int i = 0; i< mas.length; i++){
            if(mas[i] == number){
                count++;
            }
            else{
                mas[i - count] = mas[i];
            }
        }
        //возвращает введенный массив, уменьшая его на кол-во найденных значений.
        mas = Arrays.copyOf(mas, mas.length - count);
        System.out.printf("Number %d has been removed\n", number);
        GetArray();
    }
}