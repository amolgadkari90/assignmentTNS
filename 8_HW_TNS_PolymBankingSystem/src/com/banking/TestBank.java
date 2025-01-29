package com.banking;

import java.util.Scanner;

public class TestBank extends Account {

	public static void main(String[] args) {
		boolean txFlag = true;
		Scanner sc = new Scanner(System.in);
		
		TestBank obj = new TestBank();
		
		SavingsAccount sa1 = new SavingsAccount();
		sa1.accountNumber = 123456;
		sa1.accountHolder = "Tom";
		//sa1.acType = "Saving";
		sa1.balance  = 50000;
		
		
		CurrentAccount ca1 = new CurrentAccount();
		ca1.accountNumber = 234567;
		ca1.accountHolder = "Bob";
		//sa1.acType = "Current";
		ca1.balance  = 200000;
		
		
		do 
		{
			System.out.println("Welcome to my bank!!!");
			System.out.println("Main Menu:" );
			System.out.println("1. Current account");
			System.out.println("2. Saving account");
			System.out.println("3. Exit");
	
			int acOption = sc.nextInt();
			int txOption = 0;
			sc.nextLine();
			
			if (acOption == 1 || acOption == 2)
			{
				if (acOption == 1)
					Account.acType = "Current";
				else Account.acType = "Saving";
				
				System.out.println("Select Menu:" );
				System.out.println("1. Check balance");
				System.out.println("2. Withdraw money" );
				System.out.println("3. Add money" );
				System.out.println("4. Go back to start" );
				txOption = sc.nextInt();
				sc.nextLine();
				
				if (txOption == 1 || txOption == 2 || txOption == 3)
				{
					obj.enterCredentials();
					if (acOption == 1 && Account.correctCredentials == true)
					{
						if (txOption == 1) 
						{
							ca1.displayAccountInfo();
							obj.infoSeparator();
						} else if (txOption ==  2)
						{
							System.out.print("Enter cash to withdraw: ");
							int cash = sc.nextInt();
							ca1.withdraw(cash);
							ca1.displayAccountInfo();
							sc.nextLine();
							obj.infoSeparator();
						} else {
							
							System.out.print("Enter cash to deposit: ");
							int cash = sc.nextInt();
							ca1.deposit(cash);
							ca1.displayAccountInfo();
							sc.nextLine();
							obj.infoSeparator();						
						}
					} else if (acOption == 2)
					{
						if (txOption == 1) 
						{
							sa1.displayAccountInfo();
							obj.infoSeparator();
						} else if (txOption ==  2)
						{
							System.out.print("Enter cash to withdraw: ");
							int cash = sc.nextInt();
							sa1.withdraw(cash);
							sa1.displayAccountInfo();
							sc.nextLine();
							obj.infoSeparator();
						} else {
							
							System.out.print("Enter cash to deposit: ");
							int cash = sc.nextInt();
							sa1.deposit(cash);
							sa1.displayAccountInfo();
							sc.nextLine();
							obj.infoSeparator();						
						}
					}
						
				}
				else if (txOption == 4)
				{
					 continue;
				}
			}
			else if (acOption == 3)
				{
					txFlag = false;
					break;
				}
			else  continue;
		} while(txFlag);
		
		//sa1.displayAccountInfo();
		//obj.infoSeparator();
		

		

		
//		ca1.withdraw(5000);
//		ca1.displayAccountInfo();
//		obj.infoSeparator();		
//		
//		ca1.withdraw(100000);
//		ca1.displayAccountInfo();
//		obj.infoSeparator();
//		
////		sa1.withdraw(5000);
////		sa1.displayAccountInfo();
////		obj.infoSeparator();
////		
////		sa1.withdraw(100000);
////		sa1.displayAccountInfo();
////		obj.infoSeparator();
	
		

}
	

	
	void enterCredentials()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String userName = sc.nextLine();
		System.out.print("Enter 4 digit pin number: ");
		int pinNum = sc.nextInt();
		
		if (acType.equals("Current") && userName.equals(cUserName) && pinNum == Account.pinNum )
		{
			correctCredentials = true;
		} else if (acType.equals("Saving") && userName.equals(sUserName) && pinNum == Account.pinNum )
		{
			correctCredentials = true;
		} else System.err.println("Incorrect user name and/or pin number!!!");				
		
	}
	
	//Info separator
	void infoSeparator()
	{
		for (int i = 0; i < 15; i++)
			System.out.print("***");
			System.out.println();
	}

}
