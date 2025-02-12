package com.luman.gradecalculator;

import java.util.Scanner;

public class GradeCalculator 
{
	static double examScore;
	static boolean isExit = false;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		while (!isExit )
		{
			System.out.print("Enter the exam score: ");
			examScore = sc.nextDouble();
			if (examScore > 100 || examScore < 0 )
			{
				System.err.println("Exam score must be in range between 0 to 100");
			}
			else
			{
				if ( examScore >= 90  )
					System.out.println("The grade is A.");
				else if ( examScore >= 80 &&  examScore < 90 )
					System.out.println("The grade is B.");
				else if ( examScore >= 70 &&  examScore < 80 )
					System.out.println("The grade is C.");
				else if ( examScore >= 60 &&  examScore < 70 )
					System.out.println("The grade is D.");
				else if ( examScore < 60 )
					System.out.println("The grade is F.");			
			}		
		}
		System.out.println("Do you want to continue? y/n");
		String ch = sc.nextLine();
		if (ch.equals("Y") || ch.equals("y") )
		{
			isExit = false;
		}
		else
		{
			isExit = true;
		}
		
	}
}
