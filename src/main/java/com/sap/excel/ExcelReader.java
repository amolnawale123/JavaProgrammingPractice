package com.sap.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\sap\\excel\\qaTestData.xlsx";

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(new File(TESTDATA_SHEET_PATH));

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		
		for(Row row:sheet) {
			for(Cell cell:row) {
				switch(fe.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue()+"\t\t");
					break;
				}
				
			}
		}
	}

}
