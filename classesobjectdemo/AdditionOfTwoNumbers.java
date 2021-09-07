package com.classesobjectdemo;

class AdditionOfTwoNumbers1 {

	void showResults() {
		
		int num1= 9;
		int num2 = 10;
		
		int temp = num1 + num2; //logic part
		
		System.out.println("Addition of two numbers : " + temp);
		
	}
	
	void showResultsByParameter(int num1, int num2) {
	int temp = num1 + num2;
	System.out.println("Addition of two number : " + temp);
	}
	
}

//Client Program

public class AdditionOfTwoNumbers{
	
	public static void main(String args[]) {
		
		//Create an object class AdditionOfTwoNumbers
	
		AdditionOfTwoNumbers1 additionOfTwoNumber  = new AdditionOfTwoNumbers1();
		additionOfTwoNumber.showResults();
	
		
	}
}