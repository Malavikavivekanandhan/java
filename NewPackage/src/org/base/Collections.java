package org.base;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(23);
		li.add("mala");
		li.add('m');
		li.add(12.38f);
		li.add(true);
		System.out.println(li);
		
		for(int i=0;i<=4;i++) {
			Object Object = li.get(i);
			System.out.println(Object);
		}
		
		
		
	}

}
