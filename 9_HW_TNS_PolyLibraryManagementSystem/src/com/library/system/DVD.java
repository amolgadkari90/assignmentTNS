package com.library.system;

public class DVD extends LibraryItem {
	
	String director;
	String runTime;
	

	public DVD(String director, String runTime) {
		super();
		this.director = director;
		this.runTime = runTime;
		totalItems++;
	}
	
	@Override
	void displayInfo(){
		System.out.println("Title: \t\t\t"+ title);
		System.out.println("Author: \t\t"+ author);
		System.out.println("Location: \t\t"+ location);
		System.out.println("Director: \t\t"+ director);
		System.out.println("Run Time: \t\t"+ runTime);
	}





}
