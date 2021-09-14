package com.Collections_PriorityQueue_HashMap_TreeMap;
//7. Write a Java program to compare two priority queues.

import java.util.PriorityQueue;

public class PriorityQueue_Comparision {

	public static void main(String[] args) {
		
		  // Create a empty Priority Queue
		        PriorityQueue<String> pq1 = new PriorityQueue<String>();
		        
		     // use add() method to add values in the Priority Queue
		          pq1.add("Rohit");
		          pq1.add("Sohan");
		          pq1.add("Shyamu");
		          pq1.add("Rahul");
		          
		          System.out.println("First Priority Queue: "+pq1);
		          
		          PriorityQueue<String> pq2 = new PriorityQueue<String>();  
		          
		          pq2.add("Rohit");
		          pq2.add("Rohan");
		          pq2.add("Shyamu");
		          pq2.add("KL Rahul");
		          
		          System.out.println("Second Priority Queue: "+pq2);
		          
		          //comparison output in Priority Queue
		         for (String element : pq1){
		             System.out.println(pq2.contains(element) ? "Yes" : "No");
		          }     
	}
}
