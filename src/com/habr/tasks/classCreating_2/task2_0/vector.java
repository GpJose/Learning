package com.habr.tasks.classCreating_2.task2_0;


public class vector {
    private int x;
    private int y;
    private int z;
    //конструктор с параметрами в виде списка координат x, y, z
    vector (int x, int y, int z){
        this.x =x;
        this.y =y;
        this.z =z;
    }
    vector (){
        x =(int) (Math.random() * 100);
        y =(int) (Math.random() * 100);
        z =(int) (Math.random() * 100);
    }

    //метод, вычисляющий длину вектора
    public void vectorLength (){
        double LenghtV;
        LenghtV = sqrtVcrt();
        System.out.printf("Vector Length %.2f\n", LenghtV);
    }

    //метод, вычисляющий скалярное произведение
    private double sqrtVcrt() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //метод, вычисляющий векторное произведение с другим вектором
    public int vectorScalar (vector vctr) {
        return (x * vctr.x + y*vctr.y + z * vctr.z);
    }
    public int vectorScalar (int x1, int y1, int z1) {
        return (x*x1 + y*y1 + z*z1);
    }

    //метод, вычисляющий угол между векторами
    public void vectorCos (vector v2){
        int ab = vectorScalar(v2);
        double cosV = sqrtVcrt() * v2.sqrtVcrt();
        System.out.println("Cos: "+ ab/cosV);
    }

    //методы для суммы и разности
    public void vectorSumDiff (vector v2){
        System.out.printf("Sum x:%d y:%d z:%d\n",x+v2.x, y+v2.y, z+v2.z);
        System.out.printf("Different x:%d y:%d z:%d\n",x-v2.x, y-v2.y, z-v2.z);
    }

    //статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    public static vector[] vectorsCreateArr (int n){
        vector[] vectors = new vector[n];
        for (int i =0; i<vectors.length; i++){
            vectors[i] = new vector();
        }
        return vectors;
    }
}
