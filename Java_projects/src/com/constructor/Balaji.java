package com.constructor;

public class Balaji {
	
	
public Balaji() { // default constructor
	System.out.println("Hi karthi it's my details");
	
}
	public Balaji(int a) {
		this();
		System.out.println("Balaji age "+ a);
		
	}
	
	
	public Balaji(double b) {
		this(26);
		System.out.println("Balaji height  " + b );
		
	}
	
	public Balaji(char c) {
		this(173.5);
		System.out.println("Balaji grade " + c);
	}
	
	
	public static void main(String[] args) throws Throwable {
		
//		Balaji er = new Balaji(26);
//		Balaji er1 = new Balaji(173.5);
//		Balaji er2 = new Balaji('A');
		Balaji er = new Balaji('A');
		er.finalize();
	}
}
