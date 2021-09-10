package com.Exception;

//handled by java
public class ExceptionDemo {

	public static void main(String args[]) {

		int a = 9;
		int b = 0;

		try {

			float c = a / b;

			//System.out.println(c);
		} 

		catch (Exception e) {

			System.out.println("Got some technical problem " + e);

		}
	}
}
