package com.PracticeAssignmentClassesAndObject;

class Student1{
	void showResultOfSam() {
		String name = "Sam";
		int phone_no = 938849943;
		int roll_no = 10;
		String address = "Bareilly";
		System.out.println("Details of 1st are "+name+ " " + phone_no + " " + roll_no + " " + address);
	}

	void showResultOfJohn() {
		String name = "John";
		int phone_no = 898667889;
		int roll_no = 16;
		String address = "Sitapur";
		System.out.println("Details of 2nd are "+name+" " + phone_no +" " + roll_no + " " + address);
	}
}

public class StudentData {
	public static void main(String args[]) {
		Student1 student = new Student1();
		student.showResultOfSam();
		student.showResultOfJohn();
	}
}