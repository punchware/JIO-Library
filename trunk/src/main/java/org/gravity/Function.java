package org.gravity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Function{

/**
 * Function name: dir
 * <p>
 * Use of function: For displaying/assigning path to the current directory path
 * <p>
 * @param currentPath String for string current directory path
 * <p>
 * Example:
 * <p>
 * String localPath = function.dir();
 */
public static String dir() throws IOException{
	String currentPath;		
	currentPath=new File( "." ).getCanonicalPath()+"/";
	return currentPath;
}
/**
 * Function name: timestamp
 * <p>
 * Use of function: capture current server time and date in format: yymmdd_hhmm
 * <p>
 * @param timestamp String for string current directory path
 * <p>
 * Example:
 * <p>
 * String timestamp = Function.timestamp();
 */
public static String timestamp() throws IOException{
	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmm");
	Date date = new Date();
	String timestamp=dateFormat.format(date);
	return timestamp;
}
/**
 * Function name: fileCreate
 * <p>
 * Use of function: Creating and output file
 * <p>
 * @param fileName Name of the file name to be create 
 * @param fileExt Type of file extension
 * @param Destination Directory path to store the created file
 * <p>
 * Example:
 * <p>
 * Function.fileCreate( "test", "txt", "C:\");
 */
public static void fileCreate(String fileName, String fileExt, String Destination){
	
	try {
		File create = new File(Destination+fileName+"."+fileExt);
		create.createNewFile();
		System.out.println("File: "+fileName+"."+fileExt+" successfully created.");
	} 
	catch (IOException iofail) {
		System.out.println("File creation fail, please check your fileCreate parameters value");
		iofail.printStackTrace();
	}		
}
/**
 * Function name: fileDel
 * 
 * <p>
 * Use of function: Deleting the designated file
 * <p>
 * @param fileName Name of the file name to delete
 * @param fileExt Type of file extension
 * @param Destination Directory path of the file
 * <p>
 * Example:
 * <p>
 * Function.fileDel("test", "txt", "C:\");
 */
public static void fileDel(String fileName, String fileExt, String Destination){
	
	try{
		 
		File fileDelete = new File(Destination+fileName+"."+fileExt);

		if(fileDelete.delete()){
			System.out.println(fileDelete.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}

	}catch(Exception e){
		System.out.println("File not found, please check your input parameters");
		e.printStackTrace();

	}		
}
/**
 * Function name: fileCheck
 * <p>
 * Checking the file existence
 * <p>
 * @param fileName Name of file to be check
 * @param fileExt Type of file extension
 * @param Destination Directory Path of the file
 * <p>
 * Example:
 * <p>
 * Function.fileCheck( "test", "txt", "C:\");
 */
public static void fileCheck(String fileName, String fileExt, String Destination){
	
	try{
		 
		File file = new File(Destination+fileName+"."+fileExt);

		if(file.exists()){
			System.out.println("File name: "+file.getName() + " existed");
		}else{
			System.out.println("File name: "+file.getName() + " not found");
		}

	}catch(Exception e){
		System.out.println("Invalid input parameters, please check your input parameters");
		e.printStackTrace();

	}	
}
/**
 * Function name: fileChangExtOne
 * 
 * <p>
 * Change the extension of selected file
 * <p>
 * @param fileName Name of file to be convert
 * @param fileExt Type of file extension
 * @param NewfileExt extension for conversion
 * @param Destination Directory Path of the file
 * <p>
 * Example:
 * <p>
 * Function.fileChangExtOne("test", "txt", "dat", "C:\");
 */
public static void fileChangExtOne(String fileName, String fileExt, String NewfileExt, String Destination){
	try{
		File fileToRename = new File(Destination+fileName+"."+fileExt);
		File NewfileToRename = new File(Destination+fileName+"."+NewfileExt);
		boolean success = fileToRename.renameTo(NewfileToRename);

		if(success){
			System.out.println("Successfully converting file to: "+NewfileToRename);
		}else{
			System.out.println("Fail converting file: "+fileToRename);
		}

	}catch(Exception e){
		System.out.println("Invalid input parameters, please check your input parameters");
		e.printStackTrace();
	}		
}
/**
 * Function name: fileChangExtMulti
 * 
 * <p>
 * Change the extension of multiple file
 * <p>
 * @param fileExt Type of file extension
 * @param NewfileExt extension for conversion
 * @param Destination Directory Path of the file
 * <p>
 * Example:
 * <p>
 * Function.fileChangExtMulti("txt", "dat", "C:\");
 */
public static void fileChangExtMulti(String fileExt, String NewfileExt, String Destination){
	try{
		File folder = new File(Destination);
		File [] folderArray = folder.listFiles();
		for ( int x=0; x<folderArray.length; x++){
			
			//Set filter
			String filterFile = folderArray[x].getName();
			int index = filterFile.lastIndexOf(".");
			
			if(folderArray[x].getName().endsWith(fileExt)==true){
				if (index>0&& index <= folderArray[x].getName().length() - 2 ) {
					File fileToRename = new File(Destination+folderArray[x].getName().substring(0, index)+"."+fileExt);
		    		File NewfileToRename = new File(Destination+folderArray[x].getName().substring(0, index)+"."+NewfileExt);
		    		fileToRename.renameTo(NewfileToRename);
		    		System.out.println(folderArray[x].getName().substring(0, index)+" : Converted from "+'"'+"."+fileExt+'"'+ " to "+'"'+"."+NewfileExt+'"');
				}
				
				}else{
				System.out.println("No file with extension "+fileExt+" found");
			}
		}
	}catch(Exception e){
		System.out.println("Invalid input parameters, please check your input parameters");
		e.printStackTrace();

	}	
    System.out.println("Conversion process completed.");
}
/**
 * Function name: copyFile
 * 
 * <p>
 * Copy the targeted file to a designated directories.
 * <p>
 * @param fileName Name of file.
 * @param fileExt Type of the file extension.
 * @param Path Directory path for the fileName.
 * @param Destination Directory Path for the copy file.
 * <p>
 * Example:
 * <p>
 * Function.copyFile("test", "txt", "C:\", "C:\test\");
 */
public static void copyFile(String fileName, String fileExt, String Path, String Destination){
	try{
		String currentInput =Path+fileName+"."+fileExt;
		String newOutput =Destination+fileName+"."+fileExt;
		InputStream in = new FileInputStream(currentInput);
		OutputStream out = new FileOutputStream(newOutput);
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
		   out.write(buf, 0, len);
		}
		in.close();
		out.close();
	} catch (Exception error){
		error.printStackTrace();
	}
}
/**
 * Function name: moveFile
 * 
 * <p>
 * Move selected file to other location.
 * <p>
 * @param fileName Name of file.
 * @param fileExt Type of the file extension.
 * @param Path Directory path for the fileName.
 * @param Destination Directory Path for the copy file.
 * <p>
 * Example:
 * <p>
 * Function.moveFile("test", "txt", "C:/", "C:/test/");
 */
public static void moveFile(String fileName, String fileExt, String Path, String Destination){
	try{
		 
    	   File afile =new File(Path+fileName+"."+fileExt);

    	   if(afile.renameTo(new File(Destination + afile.getName()))){
    		System.out.println("File is moved successful!");
    	   }else{
    		System.out.println("File is failed to move!");
    	   }

    	}catch(Exception e){
    		e.printStackTrace();
    	}
}	
/**
 * Function name: moveFolder
 * 
 * <p>
 * Move selected folder to other location.
 * <p>
 * @param srcDir Directory path to be move.
 * @param destDir Destination directory Path.
 * <p>
 * Example:
 * <p>
 * function.moveFolder("C://test1", "C://test2/");
 */		 
public static void moveFolder(String srcDir, String destDir) throws IOException{
   File srcFileFolder = new File(srcDir);
   File destFileFolder = new File (destDir);	
   copyFolderActual (srcFileFolder, destFileFolder);
   deleteFolder(srcDir); //Eliminate dependencies between copy & delete
    }
public static void copyFolderActual(File src, File dest)throws IOException{
 if(src.isDirectory()){
 //Check destination, if invalid then create one
 if(!dest.exists()){
 dest.mkdir();
 System.out.println("Executed: Folder moved from "+ src + ", copy to " + dest);
 }
 //list all the directory contents
 String files[] = src.list();
 for (String file : files) {
 //Constructor to defined source and destination structure
 File srcFile = new File(src, file);
 File destFile = new File(dest, file);
 //Copy recursively
 copyFolderActual(srcFile,destFile);
 	}
 }
 else{
 //Byte stream method to support all type of file
 InputStream in = new FileInputStream(src);
 OutputStream out = new FileOutputStream(dest); 	        
 byte[] buffer = new byte[1024];
 int length;      
 //Copy all file in bytes translation 
 while ((length = in.read(buffer)) > 0){
 out.write(buffer, 0, length);
   }	        
   //Close the input & output stream
   in.close();
   out.close();
  System.out.println("Executed: File Moved from " + src + " to " + dest);
   	}
  //deleteFolder(src.toString());  ////Commenting out, Eliminate dependecies between copy & delete
}	
/**
 * Function name: copyAllFile
 * 
 * <p>
 * Copy all file in the folder to other location.
 * <p>
 * @param srcDir Source directory for files.
 * @param destDir Destination directory for files to be copy to.
 * <p>
 * Example:
 * <p>
 * Function.copyAllFiles("C://test1", "C://test2/");
 */
public static void copyAllFiles(String srcDir, String destDir) throws IOException{
    	File srcFileFolder = new File(srcDir);
    	File destFileFolder = new File (destDir);	
    	copyAllFileActual (srcFileFolder, destFileFolder);
    }
public static void copyAllFileActual(File src, File dest)throws IOException{

    	if(src.isDirectory()){
    		
    		//Check destination, if invalid then create one
    		if(!dest.exists()){
    		   dest.mkdir();
    		   System.out.println("Executed: Folder moved from "+ src + ", copy to " + dest);
    		}

    		//list all the directory contents
    		String files[] = src.list();
    		for (String file : files) {
    		   //Constructor to defined source and destination structure
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   //Copy recursively
    		   copyFolderActual(srcFile,destFile);
    		}
    	}
    	else{
    		//Bytes stream method to support all type of file
    		InputStream in = new FileInputStream(src);
    	    OutputStream out = new FileOutputStream(dest); 
    	    byte[] buffer = new byte[1024];
    	    int length;
    	        
    	    //Copy all file in bytes translation 
    	    while ((length = in.read(buffer)) > 0){
    	    out.write(buffer, 0, length);
    	    }
    	        
    	    //Close the input & output stream
    	    in.close();
    	    out.close();
    	    System.out.println("Executed: Copy all files from " + src + " to " + dest);
    	}
}	   
/**
 * Function name: deleteFolder
 * 
 * <p>
 * Copy all file in the folder to other location.
 * <p>
 * @param srcDir Source directory to be deleted.
 * <p>
 * Example:
 * <p>
 * Function.deleteFolder("C://test1");
 */   
public static void deleteFolder(String srcDir){
    	File deleteFolder = new File (srcDir);
    	if(deleteFolder.exists())
        {
            do{
                delete(deleteFolder);
            }while(deleteFolder.exists());
        }else
        {
            System.out.println("Error!: Folder not found: "+srcDir);
        }
	}
private static void delete(File dir){
    if(dir.isDirectory())
        {
    	String fileList[] = dir.list();
    	if(fileList.length == 0)
    	{
    		System.out.println("Executed: Folder "+dir.getPath()+" deleted.");
            dir.delete();
            }
    	else{
    		int size = fileList.length;
            for(int i = 0 ; i < size ; i++)
            {
            	String fileName = fileList[i];
                String fullPath = dir.getPath()+"/"+fileName;
                File fileOrFolder = new File(fullPath);
                delete(fileOrFolder);
                }
            }
        }
        else{
            System.out.println("Executed: File "+dir.getPath()+" deleted.");
            dir.delete();
        }
    }	
/**
 * Function name: zipFolder
 * 
 * <p>
 * Pointed folder will compressed into zip file and store in the same directory.
 * <p>
 * @param srcDir Folder directory to be zip.
 * <p>
 * Example:
 * <p>
 * Function.zipFolder("C://test1");
 */   
public static void zipFolder(String srcDir) throws Exception {
	String destZipFile = srcDir+".zip";
	ZipOutputStream zip = null;
    FileOutputStream writeOut = null;
    //Declare output method
    writeOut = new FileOutputStream(destZipFile);
    zip = new ZipOutputStream(writeOut);
    //Zipping execution
    ZipFolder("", srcDir, zip);
    zip.flush();
    zip.close();
    System.out.println("Executed: Folder "+srcDir+" compressed.");
  }
static private void ZipFolder(String path, String srcFolder, ZipOutputStream zip)throws Exception {
	File folder = new File(srcFolder);

	for (String fileName : folder.list()) {
      if (path.equals("")) {
    	  ZipFile(folder.getName(), srcFolder + "/" + fileName, zip);
      } 
      else{
    	  ZipFile(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
      }
    }
  } 
static private void ZipFile(String path, String srcFile, ZipOutputStream zip)throws Exception {

    File folder = new File(srcFile);
    if (folder.isDirectory()) {
    	ZipFolder(path, srcFile, zip);
    } 
    else{
      byte[] buf = new byte[1024];
      int len;
      FileInputStream in = new FileInputStream(srcFile);
      zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));
      while ((len = in.read(buf)) > 0) {
        zip.write(buf, 0, len);
      }
    }
  } 
