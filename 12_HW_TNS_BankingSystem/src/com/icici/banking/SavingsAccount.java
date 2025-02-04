package com.icici.banking;

import java.time.LocalDate;
import java.util.Scanner;

import com.icici.configuration.OTPGeneration;
import com.icici.configuration.SendOTP;
import com.icici.constants.AccountType;
import com.icici.transactionType.Card;
import com.icici.transactionType.User;

public class SavingsAccount extends Account
{
	
	
	public SavingsAccount(String accountHolder, double balance, User user, Card card) 
	{
		super(accountHolder, balance, AccountType.SAVING, user, card);
	}
	
	@Override
	public void deposit(double amount)
	{
		if (amount > 0)
		{
			setBalance(getBalance()+amount);
			System. out.println ("Current Balance in Account"+getAccountNumber()+" = "+ getBalance());			
		}
		else
		{
			System.err.println("Incorrect amount!!!");
		}
	}

	@Override
	public void withdraw(Card card, String accountNumber,double amount, Account acc) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Read card number = ");
		String cardNum = sc.nextLine();
		//sc.nextLine();
		
		System.out.print("Enter pin = ");
		int cardPin = sc.nextInt();
		LocalDate expDate = card.getExpirydate();
		LocalDate today = LocalDate.now();
		
		if(today.compareTo(expDate) < 0 ) 
		{
			if( cardNum.equals(card.getCardNumber()) && card.getPin() == cardPin)
			{
				if(acc.getBalance() >= amount)
				{
					
					setBalance(acc.getBalance()- amount);
					
					if (acc.getBalance() >= 5000) // 5000 is min balance later add to constant 
					{
						System. out.println ("Remaining balance =" + acc.getBalance());
					}
					else
					{
						setBalance(acc.getBalance()+ amount);
						System. out.println ("Minimum balance is required"
								+ "Not allowed to withdraw ...!!! ");						
					}
					//System. out.println ("Remaining balance =" + acc.getBalance());
				}
				else
				{
					System.err.println ("Insufficient Balance .. !!! ");
				}
			}
			else 
			{
				System.err.println ("Your card number and password is incorrect ... !!! ") ;
			}
		}
		else
		{
			System.err.println("The card is expired!!!");
			
		}
		
		
		sc.close();	
	}
		
	@Override
	public void withdraw(User user, String accountNumber,double amount, Account acc) 
	{
		
		//System. out.println ("balance :"+acc.getBalance());
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter username :");
		String username = scanner.nextLine();
		//System.out.println();

		System.out.print ("Enter Password :");
		String password = scanner.nextLine();
		System.out.println();
		
		if (username.equals(user.getUsername()) && password.equals(user.getPassword() )) 
		{
			int otp = OTPGeneration.generateOTP();
			String subject = "ICICI Bank OTP";
			String otpString = ("OTP = "+otp);
			System.err.print("Sending OTP...") ;
			SendOTP.sendEmail(user.getEmail(), subject, otpString);
			//System. out.println ("Your OTP is = " + otp);
			System. out.println ("Please enter the above OTP : ") ;
			scanner = new Scanner (System.in);
			int otp2 = scanner.nextInt();
			if (otp == otp2)
			{
				if(acc.getBalance() >= amount)
				{
					
					setBalance(acc.getBalance()- amount);
					
					if (acc.getBalance() >= 5000) // 5000 is min balance later add to constant 
					{
						System. out.println ("Remaining balance =" + acc.getBalance());
					}
					else
					{
						setBalance(acc.getBalance()+ amount);
						System.err.println ("Minimum balance is required"
								+ "Not allowed to withdraw ...!!! ");						
					}
					//System. out.println ("Remaining balance =" + acc.getBalance());
				}
				else
				{
					System.err.println ("Insufficient Balance .. !!! ");
				}
			}
			else 
			{
				System.err.println ("Your username and password is incorrect ... !!! ") ;
			}
		}
	}
}
