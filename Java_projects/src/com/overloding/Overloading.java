package com.overloding;


public class Overloading {

	private void Institute() {
		System.out.println("Did you decide the institute = Yes");

	}
	private void Institute(int a) {
		System.out.println("Number of the Institute" +  ": "  + a);
	}
	
	private void Institute(float b) {
		System.out.println("Grade of the institute " + ": " + b);
	}
	private void Institute(String c) {
		System.out.println("Feed back of the institute " + ": " + c);
	}
	
	public static void main(String[] args) {
		
		Overloading ac = new Overloading();
		ac.Institute();
		ac.Institute(4);
		ac.Institute(1.0f);
		ac.Institute("Good..");
		
		
		
		
		
	}
	
}
