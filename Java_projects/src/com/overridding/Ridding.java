package com.overridding;

public class Ridding extends Over {
	@Override
	public void collegedetails() {
		// TODO Auto-generated method stub
		super.collegedetails();
	}
@Override
public void collegename(String a) {
	// TODO Auto-generated method stub
	super.collegename(a);
}
	public void collegegrade(char b) {
		System.out.println("College grade "+ "      : " + b );

	}
	public void place(String b) {
		System.out.println("College in "+ "         :" + b );

	}

	public static void main(String[] args) {
		
		Ridding bc = new Ridding();
		bc.collegedetails();
		bc.collegename(" Erode Sengunthar Engineering college");
		bc.collegegrade('A');
		bc.place("Erode");
		
		
	}
	
}
