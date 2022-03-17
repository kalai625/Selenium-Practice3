package com.annular.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static String getTCID(String TestCaseDescription, String TestCaseManager) throws Exception {

		String TestCaseID = null;
		File file = new File("./resources/TestCaseId_Mapping.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);

		for (int i = 0; i <= 20; i++) {

			Row rowIterator = mySheet.getRow(i);
			Cell cell = rowIterator.getCell(0);

			if (cell.getStringCellValue().contains(TestCaseDescription)) {
				if (TestCaseManager.contains("JIRA")) {
					TestCaseID = rowIterator.getCell(1).getStringCellValue();
				} else if (TestCaseManager.contains("TestRail")) {
					TestCaseID = rowIterator.getCell(2).getStringCellValue();

				}

			}

			if (TestCaseID != null) {
				break;
			}
		}
		myWorkBook.close();
		return TestCaseID;
	}
}