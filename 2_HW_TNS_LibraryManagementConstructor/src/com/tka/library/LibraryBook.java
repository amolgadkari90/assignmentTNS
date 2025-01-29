package com.tka.library;

public class LibraryBook {
	
	private String title;
	private String author;
	private String isbn;
	private boolean available;
	
	//No parameter constructor 
	public LibraryBook() {
		super();
	}
	
	// 3 string parameter constructor 
	public LibraryBook(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	} 
	
	//Method to borrow the book
	private void borrowBook(LibraryBook book) {
		
		if(book.available)
		{
			System.out.println(book.title+" is available and now borrowed");
			book.available = false;
		}
		else
			System.out.println(book.title+" Book is unavailable check another book");
	}
	
	private void returnBook(LibraryBook book) {
		
		if(book.available)
			System.out.println(book.title+" is already available.");
		else
		{
			book.available = true;
			System.out.println(book.title+" Book is returned.");
		}
		
	}
	
	//Info separator
	
	static void infospaprator(char c)
	{
		for (int i = 0; i < 75; i++)
			System.out.print(c);
			System.out.println();
	}

	public static void main(String[] args) {
		
		LibraryBook book1 = new LibraryBook("The Catcher In The Rey", "J.D. Salinger", "978-0-06-306-76948-0");
		LibraryBook book2 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
		
		//Initial inventory
		System.out.println("\033[1m Initial inventory");
		System.out.println("\tTitle\t\t|"+"Author\t\t|"+"\t"+"isbn\t\t|"+"Status\t|\033[0m");
		LibraryBook.infospaprator('-');
		System.out.println(book1.title+"\t|"+book1.author+"\t|"+book1.isbn+"\t|"+book1.available+"\t|");
		System.out.println(book2.title+"\t|"+book2.author+"\t|"+book2.isbn+"\t|"+book2.available+"\t|");
		LibraryBook.infospaprator('*');
		//Demo
		System.out.println("\033[1mDemo -> borrowBook, returnBook\033[0m");
		book1.borrowBook(book1);
		book1.borrowBook(book2);
		book1.returnBook(book1);
		LibraryBook.infospaprator('*');
		
		System.out.println("\033[1mUpdated inventory\033[0m");
		System.out.println("Book 1 ( "+book1.title+" ) Availability : "+book1.available);
		System.out.println("Book 2 ( "+book2.title+" ) Availability : "+book2.available);
		LibraryBook.infospaprator('*');
	}
}
