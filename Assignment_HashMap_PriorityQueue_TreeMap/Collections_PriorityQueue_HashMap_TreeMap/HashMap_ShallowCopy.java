package com.Collections_PriorityQueue_HashMap_TreeMap;
//6. Write a Java program to get a shallow copy of a HashMap instance. 

import java.util.HashMap;


public class HashMap_ShallowCopy {

	public class HashMap_ContainsMappingOrNot {

	}

	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Raj");
		hash_map.put(2, "Ram");
		hash_map.put(3, "Bhanu");
		hash_map.put(4, "White");
		hash_map.put(5, "Bruce");

		// print the map
		System.out.println("The Original map: " + hash_map);

		HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
		new_hash_map = (HashMap) hash_map.clone();
		System.out.println("Cloned map: " + new_hash_map);
	}
}
