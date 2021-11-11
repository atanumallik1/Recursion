package com.sap.recursion;

public class Reverse {

	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revernum(568945);
		System.out.println(sum);

	}

	public static void revernum(int n) {

		int remainder = n % 10;
		int div = n / 10;

		if (n == 0)
			return;
		else {
			sum = sum * 10 + remainder;
			revernum(div);

		}
	}

}
