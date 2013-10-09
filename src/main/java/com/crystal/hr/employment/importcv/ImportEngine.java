package com.crystal.hr.employment.importcv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hwpf.HWPFDocument;

public class ImportEngine {

	public Map<String, List<String>> importDocument(String path, String fileName) {
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		FileInputStream finStream = null;
		try {
			File docFile = new File(path + fileName); // file object was created
			finStream = new FileInputStream(docFile.getAbsolutePath()); // file
																		// input
																		// stream
																		// with
																		// docFile
			HWPFDocument document = new HWPFDocument(finStream);
			Parser wp = new WordParser();
			wp.parseFile(document);
			
			finStream.close(); // closing fileinputstream
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (finStream != null) {
				try {
					finStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
