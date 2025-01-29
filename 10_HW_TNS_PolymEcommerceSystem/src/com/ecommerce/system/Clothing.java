package com.ecommerce.system;

public class Clothing extends Product {
	String size;
	String material;
	
	public Clothing(String size, String material) {
		super();
		this.size = size;
		this.material = material;
	}



	@Override
	void calculateDiscount()
	{
		discount = 10;
		
		if (discount > 0 && discount < 100)
		{
			discountedPrice = pPrice-( pPrice * (0.1));		
		} else discountedPrice = pPrice;
	}
	

}
