package com.DataDrivenExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapExcel {
	
	public static void main(String args[]) throws IOException
	{
		getData();
	}
	
	
	public static void getData() throws IOException
	{
		XSSFWorkbook excel= new XSSFWorkbook();
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		ArrayList<String>moredata = new ArrayList<String>();
		moredata.add("hello");
		moredata.add("how are your");
		
		
		sheet = excel.createSheet("WriteExcelData");
		//Map<String,String> data = new HashMap<String,String>();
		Map<String,ArrayList<String>> data = new HashMap<String,ArrayList<String>>();
		data.put("101", moredata);
		data.put("102", moredata);
		
		System.out.println(data.toString());
		int rowno=0;
		
		Set<Map.Entry<String,ArrayList<String>>> entries= data.entrySet();
		
		for(Map.Entry<String,ArrayList<String>> emp: entries)
		{
			System.out.println(emp.getKey());
			System.out.println(emp.getValue());
			row=sheet.createRow(rowno++);
			row.createCell(0).setCellValue(emp.getKey());
			//row.createCell(1).setCellValue(emp.getValue());
		}
		
		/*for(Map.Entry entry:data.entrySet())
		{
			row = sheet.createRow(rowno++);
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
		}*/
		
		FileOutputStream fos = new FileOutputStream(".\\src\\com\\ExcelData\\writeExcel.xlsx");
		excel.write(fos);
		fos.close();
		excel.close();
		System.out.println("success");
		

		
	}

}
