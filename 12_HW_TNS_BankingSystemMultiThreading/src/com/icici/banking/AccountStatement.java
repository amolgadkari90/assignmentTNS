package com.icici.banking;

import com.icici.transaction.Transaction;
import com.icici.transaction.TransactionRecords;

public class AccountStatement extends Thread
{
	private TransactionRecords[] tr = null;
		
	public void setTr(TransactionRecords[] tr) {
		this.tr = tr;
	}


	@Override
	public void run()
	{
	//System.out.println("Number of transactions: "+Transaction.txnNo);
		
		System.out.printf("| %-10s | %-30s | %-20s | %-8s | %-10s | %-10s | \n", 
							"TxnID", "TxnDate", "TxnDescription", 
							"TxnCrDr","Amount", "Balance");
			
//		System.out.println("\033[01m TxnID \t|"
//							+ "\t TxnDate \t\t\t|"
//							+ "\t TxnDescription \t|"
//							+ "\t TxnCrDr \t|"
//							+ "\t Amount \t|"
//							+ "\t Balance \t|\033[0m");
			
	
		
		for(int i= 0; i < Transaction.txnNo; i++)
		{
			System.out.printf("| %-10s | %-30s | %-20s | %-8s | %-10s | %-10s | \n",
							tr[i].getTxnID(), tr[i].getTxnDate(), 
							tr[i].getTxnDescription(),tr[i].getTxnCrDr(),
							tr[i].getAmount(),tr[i].getBalance());  
		}
	}
}
