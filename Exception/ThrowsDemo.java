package com.Exception;

public class ThrowsDemo {

	static void validate(int age) throws ArithmeticException {

		if (age < 18) {

			throw new ArithmeticException("Not Valid");

		}
	}

	public static void main(String args[]) {

		try {
			validate(12); //caller
		} catch (Exception e) {

			System.out.println("Handled Here");

		}
	}

}
