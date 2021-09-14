package com.Collections_PriorityQueue_HashMap_TreeMap;
//3. Write a Java program to search a key in a Tree Map. 

import java.util.TreeMap;

public class TreeMap_SearchAKey {

	public static void main(String args[]) {

		// Create a tree map
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

		// Put elements to the map
		tree_map1.put("C1", "Rahul");
		tree_map1.put("C2", "Rohan");
		tree_map1.put("C3", "Bhanu");
		tree_map1.put("C4", "Shyam");
		tree_map1.put("C5", "Rohit");
		System.out.println(tree_map1);
		
		if (tree_map1.containsKey("C1")) {
			System.out.println("The Tree Map contains key C1");
		} else {
			System.out.println("The Tree Map does not contain key C1");
		}
		if (tree_map1.containsKey("C5")) {
			System.out.println("The Tree Map contains key C5");
		} else {
			System.out.println("The TreeMap does not contain key C5");
		}
	}
}
