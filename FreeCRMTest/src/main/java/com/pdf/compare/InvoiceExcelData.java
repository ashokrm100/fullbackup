package com.pdf.compare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoiceExcelData {
	
@Test

public static void pullExcelData() throws IOException
{
	//FIRST FILE PATH
	String excel1= "C:\\Users\\ashok\\Downloads\\SalarySlip_May_2015-converted.xlsx";
	//SECOND FILE PATH
	String excel2= "C:\\Users\\ashok\\Downloads\\Originalrp_PaySlip._may2015-converted.xlsx";
	
	XSSFWorkbook workbook = new XSSFWorkbook(excel1);
	XSSFSheet sheet = workbook.getSheet("Table 1");
	//System.out.println(sheet);
	int rows = sheet.getLastRowNum();
	System.out.println(rows);
	int col = sheet.getRow(0).getLastCellNum();
	String value ="Designation";
	
	for(int r=0;r<rows;r++)
	{
		XSSFRow row=sheet.getRow(r);
		for(int c=0;c<col;c++)
		{
		XSSFCell cell=row.getCell(c);
		//System.out.println(cell.getStringCellValue());
		
		if(cell.getStringCellValue().contains(value))
				
				{
					System.out.println(cell.getStringCellValue());
				}
		break;
		}
		workbook.close();
	}
	
	XSSFWorkbook workbook1 = new XSSFWorkbook(excel2);
	XSSFSheet sheet1 = workbook1.getSheet("Sheet1");
	//System.out.println(sheet);
	int rows1 = sheet1.getLastRowNum();
	System.out.println(rows1);
	int col1 = sheet1.getRow(0).getLastCellNum();
	String value1 ="Designation";
	
	for(int r=0;r<rows1;r++)
	{
		XSSFRow row=sheet.getRow(r);
		for(int c=0;c<col1;c++)
		{
		XSSFCell cell1=row.getCell(c);
		//System.out.println(cell.getStringCellValue());
		
		if(cell1.getStringCellValue().contains(value1))
				
				{
					System.out.println(cell1.getStringCellValue());
				}
		break;
		}
		workbook1.close();
	}
	
	
	
	}
}

	



	
	
	
	

