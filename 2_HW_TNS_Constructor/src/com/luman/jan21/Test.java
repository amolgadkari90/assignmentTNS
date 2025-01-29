package com.luman.jan21;

public class Test {

	public static void main(String[] args) 
	{
		MyContructor obj = new MyContructor();
		System.out.println("Address of obj = "+obj); // Address of obj
		
		System.out.println("Value of i = "+obj.i); // Value of i = 0 
		
		MyContructor obj1 = new MyContructor(10);
		System.out.println("Addr of obj = "+obj+" value of i @obj = "+obj.i); 
		System.out.println("Addr of obj1 = "+obj1+" value of i @obj1 = "+obj1.i); 
		System.out.println("Addr of obj1 = "+obj1+" value of s @obj1 = "+obj1.s); 
		
		MyContructor obj2 = new MyContructor(10, "TKA");
		System.out.println("Addr of obj2 = "+obj2+" value of i @obj2 = "+obj2.i); 
		System.out.println("Addr of obj2 = "+obj2+" value of s @obj2 = "+obj2.s); 
		
		
		
		
		
				
	}

}
