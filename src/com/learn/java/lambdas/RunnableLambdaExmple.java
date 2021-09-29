package com.learn.java.lambdas;

public class RunnableLambdaExmple {
    public static void main(String[] args) {
        /**
         * prior java8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable1");
            }
        };
        new Thread(runnable).start();
        //java 8 lambda syntax
    Runnable runnableLambda = () -> {
        System.out.println("Inside RunnableLambda");
        System.out.println("Inside RunnableLambda");
    };


        new Thread(runnableLambda).start();
        Runnable runnableLambda1 = () -> {
            System.out.println("Inside RunnableLambda2");
        };
        new Thread(runnableLambda).start();
        new Thread(()-> System.out.println("Inside RunnableLambda3")).start();
    }
}
