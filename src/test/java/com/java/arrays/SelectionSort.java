package com.java.arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {3,4,1,6,2,8,5,10};
		int n=arr.length;
		
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr, n);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void selectionSort(int[] arr, int n) {
		int min_index=0;
		for(int i=0; i<n; i++) 
		{
			min_index=i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			
			int temp= arr[min_index];
			arr[min_index]= arr[i];
			arr[i]= temp;
		}
		
	}

}
