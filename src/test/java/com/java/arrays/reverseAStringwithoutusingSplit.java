package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class reverseAStringwithoutusingSplit {

	public static void main(String[] args) {
		String str="My name is khan";
		List<String> lst= new ArrayList<String>();
		
		List<String> newlst=reveseAString(str, lst);
		
		StringBuilder revstr= new StringBuilder();
		
		for(int i=newlst.size()-1; i>=0; i--) {
			revstr.append(newlst.get(i)+" ");
		}
		
		System.out.println(revstr.toString());

	}
	
	static List<String> reveseAString(String str, List lst){
		int index= str.indexOf(" ");
		lst.add(str.substring(0, index));
		
		str= str.substring(index+1);
		
		if(str.indexOf(" ")== -1) {
			lst.add(str);
			return lst;
		}
		
		return reveseAString(str, lst);
	}

}
