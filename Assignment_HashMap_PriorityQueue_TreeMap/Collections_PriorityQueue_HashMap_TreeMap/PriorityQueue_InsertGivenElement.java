package com.Collections_PriorityQueue_HashMap_TreeMap;
//4. Write a Java program to insert a given element into a priority queue. 

import java.util.PriorityQueue;

public class PriorityQueue_InsertGivenElement {

	public static void main(String[] args) {

		// Create Priority Queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		// use add() method to add values in the Priority Queue
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");

		System.out.println("Original Priority Queue: " + pq1);

		// Inserts the specified element into this priority queue.
		pq1.offer("Blue");

		System.out.println("The New Priority Queue: " + pq1);
	}
}
