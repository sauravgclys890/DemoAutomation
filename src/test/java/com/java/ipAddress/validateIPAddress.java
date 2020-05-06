package com.java.ipAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IPAddressvalidator{
	private Pattern pattern;
	private Matcher matcher;
	
	private static final String IPADDRESS_PATTERN=
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
	        ;
	
	public IPAddressvalidator() {
		pattern=Pattern.compile(IPADDRESS_PATTERN);
	}
	
	public boolean validate(final String ip) {
		matcher=pattern.matcher(ip);
		System.out.println(matcher.toString());
		return matcher.matches();
	}
}

public class validateIPAddress {
	
	private static IPAddressvalidator ipAddressValidator;
	
	public static void main(String[] args) {
	
		ipAddressValidator= new IPAddressvalidator();
		boolean flag=ipAddressValidator.validate("101.12.25.34");
		System.out.println(flag);
		

	}

}
