package com.polymorphism;

public class Overloading {
	
	public void visitor(String name) { //visitor = method 
		System.out.println(name);
	}
	private void visitor(int age,int tokennumber) {
		System.out.println(age+"\n" + tokennumber);
	}
	
	private void visitor(char gender) {
System.out.println(gender);
	}
	private void visitor() {
System.out.println("Accounttype");
	}
	public static void main(String[] args) {
		Overloading bank = new Overloading ();//bank = object
		bank.visitor("gopi.k.G");
		bank.visitor(23, 1);
		bank.visitor('m');
		bank.visitor("saving");
		
	}
}

