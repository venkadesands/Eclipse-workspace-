package org.all;

import org.english.English;
import org.tamil.Tamil;
import org.telgu.Telgu;

public class Languageclass implements Tamil,English,Telgu  {

private void alllanguage() {
	System.out.println("This is india ");
}
	

	@Override
	public void tamillanguage() {
		System.out.println("This is Tamilanadu");
		
	}
 
	@Override
	public void telgulanguage() {
System.out.println("This is Andra");
		
	}

	@Override
	public void englishlanguage() {
		System.out.println("This is Universel Language");
		
	}
		
	public static void main(String[] args) {
		   
		 Languageclass tr = new  Languageclass ();
		tr.alllanguage();
		 tr.tamillanguage();
		 tr.telgulanguage();
		 tr.englishlanguage();
	}
		
	}
	
	

