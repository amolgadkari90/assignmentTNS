package com.library.system;

public class LibraryItem {
	String title;
	String author;
	String location;
	static int totalItems;
	
	public LibraryItem() {
		super();
	}

	public LibraryItem(String title, String author, String location) {
		super();
		this.title = title;
		this.author = author;
		this.location = location;
		totalItems++;
	}

	void displayInfo(){
		System.out.println("Title: \t\t\t"+ title);
		System.out.println("Author: \t\t"+ author);
		System.out.println("Location: \t\t"+ location);
	}
	
	
//	public void borrow()
//	{
//		
//		if (available)
//		{
//			System.out.println(title +" you can borrow!!!");
//			available = false;			
//		}
//		else System.out.println(title +" is unavailable!!!");
//	}
//	


	
}