/**
 * Function name: unzipFolder
 * 
 * <p>
 * Pointed folder will compressed into zip file and store in the same directory.
 * <p>
 * @param srcDir Source directory of zipped folder.
 * @param destDir Destination directory to be extract.
 * <p>
 * Example:
 * <p>
 * Function.unzipFolder("C://test/test1.zip", "C://test/");
 */   
public static void unzipFolder( String srcDir, String destDir ) {
	try {
		ZipFile zipfile = new ZipFile(srcDir);
		Enumeration< ? extends ZipEntry> zipEnum = zipfile.entries();
		
			while( zipEnum.hasMoreElements() ) {
				ZipEntry zipentry = (ZipEntry) zipEnum.nextElement();

				if (zipentry.isDirectory()) {
					File newdir = new File(destDir + File.separator + zipentry.getName());
					newdir.mkdir();
				} 
				else{
					String extractPath = destDir + File.separator + zipentry.getName();
					File extractFile = new File(extractPath);
					if (!extractFile.getParentFile().exists()) {
						extractFile.getParentFile().mkdirs();
					}else{
						System.out.println("Info: Folder and data "+'"'+zipentry.getName()+'"'+" already existed at extract location.");
						System.out.println("Info: Replace existing content with new extract data.");
					}
        
					InputStream input = zipfile.getInputStream(zipentry);
					FileOutputStream output = new FileOutputStream(extractPath);
					int x;
					while( (x = input.read()) != -1 ) {
						output.write(x);
					}
					input.close();
					output.close();
				}
			}
			zipfile.close();
			System.out.println("Executed: Folder "+srcDir+" successfully extracted.");
			System.out.println("Extract location: "+destDir);
			} catch (Exception e) {
				e.printStackTrace();
			}
}	
/**
 * Function name: renameFile
 * 
 * <p>
 * Rename a file.
 * <p>
 * @param srcFileName Original file.
 * @param newFileName Renamed file.
 * @param Path directory path.
 * <p>
 * Example:
 * <p>
 * Function.unzipFolder("test1.zip", "test2.zip", "C://test");
 */
