package org.gravity;

import java.io.IOException;

public class Math{
	/** 
	 * Math function: Plus
	 * 
	 * <p>
	 * Execute plus operation
	 * <p>
	 * @param input x value
	 * @param constant y value
	 * <p>
	 * Example:
	 * <p>
	 * int out = Math.plus(10,2);
	 */
	public static int plus (int input, int constant) throws IOException{
		int x = input;
		int y = constant;
		int z = x+y;
		return z;
	}
	/** 
	 * Math function: Minus
	 * 
	 * <p>
	 * Execute Minus operation
	 * <p>
	 * @param input x value
	 * @param constant y value
	 * <p>
	 * Example:
	 * <p>
	 * int out = Math.minus(10,2);
	 */
	public static int minus (int input, int constant) throws IOException{
		int x = input;
		int y = constant;
		int z = x-y;
		return z;
	}
	/** 
	 * Math function: Multiple
	 * 
	 * <p>
	 * Execute Multiple operation
	 * <p>
	 * @param input x value
	 * @param constant y value
	 * <p>
	 * Example:
	 * <p>
	 * int out = Math.multiple(10,2);
	 */
	public static int multiple (int input, int constant) throws IOException{
		int x = input;
		int y = constant;
		int z = x*y;
		return z;
	}
	/** 
	 * Math function: Divide
	 * 
	 * <p>
	 * Execute Divide operation
	 * <p>
	 * @param input x value
	 * @param constant y value
	 * <p>
	 * Example:
	 * <p>
	 * int out = Math.divide(10,2);
	 */
	public static int divide (int input, int constant) throws IOException{
		int x = input;
		int y = constant;
		int z = x/y;
		return z;
	}
	/**
	 *Math function: AxisScale
	 *
	 * <p>
	 * Generates an array of numbers for axis scale  
	 * <p>
	 * @param min minimum range value
	 * @param max maximum range value
	 * @param itv interval within range
	 * <p>
	 * Example:
	 * <p>
	 * int[ ] myArray = Math.axisScale( 0, 10, 5 );
	 */	
	public static int[ ] axisScale( int min, int max, int itv ) throws IOException{
		//-------------------
		// VALIDATIONS
		//-------------------
		//Divide by zero
		if( itv < 1 )
			throw new IOException( "Interval value should be greater than zero" );
		//Maximum > minimum
		if( max < min || max == min )
			throw new IOException( "Invalid maximum or minimum value" );
		//interval > max - min range
		if( itv > ( Math.minus( max, min ) ) )
			throw new IOException( "Interval value does not make sense" );
		
		//---------------------
		// PROCEDURE
		//---------------------
		//gap between axis values (element?)
		int part = Math.divide( Math.minus( max, min ), itv );	

		//how many element can we get from within the min-max axis range
		int arrSize = Math.plus( Math.divide( Math.minus ( max, min ), part ), 1 );
		int[ ] arrOut = new int[ arrSize ];

		//compute elements and save result to array
		int num = min;
		for( int i=0; i<arrOut.length; i++){			
			arrOut[ i ] = num;						
			num = Math.plus( num, part );
		}

		return arrOut;
	}

}