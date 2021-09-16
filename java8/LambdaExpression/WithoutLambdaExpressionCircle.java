package com.java8.LambdaExpression;

interface Circle1 {
    public void display();
}
 
public class WithoutLambdaExpressionCircle {
    public static void main(String[] args) {

        int radius = 91;
 
        // without lambda, square implementation using anonymous class
        Circle s = new Circle() { //interface object
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Area Of Circle " + (3.14*radius*radius));
			}
        };
        s.display();
    }
}