package org.gravity;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Proc{
	/**
	 * Process name: fileBackup
	 * 
	 * <p>
	 * Backup the folder to designated destination directory.
	 * <p>
	 * @param folderName Name of folder to be backup.
	 * @param srcDir Source directory.
	 * @param destDir Designated destination directory.
	 * <p>
	 * Example:
	 * <p>
	 * proc.fileBackup("test1", "C://test", "C://test/test");
	 */
	public static void fileBackup(String folderName, String srcDir, String destDir) throws IOException{
		File destMarker = new File(destDir);
		File newSourceDir = new File(srcDir+"/"+folderName);
		File newDestDir = new File (destDir+"/"+folderName+"_"+Function.timestamp());
		if(newSourceDir.isDirectory()){
			System.out.println("Status: Source directory "+destDir+" existed.");
		}else{
			System.out.println("Error!!: Source directory "+newSourceDir+" not found.");	
			return;
		}
		if(destMarker.isDirectory()){
			System.out.println("Status: Destination directory "+destMarker+" existed.");
			System.out.println("Execution: System backup in progress...");
			
			Function.copyFolderActual(newSourceDir, newDestDir);
			
			System.out.println("Status: System Backup Successful.");
		}else{
			System.out.println("Error!!: Destination directory "+destDir+" not found.");
			return;
		}
	}
	/**
	 * Process name: runCL
	 * 
	 * <p>
	 * Execute the windows @ unix command line. Process completed when the CL process terminate.
	 * <p>
	 * @param proc Process execution syntax.
	 * <p>
	 * Example:
	 * <p>
	 * proc.runCL("notepad");
	 */
	public static void runCL (String proc) throws InterruptedException{
		String writeINFO=null;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Execute: Runtime executed.");
		try {
			Process process = runtime.exec(proc);
			BufferedReader runningINFO = new BufferedReader(new InputStreamReader(process.getInputStream()));

		    while((writeINFO=runningINFO.readLine()) != null) {
		        System.out.println(writeINFO);
		    }
		    System.out.println("Info: Runtime execution succeed.");
		    
			} catch (IOException e) {
				System.out.println("Error!: Invalid runtime execution");
				e.printStackTrace();
		}
	}
}