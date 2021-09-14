package com.Collections_PriorityQueue_HashMap_TreeMap;

import java.util.HashMap;

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not. 

public class HashMap_ContainsKeyValue {

	public static void main(String args[]) {
		
		  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		  
		  hash_map.put(1, "Raj");
		  hash_map.put(2, "Ram");
		  hash_map.put(3, "Bhanu");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Bruce");
		  
		  // check if map is empty
		  boolean result = hash_map.isEmpty();
		  
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  
		  // check if map is empty
		  result = hash_map.isEmpty();
		  
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		 }
}
