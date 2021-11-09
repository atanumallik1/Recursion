package com.sap.recursion;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(digitSum(1221));
		System.out.println(digitSum(10010));
		System.out.println(digitSum(30));

	}

	public static long digitSum(long n) {
		if (n / 10 == 0)
			return n;
		else

			return n % 10 + digitSum(n / 10);

	}

}
