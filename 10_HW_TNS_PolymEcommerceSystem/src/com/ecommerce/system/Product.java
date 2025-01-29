package com.ecommerce.system;

public class Product {

	String pName;
	String pDescription;
	double pPrice;
	
	boolean addedToCart = false;
	boolean inStock = true;
	int quantity;
	int cartItemCount;
	double discountedPrice;
	int discount;
	
	public Product() {
		super();
	}

	public Product(String pName, String pDescription, double pPrice) {
		super();
		this.pName = pName;
		this.pDescription = pDescription;
		this.pPrice = pPrice;
	}

	void calculateDiscount()
	{
		discount = 30;
		
		if (discount > 0 && discount < 100)
		{
			discountedPrice = pPrice-( pPrice * (0.3));		
		} else discountedPrice = pPrice;
		
	}
	
	void addToCart()
	{
		if (inStock)
		{
			if (addedToCart) 
				quantity++;
			else
			{
				addedToCart = true;
				cartItemCount++;
				quantity++;			
			}
			System.out.println("Product Name: "+ pName +" added in cart" );
		} else System.err.println("Out of stock, add for later!");	
		
	}
	
	void removeFromCart()
	{
		if (addedToCart) 
		{
			if (quantity > 1)
			{
				quantity--;
				System.out.println("Product Name: "+ pName +" removed from cart" );
			}
			
			else if (quantity == 1)
			{
				cartItemCount--;
				quantity = 0;
				addedToCart = false;
				System.out.println("Product Name: "+ pName +" removed from cart" );
				
			} else {
				quantity = 0;
				addedToCart = false;
				System.err.println("Not available in the cart!!!");				
			}
				
		}
			
		else
		{
			addedToCart = true;
			quantity++;			
		}
	}
	

	void displayCart(int discount)
	{
		System.out.println("Product Name: "+pName);
		System.out.println("Product description: "+pDescription);
		System.out.println("Product price: "+pPrice);
		System.out.println(discount+"% Discounted price: "+discountedPrice);
	}	
	
	void totalPrice() {
		
	}
	

}
