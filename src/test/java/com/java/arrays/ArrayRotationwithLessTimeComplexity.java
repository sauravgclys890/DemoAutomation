package com.java.arrays;

import java.util.Arrays;

public class ArrayRotationwithLessTimeComplexity {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int d=3;
		int n=arr.length;

		rotateArray(arr, d, n);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateArray(int[] arr, int d, int n) {
		int i, j, k ,temp;
		
		for(i=0; i<calculategcd(d,n); i++) {
			
			temp= arr[i];
			j=i;
			while(true) {
				k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}
		
	}
	
	private static int calculategcd(int a, int b) {
		
		if(b ==0)
			return a;
		else
			return calculategcd(b, a%b);
	}

}

//Time complexity = O(n)
