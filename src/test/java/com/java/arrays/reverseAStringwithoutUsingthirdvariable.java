package com.java.arrays;

public class reverseAStringwithoutUsingthirdvariable {

	public static void main(String[] args) {
		
		String str="Saurav";
		int len=str.length();
		
		System.out.println(len-1);
		
		System.out.println(str.substring(0,len-1));
		
		for(int i=(len-1); i>=0; --i) {
			System.out.println(i);
		   str += str.charAt(i);
		}
		
		System.out.println(str);
		str=str.substring(len);
        System.out.println(str);
		
		

	}

}
