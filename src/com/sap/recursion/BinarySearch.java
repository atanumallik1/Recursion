package com.sap.recursion;

public class BinarySearch {
	public static void main(String args[]) {
		int data [] = {-3, -2, -1, 6, 9, 11, 23} ;
		System.out.println(search(11,data,0, data.length-1));
		
		
		System.out.println(search(111,data,0, data.length-1));


	}

	public static boolean search(int num, int[] data, int start, int end) {
        //base condition
		if(start > end)
			return false; 
		
		
		int mid = (start + end) / 2;
		if (data[mid] == num)
			return true;

		else if (num > data[mid]) {
			return search(num, data, mid + 1, end);

		} else if (num < data[mid]) {

			return search(num, data, start, mid - 1);

		} else
			return false;

	}

}
