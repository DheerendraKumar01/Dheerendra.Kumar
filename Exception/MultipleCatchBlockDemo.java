package com.Exception;

//handled by java
public class MultipleCatchBlockDemo {

	
	public static void main(String args[]) {

			int array[] = {1,2,3,4};
			
			try {
				
				System.out.println(array[6]);
				
			} 
			catch (ArithmeticException e) {

				System.out.println("Got some technical problem " + e);

			}
			
			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Got some technical problem " + e);

			}
			catch (Exception e) {

				System.out.println("Got some technical problem " + e);

			}
		}
	

}
