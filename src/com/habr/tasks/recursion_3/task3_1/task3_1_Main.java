package com.habr.tasks.recursion_3.task3_1;

/*
Задача:

Найдите корень уравнения
$cos(x^5) + x^4 - 345.3 * x - 23 = 0$

на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
Используйте для этого метод деления отрезка пополам (и рекурсию).
 */
public class task3_1_Main {
    public static void main (String[] args) {
        double x0 = 0;
        double x1 = 10;
        System.out.printf("%.3f",recursion(x0, x1));
    }
    private static double recursion(double xN, double xK) {
        if (xK-xN<=0.001){
            System.out.printf("xN:%f xK:%f is answer\n", xN,xK);
            return xN;
        } else System.out.printf("xN: %f xK: %f is not answer\n", xN,xK);
        double dx = ((xK-xN)/2);
        double xi = xN + dx;
        if ((equation(xN) * equation(xi))>0){
            return recursion( xi, xK);
        } else return recursion( xN, xi);
    }
    private static double equation(double x){
         return ( Math.cos( Math.pow(x,5)) + Math.pow(x,4) - (345.3 * x) - 23 );
    }
}
