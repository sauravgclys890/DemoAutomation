package com.java.arrays;

import java.util.Arrays;

public class findPivotinRotatedArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int d=2;
		int n= arr.length;
		int key=5;
		System.out.println(Arrays.toString(arr));
		rotateArray(arr, d, n);
		System.out.println(Arrays.toString(arr));
		int pivot=findPivot(arr, 0, n-1);
		if(pivot==-1)
			System.out.println(binarySearch(arr, 0, n-1, key));
		
		if(arr[pivot]==key)
			System.out.println(pivot);
		
		System.out.println(binarySearch(arr, 0, n-1, key));
	}
	
	static int findPivot(int[] arr, int low, int high) {
		int mid= (low+high)/2;
		if(low>high)
			return -1;
		if(high==low)
			return low;
		
		if(high>mid && arr[mid]>arr[mid+1])
			return mid;
		if(high>mid && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[low]>=arr[mid])
			return findPivot(arr, low, mid-1);
		return findPivot(arr, mid+1, high);
	}
	
	static int binarySearch(int[] arr, int low, int high, int key) {
		if(low>high)
			return -1;
		int mid= (low+high)/2;
		if(arr[mid]== key)
			return mid;
		if(arr[mid]>key)
			return binarySearch(arr, low, mid-1, key);
		return binarySearch(arr, mid+1, high, key);
		
	}
	
	static void rotateArray(int[] arr, int d, int n) {
		if(d==0)
			return;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
	}
	
	static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}

}
