package com.sap.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {

	public static Workbook book;
	public static Sheet sheet;
	public static Row row;
	public static String testDataFile;
	public static String hostname;
	public static URL url;
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir") + "\\src\\main\\java\\com\\sap\\excel\\qaTestData.xlsx";
	
	public static String getDataFromSheet(String sheetName, int rowNum, int celNum) throws MalformedURLException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}*/
		sheet = book.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		
		return data;
	}
	
	public static ArrayList<String> getData(String sheetName, String colName) throws InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sap\\excel\\qaTestData.xlsx");
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		ArrayList<String> data= new ArrayList<String>();
		
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				if(colName.equals(getDataFromSheet(sheetName, 0, j))){
					for(int  i=0; i<sheet.getLastRowNum();i++) {

						data.add(getDataFromSheet(sheetName, i+1, j));
						
					}
				}
			}
			
		return data;
	}
	public static ArrayList<String> getDataNotEmptyCells(String sheetName, String colName) throws InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sap\\excel\\qaTestData.xlsx");
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		ArrayList<String> data= new ArrayList<String>();
		
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				if(colName.equals(getDataFromSheet(sheetName, 0, j))){
					for(int  i=0; i<sheet.getLastRowNum();i++) {
						String addingData= getDataFromSheet(sheetName, i+1, j);
						if(!addingData.equals("")) {
							data.add(addingData);

						}
						
					}
				}
			}
			
		return data;
	}
	
	public static void main(String[] args) {
		ArrayList<String> str = null;
		try {
			str = getDataNotEmptyCells("event","responsesListEventID");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(str);
	}

}
