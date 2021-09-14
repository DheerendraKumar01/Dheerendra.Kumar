package com.Collections_PriorityQueue_HashMap_TreeMap;
//1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue. 

import java.util.PriorityQueue;

public class PriorityQueue_Create {

	public static void main(String[] args) {
		
		  PriorityQueue<String> queue=new PriorityQueue<String>(); 
		  
		  queue.add("Rahul");
		  queue.add("Ranjan");
		  queue.add("Shan");
		  queue.add("Thakur");
		  queue.add("Sohan");
		  
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		 }
}
