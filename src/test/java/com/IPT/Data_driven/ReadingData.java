package com.IPT.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {


	public static void readAData() throws Throwable {
		
	File file = new File("C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\ProjectClass2\\XL book\\Sheet2.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("Sheet0");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(3);
	System.out.println(cell.getNumericCellValue());
//	FileOutputStream fos = new FileOutputStream(file);
//	wb.write(fos);
	wb.close();
	}
	
	public static void readAllData() throws Throwable {
		
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\ProjectClass2\\XL book\\Sheet2.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet0");
		int lastrownum = sheet.getLastRowNum();
		int phyrows = sheet.getPhysicalNumberOfRows();
		System.out.println("Last Row Number : " + lastrownum);
		System.out.println("Physical No Of Rows : " + phyrows);
		for(int i = 0; i<=lastrownum;i++) {
			Row row = sheet.getRow(i);
			short lastcellnumber = row.getLastCellNum();
			for(int j=0;j<=lastcellnumber;j++) {
				
			}
		}
	
		wb.close();
	}
	
	public static void main(String[] args) throws Throwable {		
		
		readAData();
//		readAllData();
	}
	
	
	
}
