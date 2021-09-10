package com.Exception;

public class ThrowDemo {

	static void validate(int age) {

		if (age < 18) {

			throw new ArithmeticException("Not Valid for vote");

		} else {
			System.out.println("Valid for vote");
		}
	}

	public static void main(String args[]) {

		validate(12);
	}

}
