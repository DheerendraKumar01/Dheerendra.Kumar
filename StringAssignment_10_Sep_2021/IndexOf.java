package com.StringAssignment_10_Sep_2021;

public class IndexOf {
	public static void main(String args[]) {
		String string1 = "My name is Dheerendra";

		int index1 = string1.indexOf("is"); // returns the index of is substring
		int index2 = string1.indexOf("Dheerendra"); // returns the index of index substring
		System.out.println(index1 + "  " + index2);
	}
}