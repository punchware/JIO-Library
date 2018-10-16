package org.gravity;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.gravity.Conversion.Length;
import org.gravity.Conversion.Weight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Jio_utest_conversionTest {
	
	private double actual = 0d;
	private double expected = 0d;
	private DecimalFormat decimalFormat = new DecimalFormat(".######");
	
	@Before
	public void testStart() {
		System.out.println(this.getClass().getName() + " unit Test start.");
	}
	
	@After
	public void testEnd() {
		System.out.println(this.getClass().getName() + " unit test complete.");
	}
	
	@Test
	public void testKilometerToMile() {
		expected = 0.621371;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.KILOMETER, Length.MILE);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.KILOMETER);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.MILE);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testMileToKilometer() {
		expected = 1.609344;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.MILE, Length.KILOMETER);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.MILE);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.KILOMETER);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testMeterToKilometer() {
		expected = 0.001000;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.METER, Length.KILOMETER);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.METER);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.KILOMETER);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testKilometerToMeter() {
		expected = 1000.000000;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.KILOMETER, Length.METER);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.KILOMETER);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.METER);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testCentimeterToMeter() {
		expected = 0.010000;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.CENTIMETER, Length.METER);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.CENTIMETER);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.METER);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testMeterToCentimeter() {
		expected = 100.000000;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.METER, Length.CENTIMETER);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Length from = new Conversion().new Length();
		from.setUnit(Length.METER);
		
		Length to = new Conversion().new Length();
		to.setUnit(Length.CENTIMETER);
		
		actual = length.convert(1, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testGramToKilogram() {
		expected = 0.002000;
		
		Weight weight = new Conversion().new Weight();
		
		actual = weight.convert(2, Weight.GRAM, Weight.KILOGRAM);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Weight from = new Conversion().new Weight();
		from.setUnit(Weight.GRAM);
		
		Weight to = new Conversion().new Weight();
		to.setUnit(Weight.KILOGRAM);
		
		actual = weight.convert(2, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testKilogramToGram() {
		expected = 2000.000000;
		
		Weight weight = new Conversion().new Weight();
		
		actual = weight.convert(2, Weight.KILOGRAM, Weight.GRAM);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Weight from = new Conversion().new Weight();
		from.setUnit(Weight.KILOGRAM);
		
		Weight to = new Conversion().new Weight();
		to.setUnit(Weight.GRAM);
		
		actual = weight.convert(2, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}
	
	@Test
	public void testZeroValue() {
		expected = 0.000000;
		
		Weight weight = new Conversion().new Weight();
		
		actual = weight.convert(0, Weight.KILOGRAM, Weight.GRAM);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
		
		Weight from = new Conversion().new Weight();
		from.setUnit(Weight.KILOGRAM);
		
		Weight to = new Conversion().new Weight();
		to.setUnit(Weight.GRAM);
		
		actual = weight.convert(0, from, to);
		assertEquals(decimalFormat.format(expected), decimalFormat.format(actual));
	}

}
