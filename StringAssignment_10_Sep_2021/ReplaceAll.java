package com.StringAssignment_10_Sep_2021;

public class ReplaceAll {
	public static void main(String args[]) {
		String string = "My name i Dheerendra My name i Dheeru";
		String replaceString = string.replaceAll("i", "is"); // replaces all occurrences of "i" to "is"
		System.out.println(replaceString);
	}
}