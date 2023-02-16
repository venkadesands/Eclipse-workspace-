package com.collection;

import java.util.ArrayList;
import java.util.List;



public class Collection {

	public static void main(String[] args) {

		
		List<Object> col = new ArrayList<Object>();
		List<Object> col1 = new ArrayList<Object>();
		
		col.add("Balaji");
		col.add(27);
		col.add("bodinayakanur");
		col.add("TN " + 60 );
		col.add("Theni District");
		col.add("The Hidden Earth Paradise");
		col1.add("Happy");
		col1.add("Long");
		
		System.out.println(col+"\n"+col1);
		//System.out.println(col1);
		
		int s = col.size();
		System.out.println(s);
		
		Object g = col.get(4);
		System.out.println(g);
		
		col.set(4, "Super");
		System.out.println(col);
		
		col.remove(0);
		System.out.println(col);
		
		int io = col.indexOf("Balaji");
		System.out.println(io);
		
		int i = col.indexOf(27);
		System.out.println(i);
		
		
		boolean c = col.contains("bodinayakanur");
		System.out.println(c);
		
		col.addAll(col1);
		System.out.println(col);
		
		col.retainAll(col1); //compare for common valaue from col
		System.out.println(col);
		
		
		col.removeAll(col1);
		System.out.println(col);
	}
	
	
	
	

	
}
