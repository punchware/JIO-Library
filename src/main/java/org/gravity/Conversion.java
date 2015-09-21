package org.gravity;

public class Conversion {

	public final double METER = 1;
	public final double CENTIMETER = 0.01;
	public final double KILOMETER = 1000;
	public final double INCH = 39.3701;
	public final double FEET = 3.28084;
	
	public static double convert(double value, double from, double to){
		if(from != 1){
			value = value*from;
		}
		value = value*to;
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Conversion.convert(1,new Conversion().CENTIMETER,new Conversion().FEET));
	}

}
