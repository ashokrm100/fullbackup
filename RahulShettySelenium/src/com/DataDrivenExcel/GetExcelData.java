package com.DataDrivenExcel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	
	public static void main(String args[])
	{
		XSSFWorkbook book;
		XSSFSheet sheet = null;
		Object [] [] data = new Object[0][0];
		FileInputStream fis;
		int row=0;
		int col =0;
		try
		{
		fis = new FileInputStream("C:\\Users\\\\ashok\\Desktop\\workspace\\SDETExample"
				+ "\\src\\main\\java\\com\\demoLogin\\qa\\TestData\\STUDENTDETAILS.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);
		data = new Object[sheet.getRow(0).getLastCellNum()][sheet.getLastRowNum()];
		row = sheet.getLastRowNum();
		col = sheet.getRow(0).getLastCellNum();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		Iterator<Row> row1 = sheet.iterator();
		
		row1.next();
		while(row1.hasNext())
		{
			Row rval = row1.next();
			Iterator<Cell> celldata = rval.cellIterator();
			while(celldata.hasNext())
			{
				Cell values=celldata.next();
				System.out.println(values);
			}
		}
		
		/*for(int i=0; i<row; i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
				System.out.println(data[i][j]);
			}
			
		}
		
		System.out.println(data.length);*/
		
	}

}
