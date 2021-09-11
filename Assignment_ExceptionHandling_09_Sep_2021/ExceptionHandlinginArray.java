package com.Assignment_ExceptionHandling_09_Sep_2021;

import java.util.Scanner;

public class ExceptionHandlinginArray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the Elements of array : ");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		int num1 = scanner.nextInt();
		System.out.println("Enter the element you want to access : " + num1);

		try {
			System.out.println(array[num1]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception Occur");
		}

	}

}