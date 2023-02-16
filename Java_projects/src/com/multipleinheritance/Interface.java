package com.multipleinheritance;

public class Interface implements Class1,Class2 {

	@Override
	public void patient3() {
		System.out.println("Fever");
		
	}  

	@Override
	public void patient4() {
	 System.out.println("cold");
		
	}

	@Override
	public void patient1() {
		System.out.println("Body pain");
		
	}

	@Override
	public void patient2() {
		System.out.println("headache");
		
	}

	public static void main(String[] args) {
		
		Interface s = new Interface();
		s.patient1();
		s.patient2();
		s.patient3();
		s.patient4();
		
	
		
		
	}
	
	
	
	
}
