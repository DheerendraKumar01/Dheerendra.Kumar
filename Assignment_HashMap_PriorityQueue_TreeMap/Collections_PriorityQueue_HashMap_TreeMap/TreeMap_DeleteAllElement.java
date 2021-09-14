package com.Collections_PriorityQueue_HashMap_TreeMap;

import java.util.TreeMap;

//6. Write a Java program to delete all elements from a given Tree Map. 

public class TreeMap_DeleteAllElement {

	public static void main(String args[]) {

		// Create a tree map
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

		// Put elements to the map
		tree_map1.put("C1", "Rahul");
		tree_map1.put("C2", "Rohan");
		tree_map1.put("C3", "Bhanu");
		tree_map1.put("C4", "Shyam");
		tree_map1.put("C5", "Rohit");

		System.out.println("Orginal TreeMap content: " + tree_map1);
		tree_map1.clear();
		System.out.println("The New map: " + tree_map1);
	}
}
