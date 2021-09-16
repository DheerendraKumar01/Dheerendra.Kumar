package com.Collections_LinkedList;

import java.util.LinkedList;

public class InsertFirst_LastPosition {
	public static void main(String[] args) {
		LinkedList<Integer> insertFirst_LastPosition= new LinkedList<Integer>();
		
		//Adding element using add method
		insertFirst_LastPosition.add(10);
		insertFirst_LastPosition.add(20);
		insertFirst_LastPosition.add(30);
		insertFirst_LastPosition.add(40);
		
		System.out.println("LinkedList before insert : "+insertFirst_LastPosition);
		
		//insert element at first position
		insertFirst_LastPosition.addFirst(05);
		
		//insert element at last position
		insertFirst_LastPosition.addLast(50);
		
		System.out.println("LinkedList after inserting first and last elements are : "+insertFirst_LastPosition);
	}
}