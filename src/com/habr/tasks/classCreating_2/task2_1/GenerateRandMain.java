package com.habr.tasks.classCreating_2.task2_1;

/*
Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
 */

import java.util.Objects;
import java.util.Scanner;

public class GenerateRandMain {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String y;
        int [] count = {1,2,3,4,5};
        int [] weight = {1,3,5,8,20};
        GenRand myClass = new GenRand(count,weight);
        do {
            System.out.println(myClass.getElement());
            System.out.println("End = 0;");
            y=in.nextLine();
        }while (!Objects.equals(y, "0"));
    }
}
