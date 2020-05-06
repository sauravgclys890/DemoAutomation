package ua.edu.sumdu.ta.saurav.pr2;

@SuppressWarnings("serial")
public class InvalidIndexNumber extends Exception{
	String message;
	InvalidIndexNumber(String message){
		super(message);
	}

}
