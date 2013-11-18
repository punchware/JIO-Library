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
	
}