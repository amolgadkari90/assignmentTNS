package com.ecommerce.system;

public class Service {
	
	Client obj = null;
	Product p = null;
			
	Electronics e1 = null;
	Electronics e2 = null;
	
	Clothing c1 = null;
	Clothing c2 = null;
	
	void configureData() {
		
		e1 = new Electronics(1, "Apple Inc."); // Apple 2023 MacBook Pro
		e1.pName = "Apple 2023 MacBook Pro";
		e1.pDescription = "Apple M2 Max chip with 12‑core CPU and 38‑core GPU: 33.74 cm (16.2-inch)";
		e1.pPrice = 349900; //0
		
		e2 = new Electronics(1, "HP Inc."); //HP ZBook Studio
		e2.pName = "HP ZBook Studio";
		e2.pDescription = "12th Gen Intel Core i9-12900H 16 inch(40.6 cm) WQUXGA Display ";
		e2.pPrice = 337340; //28%
		
		c1 = new Clothing("Large", "60% Cotton, 40% Polyester"); //Under Armour Men's Cotton Solid UA Sportstyle LC Short Sleeve | T-Shirt | 1326799-001
		c1.pName = "Under Armour Men's Cotton Solid UA Sportstyle";
		c1.pDescription = "LC Short Sleeve | T-Shirt | 1326799-001 ";
		c1.pPrice = 4963; // 33%
		
		c2 = new Clothing("Large", "100% Cotton"); //Nike Men's Regular Fit T-Shirt (DQ4885-222_Medium Olive/Black M)
		c2.pName = "Nike Men's Regular Fit";
		c2.pDescription = "LT-Shirt (DQ4885-222_Medium Olive/Black M)";
		c2.pPrice = 4949; // 45%
				
	}

}
