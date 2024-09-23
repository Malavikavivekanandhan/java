package org.base;

public class Old {
	public static void main(String[] args) {
		String s="java";
	    int length = s.length();
	    System.out.println(length);
	    
	    char charAt = s.charAt(3);
	    System.out.println(charAt);
	    
	    int indexOf = s.indexOf("a");
	    System.out.println(indexOf);
	    
	    boolean empty = s.isEmpty();
	    System.out.println(empty);
	    
	    boolean contains = s.contains("a");
	    System.out.println(contains);
	    
	    String trim = s.trim();
	    System.out.println(trim);
	    
	    boolean startsWith = s.startsWith("ja");
	    System.out.println(startsWith);
	    
	    boolean endsWith = s.endsWith("av");
	    System.out.println(endsWith);
	    
	    String upperCase = s.toUpperCase();
	    System.out.println(upperCase);
	    
	    String lowerCase = s.toLowerCase();
	    System.out.println(lowerCase);
	    
	    String a="Swetha";
	    String b="SWETHA";
	    
	    boolean equalsIgnoreCase = s.equalsIgnoreCase("a");
	    System.out.println(equalsIgnoreCase);
	    
	    String replace = a.replace("Swetha","rohini");
	    System.out.println(replace);
	    
	    String replaceAll = b.replaceAll("srimathi","swetha");
	    System.out.println(replaceAll);
	    
	    String d="communication";
	    
	    String substringe = d.substring(5);
	    System.out.println(substringe);
	    
	    String substringf = d.substring(5, 11);
	    System.out.println(substringf);
	    
	    int compareTo = s.compareTo("m");
	    System.out.println(compareTo);
	    
	   
	    
	    
	    
	}
}