package com.DataDrivenExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFunction {
	
	public int tot=0;
	XSSFWorkbook excel = new XSSFWorkbook();
	XSSFSheet sheet = excel.createSheet("WriteData");
	Map<String,ArrayList<String>> data = new HashMap<String,ArrayList<String>>();
	
	public void getInt(int tota)
	{
		tota =tot;
		
	}
	
	ArrayList<ArrayList<String>>ar = new ArrayList();
	public void receiveData(String name, String gender, String date, String address) throws IOException
	//public void receiveData(Object[][] obj1) throws IOException
	{
		
		//int rows=obj1.length;
		//int cols=obj1[0].length;
		//for(int i=0; i<rows; i++)
		//XSSFRow row = sheet.createRow(i);
		//for(int j=0; j<cols; j++)
		//{
		//	Object values=obj1[i][j];
			
		//	if(values instanceof String)
			//	cell.setCellValue((String)values);
			//if(values instanceof Integer)
		//		cell.setCellValue((Integer)values);
			//if(values instanceof Boolean)
				//cell.setCellValue((Boolean)values);
			
		}
		//Cell c = row.createCell(0);
		//c.setCellValue(name);
		/*row.createCell(1);
		c.setCellValue(gender);
		row.createCell(2);
		c.setCellValue(date);
		row.createCell(3);
		c.setCellValue(address);*/
		//FileOutputStream fos= new FileOutputStream(".\\src\\com\\ExcelData\\writeExcel.xlsx");
		//excel.write(fos);
		//fos.close();
		
		
	//}
	/* int rowno=0;
	public void getArraylist(ArrayList<String> urr) throws IOException
	{
		
		
		ar.add(urr);
		
		urr.size();
		XSSFRow row = sheet.createRow(rowno++);
		Cell c = row.createCell(0);
		for(int i=0; i<urr.size();i++)
		{
			
			c.setCellValue("urr");
		
		
		
		//data.put("A",urr);
		//for(Map.Entry entry:data.entrySet()) 
		//{
		
			//row.createCell(1).setCellValue((String)entry.getValue());
			//row.createCell(2).setCellValue((String)entry.getValue());
			//row.createCell(3).setCellValue((String)entry.getValue());
			//row.createCell(4).setCellValue((String)entry.getValue());
			
			//entry.getKey()
		}
	//	FileOutputStream fos= new FileOutputStream(".\\datafiles\\emp.xlsx");
		//excel.write(fos);
		//fos.close();
		System.out.println("Write completed");
		ar.add(urr);
		System.out.println("From arraylist of list");
		System.out.println(ar);*/
	}


