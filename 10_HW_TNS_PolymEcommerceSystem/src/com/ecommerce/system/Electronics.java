package com.ecommerce.system;

public class Electronics extends Product {

	int warrantyPeriod;
	String brand;
	
	
	
	public Electronics(int warrantyPeriod, String brand) {
		super();
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}



	@Override
	void calculateDiscount()
	{
		discount = 20;
		if (discount > 0 && discount < 100)
		{
			//System.out.println("I am in e dicount " + pPrice);
			//System.out.println("I am in e dicount " + discount/100);
				
			discountedPrice = pPrice-( pPrice * (0.2));
			//System.out.println("I am in e dicount " + discountedPrice);
		} else discountedPrice = pPrice;

	}
}
