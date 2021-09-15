//8. Write a Java program to read a plain text file. 
package com.IO_Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_ReadPlainTextFile {

	public static void main(String a[]){
		
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:/Dheeru/abc.txt"));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             
             br.close();
             
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}
