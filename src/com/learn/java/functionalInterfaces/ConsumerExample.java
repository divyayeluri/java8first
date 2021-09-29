package com.learn.java.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        //System.out.println("program works");
        c1.accept( "java8");

    }
}
