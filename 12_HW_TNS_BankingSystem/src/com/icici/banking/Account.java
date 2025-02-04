package com.icici.banking;

import com.icici.configuration.AccountGeneration;
import com.icici.transactionType.Card;
import com.icici.transactionType.User;

public class Account 
{
	//attributes like 'accountNumber', `accountHolder', `balance',
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private String AccType;
	private User user;
	private Card card;
			
	public Account() {
		
	}

	public Account(String accountHolder, double balance, String AccType, User user, Card card) 
	{
		this.accountNumber = AccountGeneration.generateAccountNumber();
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.AccType = AccType;
		this.user = user;
		this.card = card;
	}

	// methods like `deposit', 'withdraw', and `displayAccountInfo'.
	
	public void deposit(double amount)
	{
		
	}
	
	public void withdraw (Card type, String accountNumber,double amount, Account acc) 
	{
		
	}

	public void withdraw (User user, String accountNumber,double amount, Account acc) 
	{
		
	}
	
	public void displayAccountInfo()
	{
		System. out.println ("Name Of Account Holder = " + accountHolder) ;
		System. out.println ("Account Number = " + accountNumber) ;
		System. out.println ("Current Balance in Account = " + balance);
		System. out.println("Email ID= "+user.getEmail());
		System. out.println ("Account Type : "+AccType);
	}
	
	public void displayCardDetails()
	{
		System. out.println ("Card number = " + card.getCardNumber()) ;
		System. out.println ("CVV number = " + card.getCvv()) ;
		System. out.println ("Exp date = " + card.getExpirydate()) ;
		System. out.println ("Pin = " + card.getPin());
	}
	
	
	
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

	

}
