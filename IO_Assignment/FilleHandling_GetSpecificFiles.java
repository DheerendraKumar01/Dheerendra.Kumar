//2. Write a Java program to get specific files by extensions from a specified folder. 

package com.IO_Assignment;

import java.io.File;
import java.io.FilenameFilter;

public class FilleHandling_GetSpecificFiles {
	
       public static void main(String a[]){
    	   
        File file = new File("D:/Dheeru/");
        
           String[] list = file.list(new FilenameFilter() {
           
        	   @Override
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
           
        for(String f:list){
            System.out.println(f);
        }
    }
}