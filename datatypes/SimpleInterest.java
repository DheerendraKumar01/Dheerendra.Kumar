package com.datatypes;

public class SimpleInterest {
	
	public static void main(String args[]) {
		
		//Variable Declaration
		float Principal = 1200.50f;
		float Rate = 10.5f;
		float Time = 2.5f;
		
		//Temp Variable
		float SimpleInterest = (Principal * Rate * Time ) / 100;
		
		System.out.println("Simple Interest is : " +SimpleInterest);
		
	}

}
