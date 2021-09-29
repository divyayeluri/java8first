package com.learn.java.lambdas;

public class RunnablePractise {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable prior8 run");
            }
        };
        new Thread(runnable).start();

        //java8 runnable
        Runnable runnableLambda = () -> {
            System.out.println("RunnableLambda example");
        };
        new Thread(runnableLambda).start();
    }
}
