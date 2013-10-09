package com.crystal.hr.employment;

import org.junit.Test;

import com.crystal.hr.employment.importcv.ImportEngine;

import junit.framework.TestCase;

public class ImportCVClient extends TestCase {

	@Test
	public void testReadFromWordDocument() {
		String path = "D:\\java_work\\workspace\\hr-employment\\src\\test\\resources\\";
		String fileName = "CHIVU-Simona-CVstdENv.01.doc";
		ImportEngine ie = new ImportEngine();
		ie.importDocument(path, fileName);
		assertTrue(true);
	}

}
