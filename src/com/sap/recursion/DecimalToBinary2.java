package com.sap.recursion;

public class DecimalToBinary2 {

	public static void main(String[] args) {
		 System.out.println(findBinary(12, ""));

	}

	public static String findBinary(int decimal, String result) {

		if (decimal == 0)
			return result;

		result = decimal % 2 + result;
		return findBinary(decimal / 2, result);

	}

}
