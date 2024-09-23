package org.base;
//child
public class Employee {
	private void employeeId() {
		System.out.println("36778");
		

	}
	private void employeeName() {
		System.out.println("swetha");
		
	}
	private void employeeAddress() {
		System.out.println("erode");
		

	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.employeeId();
		e.employeeName();
		e.employeeAddress();
		Company c = new Company();
	    c.companyId();
		c.companyName();
		c.companyAddress();
		
		
	}

}
