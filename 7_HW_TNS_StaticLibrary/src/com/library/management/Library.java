package com.library.management;

public class Library {
	String author;
	String title;
	static private boolean isAvailable = true;
	
	public Library(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	public Library() {
		super();
	}
	
	void leGayaBook() {
		if(Library.isAvailable)
			System.out.println("Le gaya book: ");
		else System.out.println("Abhi tak aaya nahi book:");
		
		Library.isAvailable = false;
	}
	
	void aaGayaBook() {
		System.out.println("Aa gaya book: ");
		Library.isAvailable = true;
	}
	
	public static void main(String[] args) {
		
		Library ll =  new Library("Sahil", "Shamchi aai");
		ll.leGayaBook();
		System.out.println(ll.title +" = " + Library.isAvailable); //false
		ll.infoSeparator("***");
		
		Library ll2 =  new Library("Sahil", "Shamchi aai");
		ll2.leGayaBook();
		System.out.println(ll2.title +" = " + Library.isAvailable); //false
		ll2.infoSeparator("***");
		
		ll.aaGayaBook();
		System.out.println(ll.title +" = " + Library.isAvailable); //true
		ll.infoSeparator("***");
		
		ll2.aaGayaBook();
		System.out.println(ll2.title +" = " + Library.isAvailable); //true
		ll2.infoSeparator("***");
		
	}
	
	//Info separator
	void infoSeparator(String str)
	{
		for (int i = 0; i < 20; i++)
			System.out.print(str);
			System.out.println();
	}
}
