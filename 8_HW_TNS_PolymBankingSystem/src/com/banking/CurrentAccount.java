package com.banking;

import java.util.Scanner;

public class CurrentAccount extends Account{
	

	
	void withdraw(double withdrawMoney) 
	{
		Scanner sc = new Scanner(System.in);
				
			if(withdrawMoney < 50000) 
			{
			
				if (balance >= withdrawMoney)
					{
						balance = balance - withdrawMoney ;
						System.out.println("Successful!!!");
							
					}
				else System.err.println("Insufficient balance!!!");
			}
			else
			{
				System.err.println("Withdraw amount is bigger than max limit/month 50000!!!");
			}
		
		//sc.nextLine();
		//sc.close();	
	}

}
