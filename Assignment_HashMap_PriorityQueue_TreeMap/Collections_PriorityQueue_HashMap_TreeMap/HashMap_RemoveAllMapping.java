package com.Collections_PriorityQueue_HashMap_TreeMap;

import java.util.HashMap;

//4. Write a Java program to remove all of the mappings from a map. 

public class HashMap_RemoveAllMapping {

	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Raj");
		hash_map.put(2, "Rohan");
		hash_map.put(3, "Bhanu");
		hash_map.put(4, "Rahul");
		hash_map.put(5, "Sham");

		// print the map
		System.out.println("The Original linked map: " + hash_map);

		// Removing all the elements from the linked map
		hash_map.clear();
		  
		  System.out.println("The New map: " + hash_map);
		 }
}
