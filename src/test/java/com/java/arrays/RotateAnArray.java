package com.java.arrays;

import java.util.Arrays;

public class RotateAnArray {

	static int[] arr= {1,2,3,4,5};
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(arr));
		
		rotate();
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotate() {
		int temp = arr[arr.length-1];
		int i;
		
		for(i= arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
	}

}
