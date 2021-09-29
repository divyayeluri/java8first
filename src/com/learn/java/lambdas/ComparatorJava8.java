package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorJava8 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        System.out.println("Result of Comparator is" + (comparator.compare(3, 4)));
    }
}
