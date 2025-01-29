package com.ecommerce.system;

public class Client {
	


	public static void main(String[] args) {
		Client obj = new Client();
//		Product p = null;
				
		Electronics e1 = null;
		Electronics e2 = null;
		
		Clothing c1 = null;
		Clothing c2 = null;
		
		
		e1 = new Electronics(1, "Apple Inc."); // Apple 2023 MacBook Pro
		e1.pName = "Apple 2023 MacBook Pro";
		e1.pDescription = "Apple M2 Max chip with 12‑core CPU and 38‑core GPU: 33.74 cm (16.2-inch)";
		//e1.discount = 20;
		e1.pPrice = 349900; //0
		e1.calculateDiscount();
			
		e2 = new Electronics(1, "HP Inc."); //HP ZBook Studio
		e2.pName = "HP ZBook Studio";
		e2.pDescription = "12th Gen Intel Core i9-12900H 16 inch(40.6 cm) WQUXGA Display ";
		//e2.discount = 20;
		e2.pPrice = 337340; //28%
		e2.calculateDiscount();
		
		
		c1 = new Clothing("Large", "60% Cotton, 40% Polyester"); //Under Armour Men's Cotton Solid UA Sportstyle LC Short Sleeve | T-Shirt | 1326799-001
		c1.pName = "Under Armour Men's Cotton Solid UA Sportstyle";
		c1.pDescription = "LC Short Sleeve | T-Shirt | 1326799-001 ";
		//c1.discount = 10;
		c1.pPrice = 4963; // 33%
		c1.calculateDiscount();
				
		c2 = new Clothing("Large", "100% Cotton"); //Nike Men's Regular Fit T-Shirt (DQ4885-222_Medium Olive/Black M)
		c2.pName = "Nike Men's Regular Fit";
		c2.pDescription = "LT-Shirt (DQ4885-222_Medium Olive/Black M)";
		//c1.discount = 10;
		c2.pPrice = 4949; // 45%
		c2.calculateDiscount();
				
		e1.addToCart();
		obj.infoSpaprator();
		e2.addToCart();
		obj.infoSpaprator();
		c1.addToCart();
		obj.infoSpaprator();
		c2.addToCart();
		obj.infoSpaprator();
		
		
		e1.displayCart(e1.discount);
		obj.infoSpaprator();
		e2.displayCart(e2.discount);
		obj.infoSpaprator();
		c1.displayCart(c1.discount);
		obj.infoSpaprator();
		c2.displayCart(c2.discount);
		obj.infoSpaprator();
		
		double totalPrice = e1.discountedPrice + e2.discountedPrice + c1.discountedPrice +c2.discountedPrice;
		
		System.out.println("Total price: "+Math.round(totalPrice));
		obj.infoSpaprator();
		
	}

	//Info separator
	
	void infoSpaprator()
	{
		for (int i = 0; i < 15; i++)
			System.out.print("***");
			System.out.println();
	}

	
	
	
}
