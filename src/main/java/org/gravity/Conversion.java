package org.gravity;

public class Conversion {
	
	public Conversion(){}
	
	private static double convert(double value, double from, double to){
		
		if(from != 1){
			value = value*from;
		}
		value = value*to;
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conversion con = new Conversion();
		Length len = new Conversion().new Length();
		
		System.out.println(len.convert(1,len.KILOMETER,len.MILE));
	}

	public class Length extends Conversion {
		public static final double METER = 1;
		public static final double CENTIMETER = 0.01;
		public static final double KILOMETER = 1000;
		public static final double INCH = 39.3701;
		public static final double FEET = 3.28084;
		public static final double MILE = 0.000621371;
		
		public double convert(double value, double from, double to)
		{
			return super.convert(value, from, to);
		}
	}

}
