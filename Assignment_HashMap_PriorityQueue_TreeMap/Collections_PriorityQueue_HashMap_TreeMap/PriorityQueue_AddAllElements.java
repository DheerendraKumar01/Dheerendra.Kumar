package com.Collections_PriorityQueue_HashMap_TreeMap;
//3. Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;

public class PriorityQueue_AddAllElements {

	public static void main(String[] args) {

		PriorityQueue<String> queue1 = new PriorityQueue<String>();

		queue1.add("Rahul");
		queue1.add("Rohit");
		queue1.add("Vikrant");

		System.out.println("Priority Queue1: " + queue1);

		PriorityQueue<String> queue2 = new PriorityQueue<String>();

		queue2.add("Sushil");
		queue2.add("Divya");
		queue2.add("Sunita");

		System.out.println("Priority Queue2: " + queue2);

		// adding queue2 to queue1
		queue1.addAll(queue2);
		System.out.println("New Priority Queue1: " + queue1);
	}
}
