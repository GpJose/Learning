package com.habr.tasks.classCreating_2.task2_0;


import java.util.Scanner;

public class classMain {
    public static void main (String[] args){

        vector myVector = new vector(22, 11, 33);
        vector myVector2 = new vector();
        myVector.vectorLength();
        System.out.println( myVector.vectorScalar(myVector2));
        myVector.vectorCos(myVector2);
        myVector.vectorSumDiff(myVector2);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        vector[] myVectorArr = vector.vectorsCreateArr(n);
    }
}
