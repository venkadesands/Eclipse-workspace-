package com.select_statement;

import java.util.Scanner;

public class Cs_statement {

	public static void main(String[] args) {
//      	int mark=50;
		System.out.println("Enter the mark");
		Scanner scanner= new Scanner(System.in);
		int mark = scanner.nextInt();// its my mistake place
		System.out.println(mark);
		
		if (mark<=50) {
		System.out.println("Fail....");	
		}else if (mark>=60 && mark<70) {
			System.out.println("D Grade");
			
		}else if (mark>=70 && mark<80) {
			System.out.println("C Grade");
			
		}else if (mark>=80 && mark<90) {
			System.out.println("b Grade");
			
		}else if (mark>=90 && mark<=100) {
			System.out.println("S Grade");
			
		}else {
			System.out.println("Invalid marks");
		}
		
		
	}
}