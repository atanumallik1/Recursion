package com.sap.recursion;

public class Factorial {
	public static void main(String args[]) {
		System.out.println(factorialCalculate(4));
		System.out.println(factorialCalculate(5));


	}

	public static long factorialCalculate(int n) {

		if (n == 1)
			return n;
		else
			return n * factorialCalculate(n - 1);

	}
}
