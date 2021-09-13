package com.Bank_Account_Interface;

import java.util.Scanner;
import java.lang.Exception.*;

public class userInterface {
	
/// USER INTERFACE FOR ICUC financial institution 
	@SuppressWarnings("resource")
	
	public static void main(String args[])
	{
		try {
		
			//// input Choice from User
		System.out.println("1. Savings Account \n2. Current Account");
		System.out.println("Enter your Choice >---->  ");
		
		Scanner sc = new Scanner(System.in);
		int ch= Integer.parseInt(sc.nextLine());
		 
		///// According to Choice take decisions 
		if(ch==2)
		{
			///  for Current account    
			
			
			System.out.println("Enter the Account number  :");
			String ac= sc.nextLine();
			System.out.println("Enter the Customer Name   :");
			String name= sc.nextLine();
			System.out.println("Enter the Balance amount  :");
			double bal= Double.parseDouble(sc.nextLine());
			System.out.println("Enter the number of years :");
			float n= Float.parseFloat(sc.nextLine());
			
	        CurrentAccount ca= new CurrentAccount(name, ac, bal);
	        ca.calculateMaintenanceCharge(n);

		}
		else if(ch==1)
			{
			
         /// for Saving Account
			
			System.out.println("Enter the Account number  :");
			String ac= sc.nextLine();
			System.out.println("Enter the Customer Name   :");
			String name= sc.nextLine();
			System.out.println("Enter the Balance amount  :");
			double bal= Double.parseDouble(sc.nextLine());
			System.out.println("Enter the number of years :");
			float n= Float.parseFloat(sc.nextLine());
				
			SavingAccount sa= new SavingAccount(name, ac, bal);
			sa.calculateMaintenanceCharge(n);
		

				 
			}
			else {
				System.out.println("invalid input");
				
			}
		}
		catch (Exception e) {
			
			System.out.println(" You Got an Error  "+e);
			System.out.println(" Please try again later !!!!");
			
			 
		}
	}
}