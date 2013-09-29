package org.gravity;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class Jio_utest_functionTest {
	 String Actual; 	
	 String Expected = "True"; 
	 
	 
	 @Test
	public void TestFunction_01_dir() throws IOException{
		String path = new java.io.File( "." ).getCanonicalPath()+"/";
		Assert.assertEquals("fail in Test_01_dir()!", path, Function.dir());
		System.out.println("Test01: dir.");
		System.out.println("Expected: "+path);
		System.out.println("Actual: "+Function.dir());
	}
	
//	@Test
//	public void TestFunction_02_fileCreate() throws IOException{
//		String localPath0 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder0/";
//		Function.fileCreate( "test", "txt",localPath0 );
//		
//		File fileTest = new File (localPath0+"test.txt");	
//		if (fileTest.exists())
//			Actual = "True";
//		Assert.assertEquals("fail in Test_02_fileCreate()!", Expected, Actual);
//		//Result in console
//		System.out.println("Test02: fileCreate()");
//		System.out.println("Expected :"+Expected);
//		System.out.println("Actual :"+Actual);
//	}
	
//	@Test
//	public void TestFunction_03_fileCheck() throws IOException{
//		String localPath0 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder0/";
//		Function.fileCheck("0_test0_tobeDelete", "txt", localPath0);
//		
//		File fileTest = new File (localPath0+"0_test0_tobeDelete.txt");	
//		if (fileTest.exists())
//			Actual = "True";
//		
//		Assert.assertEquals("fail in Test_03_fileCheck()!", Expected, Actual);
//		//Result in console
//		System.out.println("Expected :"+Expected);
//		System.out.println("Actual :"+Actual);
//	}
	
//	@Test
//	public void TestFunction_04_fileChangExtOne() throws IOException{
//		String localPath0 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder0/";
//		Function.fileChangExtOne("0_test1_tobeDelete", "txt", "dat", localPath0);
//		
//		File fileTest = new File (localPath0+"0_test1_tobeDelete.dat");	
//		if (fileTest.exists())
//			Actual = "True";
//		Assert.assertEquals("fail in fileChangExtOneTest()!", Expected, Actual);
//		//Result in console
//		System.out.println("Test 04: fileChangExtOne()");
//		System.out.println("Expected :"+Expected);
//		System.out.println("Actual :"+Actual);
//	}
	
//	@Test
//	public void TestFunction_05_copyFile() throws IOException{
//		String localPath0 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder0/";
//		String localPath1 = new java.io.File( "." ).getCanonicalPath()+"/";
//		Function.copyFile("0_test2_tobeDelete", "txt", localPath0, localPath1);
//		
//		File fileTest = new File (localPath1+"0_test2_tobeDelete.txt");	
//		if (fileTest.exists())
//			Actual = "True";
//		Assert.assertEquals("fail in copyFile()!", Expected, Actual);
//		//Result in console
//		System.out.println("Test 05: copyFile()");
//		System.out.println("Expected :"+Expected);
//		System.out.println("Actual :"+Actual);
//		
//		Function.copyFile("0_test2_tobeDelete", "txt", localPath1, localPath0);
//	}
	
//	@Test
//	public void TestFunction_06_copyAllFile() throws IOException{
//		String localPath1 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder1";
//		String localPathX = new java.io.File( "." ).getCanonicalPath()+"/UtestFolderTemp";
//		File dir = new File(localPathX);
//		dir.mkdir();
//		
//		File listFile1 = new File (localPath1);
//		File[] files=listFile1.listFiles();
//		String [] name = new String [3];
//		String [] name2 = new String [3];
//			for (int x=0; x<files.length; x++){
//				name [x]=files[x].getName();
//				System.out.println(name);
//			}
//			
//		Function.copyAllFiles(localPath1, localPathX);
//		
//		File listFile2 = new File (localPathX);
//		File[] files2=listFile2.listFiles();
//			for (int y=0; y<files.length; y++){
//				name2 [y]=files2[y].getName();
//					if (name2[y].equals(name[y])){
//						Actual = "True";
//						System.out.println("Expected :"+Expected);
//						System.out.println("Actual :"+Actual);
//					}else{
//						Actual = "False";
//						Assert.assertEquals("fail in copyAllFile()!", Expected, Actual);
//					}
//				}
//		
//		}
	
//	@Test
//	public void TestFunction_07_fileChangExtMulti() throws IOException{
//		
//		String localPath2 = new java.io.File( "." ).getCanonicalPath()+"/UtestFolder2/";
//		Function.fileChangExtMulti("txt", "dat", localPath2);
//		
//		File fileTest = new File (localPath2);
//		File[] files=fileTest.listFiles();
//		
//		for(int x=0; x<files.length; x++){
//		String name=files[x].getName();
//		String ext = name.substring(name.lastIndexOf('.'),name.length());
//		System.out.println(ext);
//		if (ext.equals(".dat")){
//			Actual = "True";
//			System.out.println("Expected :"+Expected);
//			System.out.println("Actual :"+Actual);
//			
//			}else{
//				Actual = "False";
//				Assert.assertEquals("fail in fileChangExtMulti()!", Expected, Actual);
//			}			
//		}
//	}	
		
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
		String localPathZip = new java.io.File( "." ).getCanonicalPath()+"/zipFile/";
		String localPathX = new java.io.File( "." ).getCanonicalPath()+"/";
		File zipFolder = new File(localPathX+"zipFile");
		zipFolder.mkdir();
		
		File zipFile = new File(localPathZip+"zipFile.txt");
		zipFile.mkdir();
		
		Function.zipFolder(localPathX+"zipFile");
		Function.deleteFolder(localPathX+"zipFile");
		
		File fileTest = new File (localPathX+"zipFile.zip");	
		if (fileTest.exists()){
			Actual = "True";
		}else{
			Actual = "False";
		  	Assert.assertEquals("fail in TestFunction_13_unzipFolder()!", "False", Actual);
		}
		
		Function.unzipFolder(localPathX+"zipFile.zip", localPathX);
		
		File fileTest2 = new File (localPathX+"/"+"zipFile.txt");
		
		if (fileTest2.exists()){
			Actual = "True";
		}else{
			Actual = "False";
		  	Assert.assertEquals("fail in TestFunction_13_unzipFolder()!", "False", Actual);
		}
		
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

