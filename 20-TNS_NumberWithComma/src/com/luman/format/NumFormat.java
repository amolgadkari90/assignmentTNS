package com.luman.format;
import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat 
{
	    public void getAmount(int num, int n) 
	    {
	        // Define Indian Locale
	        NumberFormat formatter = NumberFormat.getInstance(new Locale("en", "IN"));
	        
	        // Format the number
	        String formattedNumber = formatter.format(num);
	        
	        // Print the result
	        System.out.println(num + " >>>>>>>>>> " + formattedNumber);
	    }
	    
	    
	    public String getAmount(long num) 
	    {
	    	boolean ifNegative = false;
	    	if (num < 0)
	    	{
	    		num = Math.abs(num);
	    		ifNegative = true;	    		
	    	}   		

	    	//System.out.println("2");
	        String strNum = String.valueOf(num); 			// long to string 
	        int len = strNum.length(); 						// length of number
	        
	        StringBuilder result = new StringBuilder();

	        // Add last 3 digits
	        if (len > 3) 
	        {
	            result.append(strNum.substring(len - 3));	// Last 3 numbers filled in result
	            //System.out.println("1 sub-string: "+result); 
	            strNum = strNum.substring(0, len - 3); 		//remove last 3 digits 
	            //System.out.println("2 sub-string: "+strNum); 
	        } else 
	        {
	        	if (ifNegative)
	        	{
	        		strNum = "-"+strNum;
	        		ifNegative = false;
	        	}      		
	        	
	            return strNum ; 								// Return number (upto 999) directly if less than 3 digits
	        }

	        // Add remaining digits in pairs
	        while (strNum.length() > 0) 
	        {
	            int end = strNum.length();
	            int start = Math.max(end - 2, 0);
	            result.insert(0, strNum.substring(start, end) + ",");
	            strNum = strNum.substring(0, start);
	     
	        }
	        
	        if(ifNegative)
              result.insert(0, strNum + "-");
	        ifNegative = false;	        

	        return result.toString();
	    }

	    
	    

	
}
