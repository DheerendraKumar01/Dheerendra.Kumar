package com.StringAssignment_10_Sep_2021;

public class EqualIgnoreCase {
	public static void main(String args[]) {

		String string1 = "Dheerendra";
		String string2 = "Dheerendra";
		String string3 = "DHEERENDRA";
		String string4 = "dheeru";

		System.out.println(string1.equalsIgnoreCase(string2));// true because content and case both are same
		System.out.println(string1.equalsIgnoreCase(string3));// true because case is ignored
		System.out.println(string1.equalsIgnoreCase(string4));// false because content is not same

	}
}