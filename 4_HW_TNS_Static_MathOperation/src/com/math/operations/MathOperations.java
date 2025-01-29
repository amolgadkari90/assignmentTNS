package com.math.operations;

import java.util.Scanner;

public class MathOperations {
	
	static int add(int n1, int n2) {
		return (n1 + n2);
	}

	public static void main(String[] args) {
		System.out.println("Static method can be called using class name");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();
				
		System.out.println("Adding "+ n1 +" and "+ n2 + " = " + MathOperations.add(n1, n2));
		sc.close();
	}
}
