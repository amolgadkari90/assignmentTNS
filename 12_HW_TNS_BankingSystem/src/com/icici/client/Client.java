package com.icici.client;

import com.icici.banking.Account;
import com.icici.banking.CurrentAccount;
import com.icici.banking.SavingsAccount;
import com.icici.configuration.GenerateCardDetails;
import com.icici.transactionType.Card;
import com.icici.transactionType.User;

public class Client 
{
	public static void main(String[] args) 
	{
		Client c = new Client();
		User u = null;
		Card cr = null;
		
		u = new User() ;
		u.setEmail("elexstartupcofounder@gmail.com");
		u.setUsername ("sharma");
		u.setPassword ("Sharma@123");
		cr= new Card();
		cr.setCardNumber(GenerateCardDetails.generateCardNum());		
		cr.setCvv(GenerateCardDetails.generateCVV());
		cr.setExpirydate(GenerateCardDetails.expiryDate());
		cr.setPin(GenerateCardDetails.generatePin());
		
	
		Account a1 = new SavingsAccount("Sharma", 15000, u, cr);// Open saving account
		a1.displayAccountInfo();
		c.infoSpaprator();
		a1.displayCardDetails();
		c.infoSpaprator();
		
//		String accNumber = a1.getAccountNumber();
//		
//		a1.withdraw(u, accNumber, 2000, a1); // Overriding in Saving account
//		c.infoSpaprator();
//		
//		a1.deposit(5000);
//		c.infoSpaprator();
//						
//		a1.withdraw(cr, accNumber, 2000, a1);
		
		
		User u1 = null;
		Card cr1 = null;
		
		u1 = new User() ;
		u1.setEmail("elexstartupcofounder@gmail.com");
		u1.setUsername ("varma");
		u1.setPassword ("Varma@123");
		cr1= new Card();
		cr1.setCardNumber(GenerateCardDetails.generateCardNum());		
		cr1.setCvv(GenerateCardDetails.generateCVV());
		cr1.setExpirydate(GenerateCardDetails.expiryDate());
		cr1.setPin(GenerateCardDetails.generatePin());
		
		Account a2 = new CurrentAccount("Varma", 100000, u1, cr1);// Open saving account
		a2.displayAccountInfo();
		c.infoSpaprator();
		
		a2.displayCardDetails();
		c.infoSpaprator();
		
		String accNumber1 = a2.getAccountNumber();
		
//		a2.withdraw(u1, accNumber1, 2000, a2); // Overriding in Saving account
//		c.infoSpaprator();
		
//		a2.deposit(5000);
//		c.infoSpaprator();
						
//		a2.withdraw(cr1, accNumber1, 2000, a2);
//		c.infoSpaprator();
		
		a2.withdraw(cr1, accNumber1, 60000, a2);
		c.infoSpaprator();
	

	}
	
	//Info separator
	
	void infoSpaprator()
	{
		for (int i = 0; i < 15; i++)
			System.out.print("***");
			System.out.println();
	}
	
	
}
