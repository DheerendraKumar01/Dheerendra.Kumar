package com.Collections_PriorityQueue_HashMap_TreeMap;
//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. 

import java.util.TreeMap;

public class TreeMap_MappingAssociate {

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
		System.out.println("Greatest key: " + tree_map1.firstEntry());
		System.out.println("Least key: " + tree_map1.lastEntry());
	}
}
