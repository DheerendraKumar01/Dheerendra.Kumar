//1. Write a Java program to get a list of all file/directory names from the given. 

package com.IO_Assignment;

import java.io.File;
import java.util.Date;

public class FileHandling_GetList {
	
     public static void main(String a[])
     
     {
        File file = new File("D:/Dheeru/");
        String[] fileList = file.list();
        
        for(String name:fileList){
            System.out.println(name);
        }
    }
}