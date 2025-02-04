package com.icici.configuration;

import java.util.Random;

public class OTPGeneration {
	
	private OTPGeneration() {
		
	}
	
	public static final int generateOTP() 
	{
		Random random = new Random();
		return random.nextInt(10000, 100000);
	}

}
