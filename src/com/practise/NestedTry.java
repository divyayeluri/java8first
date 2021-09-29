package com.practise;

public class NestedTry {
        public static void main(String args[]){
            //outer try block
            try{
                //inner try block 1
                try{
                    System.out.println("going to divide by 0");
                    int b =39/0;
                }
                //catch block of inner try block 1
                catch(Exception e)
                {
                    System.out.println(e);
                }
                System.out.println("other statement");
            }

            catch(ArithmeticException e)
            {
                System.out.println("handled the exception (outer catch)");
            }


        }
    }

