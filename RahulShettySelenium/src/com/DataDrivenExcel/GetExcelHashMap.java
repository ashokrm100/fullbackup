package com.DataDrivenExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetExcelHashMap {
	
	XSSFWorkbook excel;
	XSSFSheet sheet;
	FileInputStream fis;
	Object[][] exvalue= new Object[0][0];
	
	
	@Test (dataProvider = "ExcelData")
	public void displayExcelData(Map mpl)
	{
		System.out.println(mpl.get("Name"));
		System.out.println(mpl.get("Gender"));
		System.out.println(mpl.get("Date"));
		System.out.println(mpl.get("Address"));
	}
	
	
	@DataProvider (name = "ExcelData")
	public Object[][] readData() throws IOException
	{
		fis = new FileInputStream(".\\src\\com\\ExcelData\\writeExcel.xlsx");
		excel = new XSSFWorkbook(fis);
		sheet=excel.getSheetAt(0);
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		
		exvalue= new Object[row][1];
		for(int i=0; i<row; i++)
		{
			Map<Object,Object>mp = new HashMap<Object,Object>();
			for(int j=0;j<col;j++)
			{
				//exvalue[i][j]=sheet.getRow(i+1).getCell(j);
				mp.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
				//sheet.getRow(0).removeCell(i);
			
			}
			exvalue[i][0]=mp;
		}
		return exvalue;
		
		
	}

}
