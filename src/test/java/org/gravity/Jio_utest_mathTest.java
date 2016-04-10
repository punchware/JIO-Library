package org.gravity;
import java.io.IOException;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Jio_utest_mathTest {
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
	 public void TestMath_00_mathClass() throws IOException{
		int input = 2;
		int constant = 1;
		Math math = new Math();
		
		int plus = 3;
		int minus = 1;
		int multiple =2;
		int divide =2;
		try{
			Assert.assertEquals(plus, math.plus(input, constant));
			Assert.assertEquals(minus, math.minus(input, constant));
			Assert.assertEquals(multiple, math.multiple(input, constant));
			Assert.assertEquals(divide, math.divide(input, constant));
			System.out.print("TestMath_00_mathClass PASSED");			
		}
			catch (AssertionFailedError e){
				System.out.println("TestMath_00_mathClass FAIL: "+e.getMessage());
			}
	}
	
	
	
	@Test
	 public void TestMath_01_plus() throws IOException{
		int x =Math.plus(1, 1);
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
		int x =Math.minus(2, 1);
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
		int x =Math.multiple(2, 2);
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
		int x =Math.divide(4, 2);
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

		@Test
		public void TestMath_05_axisScale( ) throws IOException{
			
			int[ ] axis = Math.axisScale( 0, 10, 5 );

			try{
				Assert.assertEquals( 6, axis.length );
				Assert.assertEquals( 0, axis[ 0 ] );
				Assert.assertEquals( 2, axis[ 1 ] );
				Assert.assertEquals( 4, axis[ 2 ] );
				Assert.assertEquals( 6, axis[ 3 ] );
				Assert.assertEquals( 8, axis[ 4 ] );
				Assert.assertEquals( 10, axis[ 5 ] );

				System.out.print( "TestMath_05_axisScale test PASSED" );
			}catch( AssertionFailedError e ){
				System.out.print( "TestMath_05_axisScale test FAILED: " + e.getMessage( ) );
			}
		}
	

}