public static void renameFile(String srcFileName, String newFileName, String Path){
	File file1 = new File (Path+"/"+srcFileName);
	File file2 = new File (Path+"/"+newFileName);
	if(!file1.exists()){
	System.out.println("Error!: File "+Path+"/"+srcFileName+" not found.");	
	}else{
	file1.renameTo(file2);
	System.out.println("Executed: File "+ '"'+srcFileName+'"'+" succesfully changed to "+'"'+newFileName+'"'+".");
	}
}

/*
 * Function Name: Interpret Flag 
 *
 *<p>
 *Return flag with values 0 or 1
 *
 *<p>
 * @param inputFlag input flag in boolean 
 *  
 *<p>
 *
 * Example:
 * Function.interpretFlag("0");
 */

public static String interpretFlag(int input, String positiveMssg, String negativeMssg){
	//String negativeMssg = "false";
	//String positiveMssg = "true";
	String invalidMssg = "Invalid Flag Input";
	String outputMsg;
	
	//Input checker
		if (input !=0){
			if (input !=1){
				outputMsg = invalidMssg;
			}else{
		}
	}
	
	if (input ==0){
		outputMsg = negativeMssg;
		//System.out.println(outputMsg);
	}
	else{
		outputMsg= positiveMssg;
		//System.out.println(outputMsg);
	}	
	return outputMsg;
	
	}


