package com.Collections_PriorityQueue_HashMap_TreeMap;
//6. Write a Java program to count the number of elements in a priority queue. 

import java.util.PriorityQueue;

public class PriorityQueue_CountNoOfElement {

	public static void main(String[] args) {

		// create an empty Priority Queue
		PriorityQueue<String> pq = new PriorityQueue<String>();

		// use add() method to add values in the Priority Queue
		pq.add("Rahul");
		pq.add("Ranjan");
		pq.add("Shan");
		pq.add("Thakur");
		pq.add("Sohan");

		System.out.println("Priority Queue: " + pq);
		System.out.println("Size of the Priority Queue: " + pq.size());
	}
}
