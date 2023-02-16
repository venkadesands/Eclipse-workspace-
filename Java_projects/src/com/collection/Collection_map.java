package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_map {
	
	public static void main(String[] args) {
		
		Map<Integer,String>ma = new HashMap<Integer,String> (); 
		
		ma.put(1, "Exam Details");
		ma.put(2, "number of Vacancies");
		ma.put(3, "Common vacancies 999");
		ma.put(4, null);
		ma.put(null, "Try it");	
		ma.put(null, "Dont waste your time");
		ma.put(5, "Not possible for Men");
		
		System.out.println(ma);
		
		int s = ma.size();
		System.out.println(s);
		
		String g = ma.get(null);
		System.out.println(g);
		 
		Set<Integer> ks = ma.keySet();
		System.out.println(ks);
		
		Collection<String> v = ma.values();
		System.out.println(v);
		
		
		boolean ck = ma.containsKey(5);
		System.out.println(ck);
		
		boolean cv = ma.containsValue("Exam Details");
		System.out.println(cv);  
		
		Set<Entry<Integer, String>> es = ma.entrySet();
		System.out.println(es);
	}

}
