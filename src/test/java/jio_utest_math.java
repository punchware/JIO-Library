package test.java;
import java.io.IOException;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.org.gravity.jioLib.math;


public class jio_utest_math {
	@Before
	public void testSetup()
	{
		System.out.println("math class unit Test start.");
	}

	@After
	public void testComplete()
	{
		System.out.println("\nMath class unit test complete.");
	}

	
	@Test
	 public void TestMath_01_plus() throws IOException{
		int x =math.plus(1, 1);
		//Positive test
		try{
			Assert.assertEquals(2, x);
			System.out.print("TestMath_01_plus_Positive test PASSED, actual value: "+x+", ");
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_01_plus_Positive test FAIL: "+e.getMessage());
			}
		//Negative test
		try{	
			Assert.assertNotSame(1, x);
			System.out.print("TestMath_01_plus_Negative test PASSED, actual value: "+x);
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_01_plus_Negative test FAIL: "+e.getMessage());
			}
			
		}
	
	@Test
	 public void TestMath_02_minus() throws IOException{
		int x =math.minus(2, 1);
		//Positive test
		try{
			Assert.assertEquals(1, x);
			System.out.print("TestMath_02_minus_Positive test PASSED, actual value: "+x+", ");
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_02_minus_Positive test FAIL: "+e.getMessage());
			}
		//Negative test
		try{	
			Assert.assertNotSame(2, x);
			System.out.print("TestMath_02_minus_Negative test PASSED, actual value: "+x);
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_02_minus_Negative test FAIL: "+e.getMessage());
			}
			
		}
	
	@Test
	 public void TestMath_03_multiple() throws IOException{
		int x =math.multiple(2, 2);
		//Positive test
		try{
			Assert.assertEquals(4, x);
			System.out.print("TestMath_03_multiple_Positive test PASSED, actual value: "+x+", ");
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_03_multiple_plus_Positive test FAIL: "+e.getMessage());
			}
		//Negative test
		try{	
			Assert.assertNotSame(2, x);
			System.out.print("TestMath_03_multiple_Negative test PASSED, actual value: "+x);
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_03_multiple_Negative test FAIL: "+e.getMessage());
			}
			
		}

	@Test
	 public void TestMath_04_divide() throws IOException{
		int x =math.divide(4, 2);
		//Positive test
		try{
			Assert.assertEquals(2, x);
			System.out.print("TestMath_04_divide_Positive test PASSED, actual value: "+x+", ");
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_04_divide_plus_Positive test FAIL: "+e.getMessage());
			}
		//Negative test
		try{	
			Assert.assertNotSame(1, x);
			System.out.print("TestMath_04_divide_Negative test PASSED, actual value: "+x);
		}
			catch (AssertionFailedError e){
			System.out.println("TestMath_04_divide_Negative test FAIL: "+e.getMessage());
			}
			
		}
	

}
