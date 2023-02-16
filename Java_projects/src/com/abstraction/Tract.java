package com.abstraction;

public class Tract extends Abs {

	@Override
	public void phone_model() {
		System.out.println("xiaomi");
		super.phone_model();
	}
	
	
	@Override
	public void phone_price(int a) {
		//System.out.println("Phone price" + );
		super.phone_price(a);
	}


	@Override
	 void phone_name() {
		System.out.println("Poco M2 Pro");
		
	}


	@Override
	void phone_colour() {
		System.out.println("Diffrent Green");
		
	}
	@Override
	void phone() {
		System.out.println();
		
	}
	public static void main(String[] args) {
		 
		Tract ds = new Tract();
		ds.phone_model();
		ds.phone_price(15000);
		ds.phone_name();
		ds.phone_colour();
		ds.phone();
	}
	
	
	
	
	
}