/**
 * Function name: writeOut
 * 
 * <p>
 * Write to the files content.
 * <p>
 * @param filePath Directory path.
 * @param fileName File name.
 * @param inputWrite Content to write to the file.
 * <p>
 * Example:
 * <p>
 * Function.writeOut("C://test1", "test2.txt", "Hello Papa Bear");
 */
public static void writeOut(String filePath , String fileName , String inputWrite ){
	try {
		PrintStream printFile = new PrintStream(new FileOutputStream(filePath + "/" + fileName));
		printFile.println(inputWrite);
		System.out.println("Write input to file succeed.");
		printFile.close(); //Close the file to end the Streaming
		
	} catch (FileNotFoundException writeError) {
		// TODO Auto-generated catch block
		writeError.printStackTrace();
	}
}


/**
 * Function name: fileContentCompare
 * 
 * <p>
 * Compare two files if there is any differences.
 * <p>
 * @param filePath Directory path.
 * @param fileName1 First file name.
 * @param fileName2 Second file name.
 * <p>
 * Example:
 * <p>
 * Function.fileContentCompare("C://test1", "test1.txt", "test2.txt");
 */
public static void fileContentCompare(String filePath , String fileName1, String fileName2 ) throws FileNotFoundException{
	
	String content1="", content2="";
	BufferedReader bf1 = new BufferedReader(new FileReader(filePath+"/"+fileName1));
	BufferedReader bf2 = new BufferedReader(new FileReader(filePath+"/"+fileName2));
			
		//Try to read the files content
		try {
			content1 = bf1.readLine();
			content2 = bf2.readLine();
			
			if (content1.equals(content2)){
				System.out.println("File Compare: There is no differences of contents between file "
						+fileName1+" and "+fileName2+" .\n");
				System.out.println("Content of file:\n"+content1);
			}else{
				System.out.println("File Compared: There is a differences in content between files "
						+fileName1+" and "+fileName2+" .\n");
				System.out.println("Content in file "+fileName1+" :\n"+content1);
				System.out.println("Content in file "+fileName2+" :\n"+content2);
			}
				
		} catch (IOException contentReadFail) {
			// TODO Auto-generated catch block
			contentReadFail.printStackTrace();
		}					
}


/**
 * Function name: contentLookupOnIndex
 * 
 * <p>
 * Searching file content for a specific input values.
 * <p>
 * @param filePath Directory path.
 * @param fileName First file name.
 * @param lookupValues Values to search in the file content.
 * <p>
 * Example:
 * <p>
 * Function.contentLookupOnIndex("C://test1", "test1.txt", "Error");
 */
public static void contentLookupOnIndex(String filePath , String fileName, String lookupValues ) throws FileNotFoundException{
	
	String searchWord = lookupValues, content;
	BufferedReader bf = new BufferedReader(new FileReader(filePath+"/"+fileName));
	try {
		content = bf.readLine();
		int index = content.indexOf(searchWord);
		
		 if (index==-1){
			 System.out.println("Content Searching: Fail!...Content "+ lookupValues +" not found");
		 }else{
			 System.out.println("Content Searching: Content "+ lookupValues +" found at: " +index);
		 }
		
	} catch (IOException e) {
		System.out.println("Process Error :");
		e.printStackTrace();
	}
}


}



