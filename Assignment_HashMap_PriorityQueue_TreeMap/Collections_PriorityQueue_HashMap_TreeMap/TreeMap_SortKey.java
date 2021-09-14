package com.Collections_PriorityQueue_HashMap_TreeMap;
//7. Write a Java program to sort keys in Tree Map by using comparator.

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_SortKey {

	public static void main(String args[]) {

		TreeMap<String, String> tree_map1 = new TreeMap<String, String>(new sort_key());

		// Put elements to the map
		tree_map1.put("C1", "Rahul");
		tree_map1.put("C2", "Rohan");
		tree_map1.put("C3", "Bhanu");
		tree_map1.put("C4", "Shyam");
		tree_map1.put("C5", "Rohit");

		System.out.println(tree_map1);
	}
}

class sort_key implements Comparator<String> {
	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}
