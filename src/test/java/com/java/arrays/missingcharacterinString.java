package com.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class missingcharacterinString {

	public static void main(String[] args) {
		String str="my name is saurav kumar";
		
		str= str.replaceAll(" ", "");
		System.out.println(str);
		
		String[] userStr= str.toLowerCase().split("");
		
		String[] alphbet= "abcdefghijklmnopqerstuvwxyz".split("");
		
		Set<String> set1= new HashSet<String>(Arrays.asList(userStr));
		Set<String>  set2= new HashSet<String>(Arrays.asList(alphbet));
		//Set<String>  set3= new HashSet<String>();
		
		for(int i=0; i<set2.size()-1; i++) {
			if(set2.contains(userStr[i])) {
				set2.remove(userStr[i]);
			}
		}
		
		//set2.removeAll(set1);
		
		System.out.println(set2);

	}

}
