package com.java.ipAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateString {

	public static void main(String[] args) {
		String c="hdg$h&k8^iossh6";
		
		Pattern ptr= Pattern.compile("[^a-zA-Z0-9]");
		
		Matcher match= ptr.matcher(c);
		
		while(match.find()) {
			String s=match.group();
			System.out.println(s);
			c=c.replace(s, "");
			
		}
		
		System.out.println(c);
		

	}

}
