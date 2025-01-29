package com.banking;

import java.util.Scanner;

public class Account {
	
	int accountNumber;
	String accountHolder;
	double balance;
	
	static boolean correctCredentials = false;
	static String acType;
	final static String cUserName = "Cur@123";
	final static int pinNum = 1234;
	final static String sUserName = "Sav@123";

	
	
	void deposit(double depositMoney) {
		if (depositMoney > 0)
			balance = balance + depositMoney ;
		else System.err.println("Deposit amount must be positive!!!");
	}
	
	void withdraw(double withdrawMoney) {
		//add pw and username security
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String userName = sc.nextLine();
		System.out.print("Enter 4 digit pin number: ");
		int pinNum = sc.nextInt();
		
		if (userName.contentEquals("Acc@123") && pinNum == 1234)
		{
			if (balance >= withdrawMoney)
				balance = balance - withdrawMoney ;
			else System.err.println("Insufficient balance!!!");
		}
		else System.err.println("Incorrect user name and/or pin number!!!");	
		sc.close();
					
	}
	
	void displayAccountInfo() {
		System.out.println("Account holder name: \t"+this.accountHolder);
		System.out.println("Account number: \t"+this.accountNumber);
		System.out.println("Balance: \t"+balance);
	}
	
}
