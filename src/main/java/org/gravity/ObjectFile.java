package org.gravity;

import java.io.File;
import java.io.IOException;



public class ObjectFile {
	
	String filePath;
	String folderName;
	String fullPath;
	
	public ObjectFile(String srcPath, String srcFolderName){
		
		filePath = srcPath;
		folderName = srcFolderName;
		fullPath = filePath + "\\" + folderName;
	
	}
	
	void createFolder(){
		
		File srcPath = new File(filePath);
		File srcFullPath = new File(fullPath);
		
		if (srcPath.isDirectory()){
			
			//Condition to check the path condition
			if (!srcFullPath.exists()){
				// Create the folder
				srcFullPath.mkdir();
				System.out.println("LOG::createFolder::Info::Company artifact folder successfully created.");
				
			} else {
				// Exit with log
				System.out.println("LOG::createFolder::Fail::Company artifact folder already exist!");
				System.exit(0);				
			}
			
		}else{
			
			System.out.println("LOG::createFolder::Fail::Source path does not exist!");
			System.exit(0);
		}
	}
	
	
	void createFile(String destFolder, String fileName, String fileExt) throws IOException{
		
		File srcFilePath = new File(filePath+"\\"+destFolder+"\\"+fileName+"."+fileExt);
		
		//Condition to create file if file doesn't exist
		if (!srcFilePath.isFile()){
			// Create the file
			srcFilePath.createNewFile();
			System.out.println("LOG::createFile::Info::File "+fileName+"."+fileExt+" successfully created.");
			
		} else {
			
			System.out.println("LOG::createFile::Fail::File "+fileName+"."+fileExt+" already existed!");
			System.exit(0);			
		}
	}
}
