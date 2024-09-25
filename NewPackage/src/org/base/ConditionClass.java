package org.base;


public class ConditionClass {
	
	private void voter(int age) {
   
	   //10>=18
	   if(age>=18) {
         System.out.println("ok");
	   }
	   else {
		 System.out.println("not ok");
	   }
		
	}
    public static void main(String[] args) {
		ConditionClass c=new ConditionClass();
		c.voter(18);
	
	}
}
