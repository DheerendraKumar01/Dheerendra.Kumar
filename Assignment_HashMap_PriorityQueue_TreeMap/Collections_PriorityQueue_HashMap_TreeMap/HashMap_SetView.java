package com.Collections_PriorityQueue_HashMap_TreeMap;
//9. Write a Java program to create a set view of the mappings contained in a map. 

import java.util.HashMap;
import java.util.Set;


public class HashMap_SetView {

	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Raj");
		hash_map.put(2, "Ram");
		hash_map.put(3, "Bhanu");
		hash_map.put(4, "White");
		hash_map.put(5, "Bruce");

		// create set view for the map
		Set set = hash_map.entrySet();
		// check set values
		System.out.println("Set values: " + set);
	}
}
