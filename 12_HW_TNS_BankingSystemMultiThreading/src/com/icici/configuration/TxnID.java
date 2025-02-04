package com.icici.configuration;

import java.util.Random;

public class TxnID 
{
	private TxnID () 
	{
		
	}
	

	public static String generateTxnID() {
		// TODO Auto-generated method stub
		//System.out.println("generateAccountNumber() called");
		Random random = new Random ();
		int rn = random.nextInt(1000000);
		return "S" + rn;

	}
	
}
