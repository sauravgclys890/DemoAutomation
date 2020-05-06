package com.java.arrays;

import java.util.Arrays;

public class ArrayRotationUsingReverseAlgo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d=2;
		int n=arr.length;
		rotateArray(arr, d, n);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void rotateArray(int[] arr, int d, int n) {
		if(d==0)
			return;
		
		rverseAnArray(arr, 0, d-1);
		rverseAnArray(arr, d, n-1);
		rverseAnArray(arr, 0, n-1);
	}
	
	private static void rverseAnArray(int[] arr, int start, int end) {
		int temp;
		while(end> start) {
			temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--;
		}
	}

}

//TimeComplexity= O(n)
