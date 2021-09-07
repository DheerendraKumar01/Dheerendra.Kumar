package com.classesobjectdemo;

class DrawingRoom {
	
	 void showDetailsOfDrawingRoom(String name) {
		 
		 System.out.println("List of items: " +name);
	 }
}


class Kitchen {

	 void showDetailsOfDrawingRoom(String name) {
		 
		 System.out.println("Kitchen  items: " +name);
	 }
}

public class MyClassObjectDemo {
	
	public static void main(String args[]) {
		
		DrawingRoom chair = new DrawingRoom(); //Object created for chair
		DrawingRoom table = new DrawingRoom(); //Object created for table
		DrawingRoom sofa = new DrawingRoom(); //Object created for sofa
		
		chair.showDetailsOfDrawingRoom("table"); //calling method using objects 
		table.showDetailsOfDrawingRoom("Jyoti's Table");
		
		Kitchen freeze = new Kitchen();
		freeze.showDetailsOfDrawingRoom("Samsung");
		
	}

}
