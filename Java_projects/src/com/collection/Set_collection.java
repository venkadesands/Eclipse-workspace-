package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Set_collection {
	
	public static void main(String[] args) {
		
		Set<Object> se = new HashSet<Object>();
		Set<Object> se1= new HashSet<Object>();
		
		
		se.add("Hey Everybody");
		se.add(002);
		se.add(88.8);
		se.add(null);
		se.add(100);
		se.add(null);
		se.add(3);
		se1.add(440);
		se1.add("world");
		
		System.out.println(se); 
		System.out.println(se1);
		
		int size = se.size();
		System.out.println(size);
		
		se.remove(3);
		System.out.println(se);
		
		boolean c = se.contains(2);
		System.out.println(c);
		 
		se.addAll(se1);
		System.out.println(se);
		
		se.retainAll(se1);
		System.out.println(se);
		
	}
	
	
}
