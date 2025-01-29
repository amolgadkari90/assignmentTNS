package com.library.system;

public class Book extends LibraryItem {
	LibraryItem obj = null;
	String genre;
	int numberOfPages;
	
	
	public Book(String genre, int numberOfPages) {
		super();
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		totalItems++;
	}

	@Override
	void displayInfo(){
		System.out.println("Title: \t\t\t"+ title);
		System.out.println("Author: \t\t"+ author);
		System.out.println("Location: \t\t"+ location);
		System.out.println("Genre: \t\t\t"+ genre);
		System.out.println("Number of pages: \t"+ numberOfPages);
	}
	

	
	

}
