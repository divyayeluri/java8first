package com.learn.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample
{
   static Function<String,String> function = (name) -> name.toUpperCase();

    public static void main(String[] args) {
        System.out.println("result is"+ function.apply("java8"));
    }
}
