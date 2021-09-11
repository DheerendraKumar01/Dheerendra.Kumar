package com.Assignment_ExceptionHandling_09_Sep_2021;

import java.util.Scanner;


public class ExceptioninHandlingInNumber {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you Integer :");
		String num = scanner.nextLine();

		try {
			int num1 = Integer.parseInt(num);
			System.out.println("The square value is : "+ num1 * num1);
		}
		catch(NumberFormatException e){
			System.out.println("Entered input is not a valid format for an integer");
		}
	}


}