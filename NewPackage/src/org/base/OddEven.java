package org.base;

public class OddEven {
	private void even(int a) {
		if(a>=18) {
			System.out.println(a+"is even");
		}
		else {
			System.out.println(a+"is odd");
		}
	}
	private void odd(int b) {
		if(b>=7) {
			System.out.println(b+"is even");
		}
		else {
			System.out.println(b+"is odd");
		}
	}
	public static void main(String[] args) {
		OddEven o=new OddEven();
		o.even(18);
		o.odd(7);
		
	}

}
