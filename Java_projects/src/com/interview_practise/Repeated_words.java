package com.interview_practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repeated_words  {

	
	
	public static void main(String[] args) {

		String s = "buy the people for the people of the people";

		String[] spt = s.split(" ");

		Map<String, Integer> m = new LinkedHashMap<>();

		for (String str : spt) {

//		System.out.println(str);
			if (m.containsKey(str)) {

				Integer n = m.get(str);

				m.put(str, n + 1);

			}

			else {
				m.put(str, 1);

			}

		}
		System.out.println(m);
	}

}
