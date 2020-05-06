package com.java.arrays;

import java.util.Arrays;

public class ArrayRotation {
	
	public static void main(String agrs[]) {
		int arr[] = { 1,2,3,4,5,6,7};
		int d=2;
		int size= arr.length;
	rotateAnArray(arr, d, size);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateAnArray(int arr[], int d, int n) {
		for(int i=0; i<d; i++) {
			leftRotaeByOne(arr, n);
		}
		
	}

	private static void leftRotaeByOne(int[] arr, int n) {
		int temp = arr[0];
		int i;
		for(i=0; i<n-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[i]= temp;
		
	}

}

//Time complexity= O(n*d)
//Auxiliary space = O(1)