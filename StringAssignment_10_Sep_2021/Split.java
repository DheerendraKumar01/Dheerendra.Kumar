package com.StringAssignment_10_Sep_2021;

public class Split {
	public static void main(String args[]) {
		
		String string = "My,name,is,Dheeru";
		String[] arrayOfString = string.split(",");

		for (String array : arrayOfString)
			System.out.println(array);
	}
}