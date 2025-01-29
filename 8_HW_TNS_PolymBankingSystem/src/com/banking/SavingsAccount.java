package com.banking;

import java.util.Scanner;

public class SavingsAccount extends Account {
	

	
	@Override 
	void withdraw(double withdrawMoney) 
	{
		System.out.println("1. I am in sav withdraw");
		
		Scanner sc = new Scanner(System.in);
		if(withdrawMoney < 20000) 
		{
			//System.out.println("2. I am in sav withdraw");
			System.out.print("Enter user name: ");
			String userName = sc.nextLine();
			System.out.print("Enter 4 digit pin number: ");
			int pinNum = sc.nextInt();
			
			if (userName.contentEquals("Sav@123") && pinNum == 1234)
			{
				if (balance >= withdrawMoney)
					balance = balance - withdrawMoney ;
				else System.err.println("Insufficient balance!!!");
			}
			else System.err.println("Incorrect user name and/or pin number!!!");	
		}
		else
		{
			System.err.println("Withdraw amount is bigger than max limit/month 20000!!!");
		}
		
		//sc.nextLine();
		//sc.close();	
		
	}
	

}
