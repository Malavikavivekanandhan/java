package org.base;

import java.util.HashSet;
import java.util.LinkedSet;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
//		random
	    Set s=new HashSet();
		s.add(10);
		s.add("mala");
		s.add('m');
		s.add(12.38f);
		s.add(true);
		System.out.println(s);
//		insertion
		Set s1=new LinkedSet();
		s1.add(10);
		s1.add("mala");
		s1.add('m');
		s1.add(12.38f);
		s1.add(true);
		System.out.println(s1);
//		decending order
		Set s2=new TreeSet();
		s2.add(10);
		s2.add("mala");
		s2.add('m');
		s2.add(12.38f);
		s2.add(true);
		System.out.println(s2);
		
		int size=s.size();
		System.out.println(size);
		
		Boolean add=s1.add("malavika");
		System.out.println(add);
		System.out.println(s1);
		
		Boolean contains=s2.contains(5&8);
		System.out.println(contains);
		System.out.println(s2);
		
		
		

	}	
	
	
}
