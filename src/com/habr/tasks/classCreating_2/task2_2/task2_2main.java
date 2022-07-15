package com.habr.tasks.classCreating_2.task2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class task2_2main {
    public static void main (String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(6);
        lst.add(11);
        lst.add(13);
        lst.add(32);
        lst.add(44);
        Iterator<Integer> iterator = lst.iterator();

        Integer line;

        while (iterator.hasNext()) {
            line = iterator.next();
            if (line.equals(11)) {
                iterator.remove();
            }
        }

        System.out.println(lst);
    }
}

