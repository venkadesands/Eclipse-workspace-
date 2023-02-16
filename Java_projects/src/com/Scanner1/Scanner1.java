package com.Scanner1;

import java.util.Scanner;

public class Scanner1 {
public static void main(String[] args) {
	Scanner be = new  Scanner(System.in);
	System.out.println("Enther the register number");
	
	int code = be.nextInt();
	System.out.println(code);
	 
	System.out.println("Choose your course");
	String name = be.nextLine();
	System.out.println("Selenium");
	  
	System.out.println("Course fees");
	int a = be.nextInt();
	System.out.println(a);
	
	
}
}
