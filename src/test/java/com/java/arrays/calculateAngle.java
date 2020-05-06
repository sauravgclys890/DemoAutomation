package com.java.arrays;

public class calculateAngle {

	public static void main(String[] args) {
		
System.out.println(calculateAngle(3.0, 12));
	}
	
	static int calculateAngle(double h, double m) {
		
		if(h<0|| m<0 || h>12 ||m>60)
			return -1;
		
		if(h==12)
			h=0;
		if(m==60)
			m=0;
		
		int hour_angle= (int)(0.5*(h*60+m));
		
		int min_Angle= (int) (6*m);
		
		int angle= Math.abs(hour_angle- min_Angle);
		
		angle= Math.min(360-angle, angle);
		
		return angle;
		
		
	}

}
