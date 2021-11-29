package com.crm.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestUtil {
	
	public static Object[][] readfile()
	{
	File file = new File("C:\\Users\\ashok\\Desktop\\workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\TestData\\FreeCRMData.xlsx");
	XSSFWorkbook wkbook;
	XSSFSheet sheet;
	Object [] [] arr= new Object[0][0];
	try
	{
		FileInputStream excel = new FileInputStream(file);
		wkbook = new XSSFWorkbook(excel);
		sheet= wkbook.getSheet("Sheet1");
		int First = sheet.getFirstRowNum();
		int last = sheet.getLastRowNum();
		arr = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=First;i<last;i++)
		{
			for(int j=0;j<last;j++)
			{
				arr[i][j]=sheet.getRow(i+1).getCell(j).toString();
				
			}
		}
	}
	catch(IOException e)
	{
		e.getMessage();
	
	}
	return arr;
	}
}