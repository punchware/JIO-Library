package org.gravity;

public class Conversion {
	
	double value;

	/**
	 * Default Constructor
	 * 
	 * <p>
	 * Example:
	 * <p>
	 * Conversion con = new Conversion();
	 */
	public Conversion(){}

	/**
	 * Default conversion method that will be reusable with any kind of conversion.
	 * Any conversion will begin by converting value to benchmark unit and then the value will be converted to the outcome unit.
	 * 
	 * @param value the value to be converted
	 * @param from the unit of the given value to be converted from, represented as double
	 * @param to the unit of the given value to convert to, represented as double
	 * <p>
	 * Example:
	 * <p>
	 * convert(2, 1, 3);
	 */	
	private static double convert(double value, double from, double to){
		
		if(from != 1){
			value = value*from;
		}
		value = value*to;
		
		return value;
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

	public static void main(String[] args) {
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

		private double unit;
		
		public double getUnit(){
			return unit;
		}

		public void setUnit(double unit){
			this.unit = unit;
		}

		public double convert(double value, Length from, Length to){
				return convert(value, from, to);
		}

		private double convert(double value, double from, double to){
			return super.convert(value, from, to);
		}
	}

}
