package com.sap.recursion;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverseAString("atanu"));
	}

	public static String reverseAString(String input) {

		if (input.equals(""))
			return "";
		else

			return reverseAString(input.substring(1)) + input.charAt(0);
	}

}
