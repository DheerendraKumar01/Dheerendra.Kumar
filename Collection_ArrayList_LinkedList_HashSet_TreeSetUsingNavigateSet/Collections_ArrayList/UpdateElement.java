package com.Collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
	public static void main(String[] args) {
		List<String> updateElement=new ArrayList<String>();
		
		//Element are added using add method
		
		updateElement.add("vivek");
		updateElement.add("satyam");
		updateElement.add("raman");
		updateElement.add("dheeru");
		
		System.out.println("Before Update Arraylist are : "+updateElement);
		
		updateElement.set(1,"satyam tripathi");
		
		//updating index no. 1 (satyam to satyam tripathi)
		
		System.out.println("After update Arraylist are : "+updateElement);
	}
}