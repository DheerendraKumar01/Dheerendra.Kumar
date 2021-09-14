package com.Collections_PriorityQueue_HashMap_TreeMap;
//5. Write a Java program to get all keys from the given a Tree Map. 

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_GetAllKey {

	 public static void main(String args[]){  
		 
		   // Create a tree map
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();     
		   
		   // Put elements to the map 
		   tree_map1.put("C1", "Rahul");
			tree_map1.put("C2", "Rohan");
			tree_map1.put("C3", "Bhanu");
			tree_map1.put("C4", "Shyam");
			tree_map1.put("C5", "Rohit");
		    
		 Set<String> keys = tree_map1.keySet();
		        for(String key: keys){
		            System.out.println(key);
		        }
		    }
}
