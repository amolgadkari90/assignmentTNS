package com.icici.transaction;

//import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionRecords 
{
	private String txnID;
	private LocalDateTime txnDate;
	private String txnDescription;
	private String txnCrDr;
	private double amount;
	private double balance;
	
	public TransactionRecords(String txnID, LocalDateTime txnDate, String txnDescription, String txnCrDr, double amount,
			double balance) {
		super();
		this.txnID = txnID;
		this.txnDate = txnDate;
		this.txnDescription = txnDescription;
		this.txnCrDr = txnCrDr;
		this.amount = amount;
		this.balance = balance;
	}
	
	public TransactionRecords() {
		super();
	}
	
	public String getTxnID() {
		return txnID;
	}
	public void setTxnID(String txnID) {
		this.txnID = txnID;
	}
	public LocalDateTime getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDateTime txnDate) {
		this.txnDate = txnDate;
	}
	public String getTxnDescription() {
		return txnDescription;
	}
	public void setTxnDescription(String txnDescription) {
		this.txnDescription = txnDescription;
	}
	public String getTxnCrDr() {
		return txnCrDr;
	}
	public void setTxnCrDr(String txnCrDr) {
		this.txnCrDr = txnCrDr;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
