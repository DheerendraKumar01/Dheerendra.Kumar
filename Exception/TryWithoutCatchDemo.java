package com.Exception;

 

//handle by java
public class TryWithoutCatchDemo {

 

    public static void main(String ar[]) {

 

        int array[] = { 1, 2, 3, 4 };

 

        try {

 

            System.out.println(array[6]);//got exception

 

        }

 

        finally {

 

            System.out.println("Message from finally block");

 

        }

 

    }

 

}