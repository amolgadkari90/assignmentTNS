package com.icici.transaction;

//import java.time.LocalDate;
import java.time.LocalDateTime;

import com.icici.banking.Account;
import com.icici.configuration.TxnID;
import com.icici.constants.TransactionType;
import com.icici.transactionType.Card;

public class Transaction extends Thread
{
	private Account account;
	private boolean isDeposit;
	private double amount;
	private String txnType;
	private Card card;
	private String accountNumber;
	TransactionRecords txnRecords;
	public static int txnNo;
	
		
	public Transaction() {
		super();
	}

	public Transaction(Account account, boolean isDeposit, double amount, String txnType, TransactionRecords txnRecords) {
		super();
		this.account = account;
		this.isDeposit = isDeposit;
		this.amount = amount;
		this.txnType = txnType;
		this.txnRecords = txnRecords;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isDeposit() {
		return isDeposit;
	}

	public void setisDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public TransactionRecords getTxnRecords() {
		return txnRecords;
	}

	public void setTxnRecords(TransactionRecords txnRecords) {
		this.txnRecords = txnRecords;
	}

	public void setDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public void run()
	{
		LocalDateTime today = LocalDateTime.now();
		System.err.println("Executing " + getName());
			
		if (isDeposit)
		{
			System.out.println("I am in deposit "+amount);
			//account.deposit(5000);
			account.deposit(amount);
		}
		else
		{
			if(txnType.equals(TransactionType.CARD)) // Online 
			{
				System.out.println("I am in card transaction "+amount);
			
				account.withdraw(card, accountNumber, amount, account);
							
			}
			else // Card
			{
				System.out.println("I am in online transaction "+ amount) ;
			}
			
		}
		
		txnNo++;
		txnRecords.setAmount(amount);
		txnRecords.setBalance(account.getBalance());
		txnRecords.setTxnDate(today);
		if(isDeposit)
			txnRecords.setTxnCrDr("Cr");
		else txnRecords.setTxnCrDr("Dr");
		txnRecords.setTxnID(TxnID.generateTxnID());
		txnRecords.setTxnDescription(accountNumber +" "+txnRecords.getTxnID()+" " + txnRecords.getTxnCrDr());
		
		System.err.println("Ending " + getName());
	}
}
