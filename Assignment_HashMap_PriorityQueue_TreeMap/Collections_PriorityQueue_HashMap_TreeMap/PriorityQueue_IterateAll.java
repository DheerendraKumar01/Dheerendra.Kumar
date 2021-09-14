package com.Collections_PriorityQueue_HashMap_TreeMap;

import java.util.PriorityQueue;

//2. Write a Java program to iterate through all elements in priority queue. 

public class PriorityQueue_IterateAll {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("Rahul");
		pq.add("Ranjan");
		pq.add("Shan");
		pq.add("Thakur");
		pq.add("Sohan");

		System.out.println("Elements of the Priority Queue: ");
		
		// iterate the Priority Queue
		for (String element : pq) {
			System.out.println(element);
		}
	}
}
