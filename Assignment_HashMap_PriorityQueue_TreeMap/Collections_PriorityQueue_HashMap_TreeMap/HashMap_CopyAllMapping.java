package com.Collections_PriorityQueue_HashMap_TreeMap;

import java.util.HashMap;

public class HashMap_CopyAllMapping {

	
	public static void main(String args[]) {
		
		  // create two hash maps
		  HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		  
		  // populate hash maps
		  hash_map1.put(1, "Dheeru");
		  hash_map1.put(2, "Abhi");
		  hash_map1.put(3, "Rohit");
		  System.out.println("\nValues in first map: " + hash_map1);
		  
		  hash_map2.put(4, "Ram");
		  hash_map2.put(5, "Sham");
		  hash_map2.put(6, "Raj");
		  System.out.println("\nValues in second map: " + hash_map2);

		  // put all values in secondmap
		  hash_map2.putAll(hash_map1);
		  System.out.println("\nNow values in second map: " + hash_map2);
		 }
		}

