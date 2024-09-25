package org.base;

import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		Set s1=new LinkedSet();
		s1.add(10);
		s1.add("mala");
		s1.add('m');
		s1.add(12.38f);
		s1.add(true);
		System.out.println(s1);
	}

}
