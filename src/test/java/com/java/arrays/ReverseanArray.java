package com.java.arrays;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int low=0;
		int high= arr.length-1;
		
		System.out.println(Arrays.toString(arr));
		
		while(high>low) {
			int temp= arr[low];
			arr[low]=arr[high];
			arr[high]= temp;
			low++;
			high--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] b= new int[arr.length];
		int j=arr.length;
		
		for(int i=0; i<arr.length; i++) {
			b[j-1]=arr[i];
			j=j-1;
		}
		
		System.out.println(Arrays.toString(b));
		
		int k, t;
		
		for(int i=0; i<b.length/2; i++) {
			t=b[i];
			b[i]=b[b.length-i-1];
			b[b.length-i-1]=t;
		}

		System.out.println(Arrays.toString(b));
	}

}
