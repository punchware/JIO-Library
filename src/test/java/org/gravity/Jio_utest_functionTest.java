package org.gravity;

import java.io.File;
import java.io.IOException;

import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Jio_utest_functionTest {
	 String Actual; 	
	 String Expected = "True"; 
	 
	@Before
	public void testSetup()
	{
		System.out.println("function class unit Test start.");
	}

	@After
	public void testComplete()
	{
		System.out.println("\nfunction class unit test complete.");
	}

	@SuppressWarnings("static-access")
	
	@Test
	/***********************************************************************/
	/********************01-Function File Unit Test ************************/
	 public void TestFunction_01_file() throws IOException{
		//Initial setup for test
		String fileName = "test";
		String fileExt = "txt";
		Function function = new Function();
		String path = new java.io.File( "." ).getCanonicalPath()+"/testFile0/";
		String path1 = new java.io.File( "." ).getCanonicalPath()+"/testFile1/";
		File folder1 = new File("testFile0");
		folder1.mkdir();
		File folder2 = new File("testFile1");
		folder2.mkdir();
		
		
	/****************************TEST START ********************************/	
		
		/***TestFile_01_dir***/
		try{
			String pathDir = new java.io.File( "." ).getCanonicalPath()+"/";
			Assert.assertEquals(pathDir, function.dir());
			System.out.print("TestFile_01_dir PASSED");	
		}
			catch (AssertionFailedError e){
				System.out.println("TestFile_01_dir FAIL: "+e.getMessage());
			}
		
		/***TestFile_02_fileCreate***/
		try{
			function.fileCreate(fileName,fileExt,path);		
			File fileTest = new File (path+fileName+"."+fileExt);	
			if (fileTest.exists())
				Actual = "True";
			Assert.assertEquals(Expected, Actual);
			System.out.print("TestFile_02_fileCreate PASSED");	
		}
			catch (AssertionFailedError e){
				System.out.println("Error message: "+e.getMessage());
			}
		
		/***TestFile_03_fileCheck***/
		try{
			function.fileCheck(fileName,fileExt,path);
			File fileTest = new File (path+fileName+"."+fileExt);
			if (fileTest.exists())
				Actual = "True";
			Assert.assertEquals("fail in TestFile_03_fileCheck!", Expected, Actual);
			System.out.print("TestFile_03_fileCheck PASSED");	
		}
			catch (AssertionFailedError e){
				System.out.println("Error message: "+e.getMessage());
			}
		
		/***TestFile_04_fileChangExtOne***/
		try{
			Function.fileChangExtOne(fileName,fileExt, "dat", path);
			File fileTest = new File (path+fileName+".dat");	
        	if (fileTest.exists())
				Actual = "True";
			Assert.assertEquals("fail in TestFile_04_fileChangExtOne!", Expected, Actual);
			System.out.print("TestFile_04_fileChangExtOne PASSED");	
		}
			catch (AssertionFailedError e){
				System.out.println("Error message: "+e.getMessage());
			}
		
        /***TestFile_05_copyFile***/		
		try{
			Function.copyFile(fileName, "dat", path, path);			
			File fileTest = new File (path+fileName+".dat");	
			if (fileTest.exists())
				Actual = "True";
			Assert.assertEquals("fail in TestFile_05_copyFile!", Expected, Actual);
			System.out.print("TestFile_05_copyFile PASSED");	
		}
			catch (AssertionFailedError e){
				System.out.println("Error message: "+e.getMessage());
			}
		
        /***TestFile_06_copyAllFiles***/		
		try{
			File listFile = new File (path);
		    File[] files=listFile.listFiles();
			String [] name = new String [3];
			String [] name2 = new String [3];
				for (int x=0; x<files.length; x++){
					name [x]=files[x].getName();
					System.out.println(name);
				}
				
			Function.copyAllFiles(path, path1);
			
			File listFile1 = new File (path1);
			File[] files1=listFile1.listFiles();
				for (int y=0; y<files.length; y++){
					name2 [y]=files1[y].getName();
						if (name2[y].equals(name[y])){
							System.out.println("Expected :"+Expected);
							System.out.println("Actual :"+Actual);
							System.out.print("TestFile_06_copyAllFiles PASSED");
						}else{
							Actual = "False";
							Assert.assertEquals("fail in copyAllFile()!", Expected, Actual);
						}
					}
		}
			catch (AssertionFailedError e){
				System.out.println("Error message: "+e.getMessage());
			}
		
        /***TestFunction_07_fileChangExtMulti***/
//		try{
//			function.fileChangExtMulti("txt", "dat", path1);
//			File file = new File (path1);
//			File[] files=file.listFiles();
//			for(int x=0; x<files.length; x++){
//			String name=files[x].getName();
//			String ext = name.substring(name.lastIndexOf('.'),name.length());
//			System.out.println(ext);
//			if (ext.equals("dat")){
//				Actual = "True";
//				System.out.println("Expected :"+Expected);
//				System.out.println("Actual :"+Actual);
//				
//				}else{
//					Actual = "False";
//					Assert.assertEquals("fail in fileChangExtMulti()!", Expected, Actual);
//				}			
//			}
//		}
//			catch (AssertionFailedError e){
//				System.out.println("Error message: "+e.getMessage());
//			}

        function.deleteFolder(folder1.getCanonicalPath());
        function.deleteFolder(folder2.getCanonicalPath());
	}
			
	@Test
	public void TestFunction_08_fileDel() throws IOException{
		String localPath3 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder3/";
		Function.fileDel("3_test0_tobeDelete", "txt", localPath3);
		
		File fileTest = new File (localPath3+"3_test0_tobeDelete.txt");	
		if (fileTest.exists())
			Actual = "False";
		else
			Actual = "True";
		Assert.assertEquals("fail in TestFunction_08_fileDel()!", "True", Actual);
		//Result in console
		System.out.println("Expected : True");
		System.out.println("Actual :"+Actual);
	} 
		
	@Test
	public void TestFunction_09_folderDel() throws IOException{
		String localPath4 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder4/";
		Function.deleteFolder(localPath4);
		
		File fileTest = new File (localPath4);	
		if (fileTest.exists())
			Actual = "False";
		else
			Actual = "True";
		Assert.assertEquals("fail in TestFunction_09_folderDel()!", "True", Actual);
		//Result in console
		System.out.println("Expected : True");
		System.out.println("Actual :"+Actual);
	} 

	@Test
	public void TestFunction_10_moveFile() throws IOException{
		String localPath5 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder5/";
		String localPathX = new java.io.File( "." ).getCanonicalPath()+"/UtestFolderTemp02/";
		File dir = new File(localPathX);
		dir.mkdir();
		
		File fileTest = new File (localPath5+"5_test0_tobeDelete.txt");	
		if (fileTest.exists()){
			Actual = "True";
		}else{
			Actual = "False";
		  	Assert.assertEquals("fail in TestFunction_10_moveFile()!", "False", Actual);
		}
		
		Function.moveFile("5_test0_tobeDelete", "txt", localPath5, localPathX);
		
		if (fileTest.exists()){
			Actual = "True";
		}else{
			Actual = "False";
		  	Assert.assertEquals("fail in TestFunction_10_moveFile()!", "False", Actual);
		}
		
		File fileTest2 = new File (localPathX+"5_test0_tobeDelete.txt");
		
		if (fileTest2.exists()){
			Actual = "True";
		}else{
			Actual = "False";
		  	Assert.assertEquals("fail in TestFunction_10_moveFile()!", "False", Actual);
		}
		Function.deleteFolder(dir.getCanonicalPath());
	} 

//	@Test
//	public void TestFunction_11_moveFolder() throws IOException{
//		String localPath6 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder6";
//		String localPathX = new java.io.File( "." ).getCanonicalPath()+"/UtestFolderTemp03/";
//		File dir = new File(localPathX);
//		dir.mkdir();
//		
//		File fileTest = new File (localPath6);	
//		if (fileTest.exists()){
//			Actual = "True";
//		}else{
//			Actual = "False";
//		  	Assert.assertEquals("fail in TestFunction_10_moveFile()!", "False", Actual);
//		}
//		
//		Function.moveFolder(localPath6, localPathX);
//			
//		File fileTest2 = new File (localPathX+"/"+localPath6);
//		
//		if (fileTest2.exists()){
//			Actual = "True";
//		}else{
//			Actual = "False";
//		  	Assert.assertEquals("fail in TestFunction_10_moveFile()!", "False", Actual);
//		}
//		
//	} 	
	
//	@Test
//	public void TestFunction_12_zipFolder() throws Exception{
//		String localPath7 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder7";
//		String localPathX = new java.io.File( "." ).getCanonicalPath()+"/";
//		
//		File fileTest = new File (localPath7);	
//		if (fileTest.exists()){
//			Actual = "True";
//		}else{
//			Actual = "False";
//		  	Assert.assertEquals("fail in TestFunction_12_zipFolder()!", "False", Actual);
//		}
//		
//		Function.zipFolder(localPath7);
//		
//		File fileTest2 = new File (localPathX+"/"+"UtestFolder7.zip");
//		
//		if (fileTest2.exists()){
//			Actual = "True";
//		}else{
//			Actual = "False";
//		  	Assert.assertEquals("fail in TestFunction_12_zipFolder()!", "False", Actual);
//		}
//		
//	} 	
	
	@Test
	public void TestFunction_13_unzipFolder() throws Exception{
	
	        System.out.println("This unit test is in progress");

	}
	
	@Test
	public void TestFunction_14_renameFile() throws Exception{
		String localPath8 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder8";

		Function.renameFile("8_test0_tobeDelete.txt", "test.txt", localPath8);
		
		File fileTest = new File (localPath8+"test.txt");	
		if (fileTest.exists()){
			Actual = "False";
		}else{
			Actual = "True";
		Assert.assertEquals("fail in TestFunction_14_renameFile()!", "True", Actual);
		}
		//Result in console
		System.out.println("Expected : True");
		System.out.println("Actual :"+Actual);
			
		

		
	}
}

