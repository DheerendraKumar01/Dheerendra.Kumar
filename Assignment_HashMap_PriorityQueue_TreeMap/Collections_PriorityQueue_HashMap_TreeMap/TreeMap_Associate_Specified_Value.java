package com.Collections_PriorityQueue_HashMap_TreeMap;
//1. Write a Java program to associate the specified value with the specified key in a Tree Map.

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Associate_Specified_Value {

	public static void main(String args[]){  
		
		   // Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();  
		   
		  // Put elements to the map 
		  tree_map.put(1, "Rahul");
		  tree_map.put(2, "Rohan");
		  tree_map.put(3, "Bhanu");
		  tree_map.put(4, "Shyam");
		  tree_map.put(5, "Rohit");
		    
		   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		 }  
}
