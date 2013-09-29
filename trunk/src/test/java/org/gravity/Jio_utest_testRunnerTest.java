package org.gravity;

import java.io.IOException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Jio_utest_testRunnerTest {
	public static void main(String[] args) throws IOException {
		  
		//Test Data Readiness
		Jio_utest_suitesTest.test_data();
		  
		//Test start
	    Result result = JUnitCore.runClasses(Jio_utest_suitesTest.class);
	    for (Failure failure : result.getFailures()) {
	       System.out.println(failure.toString());
	    }
	    System.out.println(result.wasSuccessful());
	 }
	
}
