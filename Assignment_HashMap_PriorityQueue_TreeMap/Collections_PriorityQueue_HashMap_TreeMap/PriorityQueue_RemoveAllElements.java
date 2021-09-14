package com.Collections_PriorityQueue_HashMap_TreeMap;
//5. Write a Java program to remove all the elements from a priority queue. 

import java.util.PriorityQueue;

public class PriorityQueue_RemoveAllElements {

	public static void main(String[] args) {

		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();

		// use add() method to add values in the Priority Queue
		pq1.add("Rahul");
		pq1.add("Ranjan");
		pq1.add("Shan");
		pq1.add("Thakur");
		pq1.add("Sohan");

		System.out.println("Original Priority Queue: " + pq1);

		// Removing all the elements from the Priority Queue
		pq1.clear();

		System.out.println("The New Priority Queue: " + pq1);
	}

}
