package com.habr.tasks.classCreating_2.task2_1;

public class GenRand {
    int [] count;
    int [] weight;
    int sumWeight;
    int [] borders;
    GenRand (int [] count, int[] weight) {
        this.count = count; this.weight = weight;
        sumWeight = SumWeight();
        borders = new int[sumWeight+1];
    }
    public int getElement () {
        int sumWeight = SumWeight();
        BordersFill();
        int randNumb = (int) (Math.random() * sumWeight+1);
        System.out.println("Sum: "+ sumWeight);
        System.out.println("Rand: "+ randNumb);
        return (borders[randNumb]);
    }
    private int SumWeight(){
        int sum=0;
        for (int j : weight) {
            sum += j;
        }
        return sum;
    }
    private void BordersFill (){
        int check = 0;
        for (int i=0; i<count.length; i++){
            check += weight[i];
            for (int j = check - weight[i]; j<check;j++) {
                borders [j+1] = i+1;
                System.out.print(borders[j]+" ");
            }
        }
        System.out.println();
    }
}
