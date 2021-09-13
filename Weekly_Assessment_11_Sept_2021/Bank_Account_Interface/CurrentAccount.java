package com.Bank_Account_Interface;


/// Current Account Is child class of Account class also Implements MaintenanceCharge interface

public  class CurrentAccount extends Account implements MaintenanceCharge{

	public CurrentAccount(String coustomerName, String accountNumber, double balance) {
		super(coustomerName, accountNumber, balance);
		
	}

	
	/// calculating  Maintenance  Charge using (m*n)+200 
	public float calculateMaintenanceCharge(float noOfYears)
	{
		float  maintenanceCharge ;
		float m=100;
		float n= noOfYears;
		maintenanceCharge=(m*n)+200;
		 
		
			System.out.print("Maintenance Charge for Current Account is : "+maintenanceCharge);
		return maintenanceCharge;
		
	}
	
	

}