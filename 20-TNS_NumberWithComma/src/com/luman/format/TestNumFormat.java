package com.luman.format;

public class TestNumFormat 
{
	static long [] numbers = {1, 2, 10, 100, 1000, 10000, 100000, 1000000, 
								10000000, 1234567, -1234567, - 10000000, -1000, 
								-10000, -100000, -1000000, -583, -10, -1,-2147483648, 2147483647};
	//static double d = 1000000.00000000;
	

	public static void main(String[] args) 
	{
		NumFormat nf = new NumFormat();
		
//        for (int i = 0  ; i < numbers.length ; i++ ) 
//        {
//            nf.getAmount(numbers[i], i);
//        }
        
        System.out.println("***********************************");
        
        String result = ""; 
        
        for (int i = 0  ; i < numbers.length ; i++ ) 
        {
        	//if (numbers[i] <= int.MAX_VALUE )
      	
        		result = nf.getAmount(numbers[i]);
        		System.out.println(numbers[i] + " >>>>>>>>>> " + result);;
        }
	
	}

}
