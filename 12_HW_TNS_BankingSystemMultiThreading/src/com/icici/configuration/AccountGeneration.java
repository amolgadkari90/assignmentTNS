package com.icici.configuration;

import java.util.Random;

public class AccountGeneration 
{
	private AccountGeneration () 
	{
		
	}
	
	public static final String generateAccountNumber() 
	{
		//System.out.println("generateAccountNumber() called");
		Random random = new Random ();
		int rn = random.nextInt(1000000);
		return "IC" + rn;
	}
	
}
