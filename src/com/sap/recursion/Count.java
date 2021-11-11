package com.sap.recursion;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(counZeroes(10));
	}

	static int counZeroes(int n) {

		return helper(n, 0);

	}

	private static int helper(int n, int coutSoFar) {

		int rem = n % 10;

		if (rem == 0) {
			coutSoFar = coutSoFar + 1;
		}

		if (n == 0)
			return coutSoFar;
		else

			return helper(n / 10, coutSoFar);

	}

}
