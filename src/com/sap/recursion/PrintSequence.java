package com.sap.recursion;

public class PrintSequence {
	public static void main(String args[]) {
		 // print(20);
		
		printReverse(20);
	}

	public static void print(int n) {

		if (n == 0)
			return;
		else {
			System.out.println(n + " ");
			print(n - 1);
		}
	}

	public static void printReverse(int n) {

		if (n == 0)
			return;
		else {
			printReverse(n-1);
			System.out.println(n);
		}

	}

}
