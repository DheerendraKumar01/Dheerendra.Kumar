package com.Bank_Account_Interface;

/// Saving Account Is child class of Account class also Implements MaintenanceCharge interface



public  class SavingAccount extends Account implements MaintenanceCharge {

	public SavingAccount(String coustomerName, String accountNumber, double balance) {
		super(coustomerName, accountNumber, balance);
	
	}
	
	/// calculating  Maintenance  Charge using (m*n)+50
	public float calculateMaintenanceCharge(float noOfYears)
	{
		float  maintenanceCharge ;
		float m=50;
		float n= noOfYears;
		maintenanceCharge=(m*n)+50;
		 
		
		System.out.print("Maintenance Charge for Current Account is :"+maintenanceCharge);
		return maintenanceCharge;
		
	}
}