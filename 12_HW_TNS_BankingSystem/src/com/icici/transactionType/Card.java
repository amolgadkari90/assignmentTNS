package com.icici.transactionType;

//import java.sql.Date;
import java.time.LocalDate;

public class Card 
{
	private String cardNumber;
	private int cvv;
	private LocalDate expirydate;
	private int pin;
	
	public Card(){
		
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public LocalDate getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(LocalDate Date) {
		this.expirydate = Date;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
//	public boolean checkExpiry()
//	{
//        // Get today's date
//        LocalDate today = LocalDate.now();
//        LocalDate expDate = getExpirydate();
//        
//        if (LocalDate )
//        
//        
//        
//        
//	}
	
	
	
}
