package com.java.arrays;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Saurav";
		
		for(int i = 0; i < s.length(); i++)
		{
		    s = s.substring(1, s.length() - i) + s.charAt(0) + s.substring(s.length() - i);
		    System.out.println(s);
		}
		System.out.println(s);

	}

}
