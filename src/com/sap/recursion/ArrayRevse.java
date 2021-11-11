package com.sap.recursion;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayRevse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 6, 3, 4, 6 };
		reverseMyArray(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void reverseMyArray(int[] array, int start, int end) {

		if (start >= end)
			return;
		else {
			int temp;
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			reverseMyArray(array, ++start, --end);

		}

	}
}
