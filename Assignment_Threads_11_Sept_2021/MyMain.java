package com.Assignment_Threads_11_Sept_2021;

/*
 1.create a class called MyCurrentDate that implements Runnable interface.
The MyCurrentDate class displays the current date and time 10 times, 
with 100 milli seconds interval - use sleep() method for this interval.

Create a class called MyMain, which contains main() method, in which 3 instances of 
MyCurrentDate threads are being run.
*/

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class MyCurrentDate implements Runnable {
	// private static char[] ofPattern;

	public void run() {
		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(100);

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
			}

		} catch (Exception e) {

			System.out.println("exception caught" + e);

		}
	}
}

public class MyMain {

	public static void main(String ar[]) {

		MyCurrentDate mycurrentdate = new MyCurrentDate();// created the object of a class

		mycurrentdate.run();

	}

}