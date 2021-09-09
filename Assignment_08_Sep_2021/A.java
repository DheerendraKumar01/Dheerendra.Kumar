package com.Assignment_08_Sep_2021;

abstract class A1 {
	/*Write a program in java to generate an abstract class A also class B 
	inherits the class A. generate the object for class B and 
	display the text “call me from B”.*/
	
	abstract void show(); 

}

	class B extends A1 {
	
	void show() {
		
		System.out.println("Call me from B");
	}
	
		
	}
		public class A {
		public static void main(String args[]) {
			
			B b1 = new B();
			b1.show();
	}
}