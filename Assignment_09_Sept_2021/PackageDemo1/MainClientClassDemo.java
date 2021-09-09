package com.PackageDemo1;

import com.AdditionNumber.AdditionService; // imported the AdditionService package
import com.DivideNumber.DivisionService; // imported the DivisionService Package
import com.MultiplicationNumber.MultiplicationService; // imported the MultiplicationService package
import com.OddEvenNumber.OddEvenService; //imported the OddEvenService package
import com.SubtractionNumber.SubtractionService; // imported the SubtractionService package

public class MainClientClassDemo {

public static void main(String args[]) {
		
		AdditionService addition = new AdditionService();
		
		int ResultAddition = addition.DisplayAddition(4, 8);
		
		SubtractionService subtraction = new SubtractionService();
		
		int ResultSubtraction = subtraction.DisplaySubtraction(8, 4);
		
		MultiplicationService multiplication = new MultiplicationService();
		
		int ResultMultiplication = multiplication.DisplayMultiplication(10, 20);
	
		DivisionService division = new DivisionService();
		
		int ResultDivision = division.DisplayDivision(80, 20);
		
		OddEvenService OddEven = new OddEvenService();
		
		String ResultOddEven = OddEven.Even(10);
		
		
		System.out.println("Addition is:  " + ResultAddition);
		System.out.println("Subtraction is:  " + ResultSubtraction);
		System.out.println("Multiplication is:  " + ResultMultiplication);
		System.out.println("Division is:  " + ResultDivision);
		System.out.println("Number is:  " + ResultOddEven);
		
	
	}
}
