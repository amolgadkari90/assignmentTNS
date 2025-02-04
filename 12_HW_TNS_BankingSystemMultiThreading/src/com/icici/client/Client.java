package com.icici.client;

//import java.time.LocalDateTime;
//import java.util.Scanner;

import com.icici.banking.Account;
import com.icici.banking.AccountStatement;
import com.icici.banking.CurrentAccount;
import com.icici.banking.SavingsAccount;
import com.icici.configuration.GenerateCardDetails;
import com.icici.transaction.Transaction;
import com.icici.transaction.TransactionRecords;
import com.icici.transactionType.Card;
import com.icici.transactionType.User;
//import com.icici.constants.TransactionType;

public class Client {
	private static final String ONLINE = "ONLINE";
	public static final String CARD = "CARD";

	public static void main(String[] args) throws Exception {
		Client c = new Client();
		AccountStatement accStat = new AccountStatement();
		User u = null;
		Card cr = null;
		// Scanner sc = new Scanner(System.in);
		Transaction[] tSA = new Transaction[5];
		Transaction[] tCA = new Transaction[5];
		TransactionRecords[] trSA = new TransactionRecords[5];
		TransactionRecords[] trCA = new TransactionRecords[5];

		u = new User();
		u.setEmail("elexstartupcofounder@gmail.com");
		u.setUsername("sharma");
		u.setPassword("Sharma@123");
		cr = new Card();
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

		u1 = new User();
		u1.setEmail("elexstartupcofounder@gmail.com");
		u1.setUsername("varma");
		u1.setPassword("Varma@123");
		cr1 = new Card();
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

		//a2.withdraw(u1, accNumber1, 2000, a2); // Overriding in Saving account
		//c.infoSpaprator();

//		a2.deposit(5000);
//		c.infoSpaprator();

//		a2.withdraw(cr1, accNumber1, 2000, a2);
//		c.infoSpaprator();

//		a2.withdraw(cr1, accNumber1, 60000, a2);
//		c.infoSpaprator();

//		private Account account;
//		private boolean isDeposit;
//		private double amount;
//		private String txnType;
//		t = new Transaction();
//		System.out.println("Enter txn option Deposit/Withdraw = ");
//		String txn = sc.nextLine();				
//		if(txn.equals("Deposit"))
//			t.setDeposit(true);
//		else if (txn.equals("Withdraw"))
//			t.setDeposit(false);
//		else System.out.println("Invalid option!!!");
//		
//		System.out.println("Enter amount = ");	
//		double amt = sc.nextDouble();	
//		t.setDeposit(true);

		// a2.deposit(5000);
/**************************************************************/
		accNumber1 = a2.getAccountNumber();
		Transaction.txnNo = 0;
		int amount = 5000;
		for (int i = 0; i < 5; i++) 
		{
			tCA[i] = new Transaction(); // 1
			tCA[i].setAccount(a2); // 2
			tCA[i].setAmount(amount + i * 2500); // 3
			if(i > 0 && (i%2 != 0))
				tCA[i].setisDeposit(false); // 4
			else tCA[i].setisDeposit(true); // 4
			tCA[i].setTxnType(CARD); // 5
			trCA[i] = new TransactionRecords(); // 6
			tCA[i].setTxnRecords(trCA[i]); // 7
			tCA[i].setCard(cr1); // 8
			tCA[i].setAccountNumber(accNumber1); // 9
			tCA[i].start(); // 10
			tCA[i].join();
		}
		
		AccountStatement as = new AccountStatement();
		as.setTr(trCA);
		as.start();
		as.join();
		c.infoSpaprator();
		
/**************************************************************/
		accNumber1 = a1.getAccountNumber();
		System.out.println("AccNum "+ accNumber1);
		Transaction.txnNo = 0;
		amount = 1000;
		for (int i = 0; i < 5; i++) 
		{
			tSA[i] = new Transaction(); // 1
			tSA[i].setAccount(a1); // 2
			tSA[i].setAmount(amount + i * 2500); // 3
			if(i > 0 && (i%2 != 0))
				tSA[i].setisDeposit(false); // 4
			else tSA[i].setisDeposit(true); // 4
			tSA[i].setTxnType(CARD); // 5
			trSA[i] = new TransactionRecords(); // 6
			tSA[i].setTxnRecords(trSA[i]); // 7
			tSA[i].setCard(cr); // 8
			tSA[i].setAccountNumber(accNumber1); // 9
			tSA[i].start(); // 10
			tSA[i].join();
		}
		
		as = new AccountStatement();
		as.setTr(trSA);
		as.start();
		as.join();
		c.infoSpaprator();
		
/**************************************************************/	
				
		
		
		

		/*
		 * amount =5000; tCA[0] = new Transaction(); //1 tCA[0].setAccount(a2); //2
		 * tCA[0].setAmount(amount); tCA[0].setisDeposit(true); //3
		 * //tCA[0].setTxnType("Online"); //4 trCA[0] = new TransactionRecords(); //5
		 * tCA[0].setTxnRecords(trCA[0]); //6 //tCA[0].setCard(cr1); // new //7
		 * tCA[0].setAccountNumber(accNumber1); //8 tCA[0].run(); c.infoSpaprator();
		 * System.out.println("End 1");
		 */

		/*
		 * amount =2000; a2.withdraw(cr1, accNumber1, amount, a2);
		 */
//		a2.setCard(cr1);
//		a2.setAccountNumber(accNumber1);
//		a2.setBalance(2000);
		/*
		 * tCA[1] = new Transaction(); tCA[1].setAccount(a2); tCA[1].setAmount(amount);
		 * tCA[1].setisDeposit(false); tCA[1].setTxnType("CARD"); trCA[1] = new
		 * TransactionRecords(); tCA[1].setTxnRecords(trCA[1]); tCA[1].setCard(cr1); //
		 * new tCA[1].setAccountNumber(accNumber1); tCA[1].run(); c.infoSpaprator();
		 * System.out.println("End 2");
		 */

//		System.out.println("Number of transactions: "+Transaction.txnNo);
//		
//		System.out.printf("| %-10s | %-30s | %-20s | %-8s | %-10s | %-10s | \n", 
//							"TxnID", "TxnDate", "TxnDescription", 
//							"TxnCrDr","Amount", "Balance");
//			
////		System.out.println("\033[01m TxnID \t|"
////							+ "\t TxnDate \t\t\t|"
////							+ "\t TxnDescription \t|"
////							+ "\t TxnCrDr \t|"
////							+ "\t Amount \t|"
////							+ "\t Balance \t|\033[0m");
//			
//	
//		
//		for(int i= 0; i < Transaction.txnNo; i++)
//		{
//			System.out.printf("| %-10s | %-30s | %-20s | %-8s | %-10s | %-10s | \n",
//							tr[i].getTxnID(), tr[i].getTxnDate(), 
//							tr[i].getTxnDescription(),tr[i].getTxnCrDr(),
//							tr[i].getAmount(),tr[i].getBalance());  
//		}

		/*
		 * amount =12000; a2.withdraw(cr1, accNumber1, amount, a2); tCA[2] = new
		 * Transaction(); tCA[2].setAccount(a2); tCA[2].setAmount(amount);
		 * tCA[2].setisDeposit(false); tCA[2].setTxnType("ONLINE"); trCA[2] = new
		 * TransactionRecords(); tCA[2].setTxnRecords(trCA[2]); tCA[2].setCard(cr1); //
		 * new tCA[2].setAccountNumber(accNumber1); tCA[2].run(); c.infoSpaprator();
		 * System.out.println("End 3");
		 */

		/*
		 * amount =5080; 
		 * tCA[3] = new Transaction(); 
		 * tCA[3].setAccount(a2);
		 * tCA[3].setAmount(amount); 
		 * tCA[3].setisDeposit(true);
		 * tCA[3].setTxnType("Online"); 
		 * trCA[3] = new TransactionRecords();
		 * tCA[3].setTxnRecords(trCA[0]); 
		 * tCA[3].setCard(cr1); // new
		 * tCA[3].setAccountNumber(accNumber1); 
		 * tCA[3].run(); 
		 * c.infoSpaprator();
		 * System.out.println("End 4");
		 */

		/*
		 * amount =12000; a2.withdraw(cr1, accNumber1, amount, a2); tCA[4] = new
		 * Transaction(); tCA[4].setAccount(a2); tCA[4].setAmount(amount);
		 * tCA[4].setisDeposit(false); tCA[4].setTxnType("ONLINE"); trCA[4] = new
		 * TransactionRecords(); tCA[4].setTxnRecords(trCA[4]); tCA[4].setCard(cr1); //
		 * new tCA[4].setAccountNumber(accNumber1); tCA[4].run(); c.infoSpaprator();
		 * System.out.println("End 5");
		 */

		/* a2.printAccStatement(trCA); */

	}

	// Info separator

	void infoSpaprator() {
		for (int i = 0; i < 15; i++)
			System.out.print("***");
		System.out.println();
	}

}
