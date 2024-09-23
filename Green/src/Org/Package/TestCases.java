package Org.Package;

public class TestCases {
	    public static void main(String[] args) {
	        int[] stocks = {5, 100, 1200, 300, 400, 500};  // input array
	        System.out.println(findSecondMax(stocks));
	    }

	    public static int findSecondMax(int[] stocks) {
	        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

	        for (int stock : stocks) {
	            if (stock > max) {
	                secondMax = max;
	                max = stock;
	            } else if (stock > secondMax && stock != max) {
	                secondMax = stock;
	            }
	        }

	        return secondMax;
	    }
	}
