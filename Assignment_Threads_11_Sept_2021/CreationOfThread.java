/*
 2. Write a program to illustrate creation of threads using runnable
class.(start method start each of the newly created thread. Inside the run
method there is sleep() for suspend the thread for 5000 milliseconds).
 */



package com.Assignment_Threads_11_Sept_2021;


  class CreationOfThread1 extends Thread {

	public void run() { // imp method given by thread class java

		// logic part
		try {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(5000);
				System.out.println(i);
			}

		} catch (Exception e) {

			System.out.println("exception caught" + e);

		}

	}

}

public class CreationOfThread {

	public static void main(String ar[]) {

		CreationOfThread1 creationOfthread1 = new CreationOfThread1();// created the object of a class

		creationOfthread1.start();
	}
}