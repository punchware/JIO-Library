package org.gravity;

public class MethodFileFolder {
	
	
	/**
	 * Function name: CreateFolder
	 * <p>
	 * Use of function: Creating a folder.
	 * <p>
	 * @param srcPath Source path
	 * @param folderName Name of folder intended to create
	 * <p>
	 * Example:
	 * <p>
	 * MethodFileFolder.CreateFolder( "/home/user/","testFolder_01");
	 */
	
	public static void CreateFolder(String srcPath, String folderName){
		
		try {
			// Condition to check the input arguments
			if (folderName !=null || srcPath !=null){
				
				ObjectFile createFolder = new ObjectFile(srcPath,folderName);
				createFolder.createFolder();
				
				System.out.println("INFO::CreateFolder:: Folder "+folderName+" succesfully created.");
				
			}
			
		} catch(Exception ex) {
                 System.out.println("EXCEPTION::CreateFolder::"+ex);
                 
		}
	}
	
	
	/**
	 * Function name: CreateMultiFolder
	 * <p>
	 * Use of function: Creating a multiple folder.
	 * <p>
	 * @param srcPath Source path
	 * @param folderName A multiple name of folder intended to create in array
	 * <p>
	 * Example:
	 * <p>
	 * MethodFileFolder.CreateMultiFolder( "/home/user/", myFolderNameArray);
	 */
	
	public static void CreateMultiFolder(String srcPath, String[] folderName){
		
		try {
			// Condition to check the input arguments
			if (folderName !=null || srcPath !=null){
				
				// Recursive create folders
				for (String e : folderName){
					ObjectFile createFolder = new ObjectFile(srcPath, e);
					createFolder.createFolder();
					 
					System.out.println("INFO::CreateMultiFolder:: Folder "+e+" succesfully created.");
				}
			}
			
		} catch (Exception ex) {
			System.out.println("EXCEPTION::CreateMultiFolder::"+ex);
		}
	}
	 
	 
	/**
	 * Function name: CreateFile
	 * <p>
	 * Use of function: Creating a file.
	 * <p>
	 * @param srcPath Source path
	 * @param folderName A destination folder name
	 * @param fileName Name of file intended to create
	 * @param fileExt The extension name of the file intended to create
	 * <p>
	 * Example:
	 * <p>
	 * MethodFileFolder.CreateMultiFolder( "/home/user/", "testFolder_01", "testFile_01", "csv");
	 */
	
	public static void CreateFile(String srcPath, String folderName,String fileName, String fileExt){
		
		try {
			
			//Condition to check if filename and file ext input null
			if (fileName !=null && fileExt !=null){
				
				String repoPath = srcPath+"\\"+folderName;
				
				ObjectFile createFile = new ObjectFile(srcPath, folderName);
				createFile.createFile(repoPath, fileName, fileExt);
				
				System.out.println("INFO::CreateFile:: Folder "+fileName+"."+fileExt+" succesfully created.");
                	 
			}

		} catch (Exception ex){
                 System.out.println("EXCEPTION::CreateFile::"+ex);
                 
		}
	}
	
}
