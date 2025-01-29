package com.human;

public class Person {
	
	private String name;
	private int age;
	//No parameter constructor
	public Person() {
		super();
	}
	//Parameterized constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//Display info
	void displayInfo(int n)
	{
		if (name != ""  && name != null && age >= 0)
			System.out.println("Person "+n+" : Name: "+name+", Age: "+age);
		else {
			System.err.println("Name is emply/null or invalid age");
		}		
	}	
	
	//Info separator
	void infoSeparator(char c)
	{
		for (int i = 0; i < 20; i++)
			System.out.print(c);
			System.out.println();
	}

	public static void main(String[] args) 
	{
		//Object
		Person p1 = new Person("Alice", 25);
		Person p2 = new Person("Bob", 30);
		Person p3 = new Person();
		Person p4 = new Person("", 25);
		Person p5 = new Person("Tom", -10);
		
		//Display
		System.out.println("\033[1m Display person info. \033[0m");
		p1.displayInfo(1);		
		p2.displayInfo(2);
		p1.infoSeparator('*');
		
		System.out.println("\033[1m Error path\033[0m");
		p3.displayInfo(3);
		p4.displayInfo(4);
		p5.displayInfo(5);
		p1.infoSeparator('*');
		
		
	}
}
