package com.PracticeAssignmentClassesAndObject;


import java.util.Scanner;  

class Area1{
	int length,breadth;
	void setDim(int l,int b) {
		length = l;
		breadth = b;
	}
	int getArea() {
		return length * breadth;
	}
}

public class Area {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int length = scanner.nextInt();

		System.out.println("Enter First Number : ");
		int breadth = scanner.nextInt();

		//area 
		Area1 area1 = new Area1();
		area1.setDim(length,breadth);	
		System.out.println("Area of Rectangle : "+area1.getArea());	
		}
	}