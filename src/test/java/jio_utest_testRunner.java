package test.java;

import java.io.IOException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class jio_utest_testRunner {
	public static void main(String[] args) throws IOException {
		  
		//Test Data Readiness
		jio_utest_suites.test_data();
		  
		//Test start
	    Result result = JUnitCore.runClasses(jio_utest_suites.class);
	    for (Failure failure : result.getFailures()) {
	       System.out.println(failure.toString());
	    }
	    System.out.println(result.wasSuccessful());
	 }
	
}
