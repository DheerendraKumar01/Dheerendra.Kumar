package com.Assignment_08_Sep_2021;

interface My {
	
	int x = 10;
		
}

interface My1 {
	
	int x = 20;
}

class InterfaceDemo1 implements My, My1 {
	void display() {
		System.out.println("Interface");
	}
	
}
class InterfaceDemo {
public static void main(String args[]) {
		
		
		System.out.println(My.x);
		System.out.println(My1.x);
	}
}