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
		// Convert to reference unit = 1
		if (from != 1) {
			value = value * 1 / from;
		} else {
			value = value * from;
		}
		
		// Convert to requested unit
		if (to != 1) {
			value = value * to;
		}
		
		return value;
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}

//	public static void main(String[] args) {
//		//Conversion con = new Conversion();
//		Length len = new Conversion().new Length();
//		System.out.printf("KILOMETER TO MILE: %f\n", len.convert(1,len.KILOMETER,len.MILE));
//		System.out.printf("MILE TO KILOMETER: %f\n", len.convert(1,len.MILE,len.KILOMETER));
//		System.out.printf("METER TO KILOMETER: %f\n", len.convert(1,len.METER,len.KILOMETER));
//		System.out.printf("KILOMETER TO METER: %f\n", len.convert(1,len.KILOMETER,len.METER));
//		System.out.printf("CENTIMETER TO METER: %f\n", len.convert(2,len.CENTIMETER,len.METER));
//		
//		Weight weight = new Conversion().new Weight();
//		System.out.printf("GRAM TO KILOGRAM: %f\n", len.convert(1,weight.GRAM,weight.KILOGRAM));
//		System.out.printf("KILOGRAM TO GRAM: %f\n", len.convert(1,weight.KILOGRAM,weight.GRAM));
//		System.out.printf("KILOGRAM TO KILOGRAM: %f\n", len.convert(2,weight.KILOGRAM,weight.KILOGRAM));
//		System.out.printf("KILOGRAM TO GRAM: %f\n", len.convert(0,weight.KILOGRAM,weight.GRAM));
//		System.out.printf("GRAM TO KILOGRAM: %f\n", len.convert(0,weight.GRAM,weight.KILOGRAM));
//	}

	public class Length extends Conversion {
		public static final double METER = 1;
		public static final double CENTIMETER = 100;
		public static final double KILOMETER = 0.001;
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

		public double convert(double value, double from, double to){
			return super.convert(value, from, to);
		}
	}
	
	public class Weight extends Conversion {
		public static final double GRAM = 1;
		public static final double KILOGRAM = 0.001;
		
		private double unit;

		public double getUnit() {
			return unit;
		}

		public void setUnit(double unit) {
			this.unit = unit;
		}
		
		public double convert(double value, Weight from, Weight to){
			return convert(value, from, to);
		}
	
		public double convert(double value, double from, double to){
			return super.convert(value, from, to);
		}
	}
}
