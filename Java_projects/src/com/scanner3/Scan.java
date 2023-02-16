package com.scanner3;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		
		Scanner ji = new Scanner (System.in);
		System.out.println("Enter the details");
		
		System.out.println("What is your Name : ");
	       String a = ji.next();
		System.out.println(a);
		
		System.out.println("What is your age : ");
		int b = ji.nextInt();
		System.out.println(b);
		
		System.out.println("What is your Aim : ");
		String c = ji.nextLine();
		System.out.println(c);
		
		System.out.println("What is your employee Number : ");
		double d = ji.nextDouble();
		System.out.println(d);
		
	} 
	
}
