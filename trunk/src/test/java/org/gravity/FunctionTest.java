package org.gravity;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class FunctionTest {

//	@Test
//	public void testDir() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testTimestamp() throws IOException {
		String timestampValue = Function.timestamp();
		int dateValue = Calendar.getInstance().get(Calendar.DATE);
		int monthValue = Calendar.getInstance().get(Calendar.MONTH)+1;
		int yearValue = Calendar.getInstance().get(Calendar.YEAR);
		int hourValue = Calendar.getInstance().get(Calendar.HOUR);
		int minuteValue = Calendar.getInstance().get(Calendar.MINUTE);
		
		assertEquals(Integer.parseInt(timestampValue.substring(0,4)),yearValue);
		assertEquals(Integer.parseInt(timestampValue.substring(4,6)),monthValue);
		assertEquals(Integer.parseInt(timestampValue.substring(6,8)),dateValue);
		assertTrue((Integer.parseInt(timestampValue.substring(9,11))==hourValue)||(Integer.parseInt(timestampValue.substring(9,11))==hourValue+12));
		assertEquals(Integer.parseInt(timestampValue.substring(11,13)),minuteValue);
	}

//	@Test
//	public void testFileCreate() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testFileDel() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testFileCheck() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testFileChangExtOne() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testFileChangExtMulti() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testCopyFile() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testMoveFile() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testMoveFolder() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testCopyFolderActual() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testCopyAllFiles() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testCopyAllFileActual() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testDeleteFolder() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testZipFolder() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testUnzipFolder() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testRenameFile() {
//		fail("Not yet implemented");
//	}

}
