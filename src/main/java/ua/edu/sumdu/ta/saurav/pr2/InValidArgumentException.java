package ua.edu.sumdu.ta.saurav.pr2;

@SuppressWarnings("serial")
public class InValidArgumentException extends Exception{
	
	String message;
	InValidArgumentException(String message){
		super(message);
	}

}
