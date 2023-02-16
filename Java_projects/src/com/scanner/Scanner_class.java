package com.scanner;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String");
          String name = sc.nextLine();
          System.out.println(name);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
         System.out.println(n);	
         
  
         
          System.out.println("Enter the string or char");
          String s = sc.next();
          System.out.println(s);
          
          System.out.println("Enter the Grade");
         char  c = sc.next().charAt(0);
          System.out.println(c);
	}			
	
	
	
}
