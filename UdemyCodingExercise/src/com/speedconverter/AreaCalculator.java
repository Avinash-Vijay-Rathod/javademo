package com.speedconverter;

public class AreaCalculator {

	public static double area(double radius) {
		
		if (radius < 0) {
			return -1;
		}
		
		return Math.PI*Math.pow(radius, 2);
	}
	
public static double area(double bredth, double width) {
		
		if (bredth < 0 || width < 0) {
			return -1;
		}
		
		return bredth*width;
	}
}
