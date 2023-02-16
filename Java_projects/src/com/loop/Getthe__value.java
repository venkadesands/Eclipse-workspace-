package com.loop;

import java.util.Scanner;

public class Getthe__value {

	public static void main(String[] args) {
		int n ;
		Scanner Scanner= new Scanner(System.in);
		System.out.println("Enter the any Number then its give only diviseble at 10 ");
		n=Scanner.nextInt();
		while (n>=0) {
			if (n%10==0) {
				System.out.println(n);
				break;
			}
			
			n--;	
		}
		
	}
}
