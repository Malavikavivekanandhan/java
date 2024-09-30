package org.base;

public class Palinodromes {
	public static void main(String[] args) {
		
		String s="123";
		
		String a="";
		
		for(int i=s.length()-1;i>=0;i--) {
		System.out.println(s.charAt(i));
		a=a+s.charAt(i);
			
		}
	System.out.println(a);
		
	if(s.equals(a)){
	    System.out.println("palinodrome");
	}
    else {
		System.out.println("non palinodrome");
	}
	
	}
}