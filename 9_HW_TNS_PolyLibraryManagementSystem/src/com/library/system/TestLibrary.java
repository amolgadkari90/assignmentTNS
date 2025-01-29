package com.library.system;

public class TestLibrary {

	public static void main(String[] args) {
		
		DVD dvd = null;
		EBook ebook = null;
		Book book = null;
		LibraryItem libItem = null;
		LibraryItem libItem1 = null;
		
		dvd = new DVD("Digpal Lanjekar", "2h10m");
		dvd.title = "Pawankhind";
		dvd.author ="Digpal Lanjekar";
		dvd.location ="Shelf 1, slot 2, item number 10";
		dvd.displayInfo();
		TestLibrary.infoSpaprator();
	
		ebook = new EBook("PDF", "500kb");
		ebook.title = "Programming with JAVA ";
		ebook.author ="E. Balagurusamy";
		ebook.location ="Shelf 3, slot 4, item number 20";
		ebook.displayInfo();
		TestLibrary.infoSpaprator();
		
		book = new Book("Horror", 326);
		book.title = "The Shining";
		book.author = "Stephen King"; 
		book.location = "Shelf 5, slot 6, item number 30";
		book.displayInfo();
		TestLibrary.infoSpaprator();
		
		libItem = new LibraryItem("The Catcher In The Rey", "J.D. Salinger", "Shelf 7, slot 8, item number 40");
		libItem.displayInfo();
		TestLibrary.infoSpaprator();
		
		libItem1 = new LibraryItem("To Kill a Mockingbird", "Harper Lee", "Shelf 15, slot 5, item number 37");
		libItem1.displayInfo();	
		TestLibrary.infoSpaprator();
		
		System.out.println("Total Items in the library: \t"+LibraryItem.totalItems);
		
	}
	
	//Info separator
	
	static void infoSpaprator()
	{
		for (int i = 0; i < 15; i++)
			System.out.print("****");
			System.out.println();
	}

}
