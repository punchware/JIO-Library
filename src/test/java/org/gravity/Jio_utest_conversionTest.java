package org.gravity;

import static org.junit.Assert.assertEquals;

import org.gravity.Conversion.Length;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Jio_utest_conversionTest {
	
	private double actual = 0d;
	private double expected = 0d;
	
	@Before
	public void testStart() {
		System.out.println("conversion class unit Test start.");
	}
	
	@After
	public void testEnd() {
		System.out.println("conversion class unit test complete.");
	}
	
	@Test
	public void testKilometerToMile() {
		expected = 0.621371;
		
		Length length = new Conversion().new Length();
		
		actual = length.convert(1, Length.KILOMETER, Length.MILE);
		assertEquals(String.valueOf(expected), String.valueOf(actual));
		
//		Length from = new Conversion().new Length();
//		from.setUnit(Length.KILOMETER);
//		Length to = new Conversion().new Length();
//		to.setUnit(Length.MILE);
//		actual = length.convert(1, from, to);
//		assertEquals(String.valueOf(expected), String.valueOf(actual));
	}

}
