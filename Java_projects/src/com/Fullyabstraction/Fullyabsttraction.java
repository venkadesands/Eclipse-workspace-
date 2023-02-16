package com.Fullyabstraction;

public class Fullyabsttraction implements Fully, Abs {

	@Override
	public void computer_configuration() {
		System.out.println("Intel core i3");
		
	}

	@Override
	public void computer_colour() {
		System.out.println("Grey");  
		
	}

	@Override
	public void computer_details() {
		System.out.println("HP ");
		
	}

	@Override
	public void computer_name() {
		
		System.out.println("Pavilion G6");
	}

	public static void main(String[] args) {
		Fullyabsttraction bc = new Fullyabsttraction();
		
		bc.computer_name();
		bc.computer_details();
		bc.computer_colour();
		bc.computer_configuration();
		
	}
	
	
	
	
}
