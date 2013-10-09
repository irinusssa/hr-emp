package com.crystal.hr.employment.importcv;

import org.apache.poi.POIDocument;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import com.crystal.hr.employment.config.ConfigReader;

public class WordParser extends Parser {

	@Override
	public void parseFile(POIDocument document) {
		HWPFDocument wordDocumen = (HWPFDocument) document;
		WordExtractor wordExtract = new WordExtractor(wordDocumen);
		ConfigReader cr = new ConfigReader();
		System.out.println();
		
		String[] dataArray = wordExtract.getParagraphText();
		// dataArray stores the each line from the document
		for (int i = 0; i < dataArray.length; i++) {
			System.out.println("\n–" + dataArray[i]);
			// printing lines from the array
		}
	}
}
