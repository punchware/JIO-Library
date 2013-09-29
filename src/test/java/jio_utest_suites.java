package test.java;
import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	        jio_utest_function.class,
	        jio_utest_math.class,
	})
	
	public class jio_utest_suites {	
		
		public static void test_data() throws IOException{
			String currentPath = new java.io.File( "." ).getCanonicalPath()+"/";
			//Creating Folder
			for (int k=0; k<10; k++){
			File file = new File(currentPath+"UtestFolder"+k);
			 	if (!file.exists()) {
			 		if (file.mkdir()) {
			 			System.out.println("Directory successfully created!");
			 		}
			 	} else {
			 		System.out.println("Failed to create directory!");
			 	}
			 }
				 
			//Creating File
			 for (int k=0; k<10; k++){
				 try{
					 for (int n=0; n<3; n++){
						 File create = new File( currentPath+"UtestFolder"+k+"/"+k+"_test"+n+"_tobeDelete."+"txt");
						 create.createNewFile();
					 }
				 }
				 catch (IOException iofail) {
					 System.out.println("File creation fail, please check your fileCreate parameters value");
					 iofail.printStackTrace();
					}
			 	}
		}
		
	}


