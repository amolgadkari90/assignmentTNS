package com.inventory.system;


public class Product {

	//Variables
		int productID;
		String productName;
		double price;
		int quantityInStock;
		
		//No parameter constructor
		public Product() {
			super();
			this.productName = "";
		}
		
		//Parameterized constructor
		
		public Product(int productID, String productName, double price, int quantityInStock) {
			super();
			this.productID = productID;
			this.productName = productName;
			this.price = price;
			this.quantityInStock = quantityInStock;
		}
		
		//Display Inventory
		void displayInventory()
		{
			System.out.println("ProductID: "+productID);
			System.out.println("ProductName: "+productName);
			System.out.println("Product price: "+price);
			System.out.println("Quantity in stock: "+quantityInStock);
		}
		
		
		//Info separator
		void infoSeparator(char c)
		{
			for (int i = 0; i < 20; i++)
				System.out.print(c);
				System.out.println();
		}
		
		//Buy product
		void buyProduct(int purchaseQty)
		{
			Product p = new Product();
			System.out.println("Product Name: "+productName+" Stock qty: "+quantityInStock );
			if(quantityInStock >= purchaseQty)
			{
				quantityInStock = quantityInStock - purchaseQty;
				System.out.println("Purchase successful!!! "+productName+" New stock: "+quantityInStock);
				p.totalBill(purchaseQty, price);
				if (quantityInStock < 100)
					System.err.println("Stock is less than minimum stock quantity"+quantityInStock);
			}
			else {
				System.out.println("\033[1m Product has higher demand increase the stock!!! \033[0m");
				System.err.println("Purchase Qty: "+purchaseQty+" Out of stock!!!");
			}
		}
		
		//Add inventory
		void addToInventory(int addInventory)
		{
			if (addInventory > 0)
				{
					quantityInStock = quantityInStock + addInventory;
					System.out.println("Added successfully in the inventory!!! "+productName+" Updated stock: "+quantityInStock);
				}
			else
				System.err.println("Invalid addInventory number!!!"+addInventory);
		}
		
		//Calculate total bill
		void totalBill(int purchaseQty, double price)
		{
			double grossBill = price * purchaseQty;
			double totalBill = 0;
			System.out.println("Total bill before discount: "+grossBill);
			
			if(grossBill >= 10000000)
			{
				System.out.println("\033[1m Thank you for being privileged Gold customers!!! "
						+ "Congratulations you have been offered 20% discount \033[0m");
				totalBill = grossBill - (grossBill*0.2);
				System.out.println("Total bill after discount: "+totalBill);
			}
			else if(grossBill >= 1000000)
			{
				System.out.println("\033[1m Thank you for being privileged Silver customers!!! "
						+ "Congratulations you have been offered 10% discount \033[0m");
				totalBill = grossBill - (grossBill*0.1);
				System.out.println("Total bill after discount: "+totalBill);
			}else
			{
				System.out.println("Thank you for the purchase! "
						+ "\033[1m Upgrade to the Gold membership for 20% disconunt \033[0m");
				System.out.println("Total bill after discount: "+grossBill);
			}
		}
		
		//Testing
		public static void main(String[] args) {
				
				//Initialization using no parameter constructor 
				Product p1 = new Product();
				Product p2 = new Product();
				
				//Initialization using parameterized constructor 
				Product p3 = new Product(100, "Samsung", 10000, 6000);
				Product p4 = new Product(101, "xPhone ", 15000, 5000);

				// Display inventory
				System.out.println("\033[1m Display inventory\033[0m");
				p1.displayInventory();
				p1.infoSeparator('*');
				p2.displayInventory();
				p2.infoSeparator('*');
				p3.displayInventory();
				p3.infoSeparator('*');
				p4.displayInventory();
				p4.infoSeparator('*');
				
				// update inventory
				System.out.println("Buy operation on "+ p4.productName +" qty in stock: "+p4.quantityInStock);
				
				p4.buyProduct(2000); // 4000 
				p4.infoSeparator('*');
				
				p4.buyProduct(100); // 10% discount
				p4.infoSeparator('*');
				
				p4.buyProduct(10); // No discount
				p4.infoSeparator('*');
				
				p4.buyProduct(3000); // Out of stock
				p4.infoSeparator('*');
				
				System.out.println("Add invertory operation on "+ p3.productName +" qty in stock: "+p3.quantityInStock);
				p3.addToInventory(1000); // 600
				p3.infoSeparator('*');
				
				p3.addToInventory(-100); // Error - invalid add inventory number
				p3.infoSeparator('*');
			}
}


