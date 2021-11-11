package com.sap.recursion;

public class MergeSort {
	public static void main(String args[]) {

	}

	public static void mergeSort(int[] data, int start, int end) {

		// base condition
		if (start == end)
			return;

		int mid = (start + end) / 2;
		mergeSort(data, start, mid);
		mergeSort(data, mid + 1, end);

		merge(data, start, mid, end);

	}

	public static void merge(int[] data, int start, int mid, int end) {

		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= end) {

			if (data[i] <= data[j]) {
				temp[k] = data[i];
				k++;
				i++;
				
			}else {
				temp[k] = data[j];
				k++;
				j++;
			}
			
		}
		
		
		for( int n = i; n <= mid ;n++) {
			temp[k] = data[n];
			k++;
		}
		
		for( int n = j; n <= end ;n++) {
			temp[k] = data[n];
			k++;
		}
		
		// put data data back on the main array
		for( i= start ; i <= end; i++) {
			
			data[ i] = temp [i - start];
		}

	}

}
