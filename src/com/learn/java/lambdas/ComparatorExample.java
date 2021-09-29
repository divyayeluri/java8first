package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of Comparator is" + (comparator.compare(3, 4)));
        //java8 comparator
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) ->
        {return b.compareTo(a);};
        System.out.println("Result of ComparatorLambda is " + (comparatorLambda.compare(3, 4)));

    }
}
