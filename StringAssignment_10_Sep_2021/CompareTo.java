package com.StringAssignment_10_Sep_2021;

public class CompareTo {
	public static void main(String args[]) {

		String name1 = "Dheerendra";
		String name2 = "Dheeru";
		String name3 = "Dheeru";

		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name3));
		System.out.println(name2.compareTo(name3)); // 0 because both are equal

	}
}