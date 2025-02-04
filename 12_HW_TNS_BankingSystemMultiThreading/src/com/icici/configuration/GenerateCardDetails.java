package com.icici.configuration;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateCardDetails 
{
	private GenerateCardDetails()
	{
		
		
	}
	
	
	public static final String generateCardNum()
	{
		Random random = new Random();
		return (Long.toString(random.nextLong(100000000, 1000000000)));
	}
	
	public static final int generateCVV()
	{
		Random random = new Random();
		return random.nextInt(1000, 9999);
	}
	
	public static final LocalDate expiryDate()
	{
        // Get today's date
        LocalDate today = LocalDate.now();

        // Add 3 years to today's date
        LocalDate expiryDate = today.plusYears(3);
        
        return expiryDate;
        
        
        //System.out.println("Expiry Date: " + expiryDate);
        
        //System.out.println(expiryDate.getYear() + "/" + expiryDate.getMonthValue());
        
		/*
		 * // Format the date (Optional) DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("dd-MM-yyyy"); String formattedDate =
		 * expiryDate.format(formatter);
		 * 
		 * // Print the expiry date System.out.println("Expiry Date: " + formattedDate);
		 */
	}
	
	public static final int generatePin()
	{
		Random random = new Random();
		return random.nextInt(1000, 9999);
	}
	
}
