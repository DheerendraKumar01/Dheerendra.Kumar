package com.java8.LambdaExpression;

interface Circle {
    public void display();
}
 

public class WithLambdaExpressionCircle {
	public static void main(String[] args) {
		 
        int  radius= 9;
        
        // without lambda, square implementation using anonymous class
        Circle d=()-> {
 
            System.out.println("Area of Circle " + (3.14*radius*radius));
 
        };
        d.display();
    }
}