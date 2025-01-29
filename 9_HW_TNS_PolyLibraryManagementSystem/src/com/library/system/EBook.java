package com.library.system;

public class EBook extends LibraryItem {
	String format;
	String fileSize;
	
	public EBook(String format, String fileSize) {
		super();
		this.format = format;
		this.fileSize = fileSize;
		totalItems++;
	}

	@Override
	void displayInfo(){
		System.out.println("Title: \t\t\t"+ title);
		System.out.println("Author: \t\t"+ author);
		System.out.println("Location: \t\t"+ location);
		System.out.println("Format: \t\t"+ format);
		System.out.println("File size: \t\t"+ fileSize);
	}
}
