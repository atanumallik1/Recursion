package com.sap.recursion;

public class DecimanToBinary {
	
	public static int result;

	public static void main(String args[]) {

 		convert(5);
		System.out.println(result);
		
		
		convert(15);
		System.out.println(result);
		
		
		convert(10);
		System.out.println(result);
		
		convert(59);
		System.out.println(result);

		// result = convert(16, 0);
		// System.out.println(result);

	}

	public static void convert(int number ) {

		if (number == 0) {
			result = 0;
			return;

		}
		int remainder = number % 2;

		convert(number / 2);
		result = result * 10 + remainder;

	}
}
