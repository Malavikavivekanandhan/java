package org.sample;
//1)same class
//2)same method
//3)different arguments
public class company {
//	"Akash";
	private void empData(String name ,int a) {
		System.out.println("emp name is "+name );
		this.empData(10);
		this.empData('a');
    }
//	20;
	private void empData(int age) {
		System.out.println("emp age is "+age);
	}
	private void empData(char a) {
		System.out.println("emp age is "+a);
	

	}
    public static void main(String[] args) {
		company c = new company();
		
		c.empData("Arun",10);
		
 
    }
}
