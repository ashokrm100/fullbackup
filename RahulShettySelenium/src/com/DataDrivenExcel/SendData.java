package com.DataDrivenExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SendData {

	public static void main(String args[]) throws IOException {
		int limit;
		String name;
		String gender;
		String date;
		String address;
		XSSFWorkbook excel = new XSSFWorkbook();
		XSSFSheet sheet = excel.createSheet("HashMapWrite");
		XSSFRow row;
		XSSFRow row1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of cust details: Only integer: ");
		limit = Integer.parseInt(sc.nextLine());
		// Map<String,ValueData> al = new HashMap<String,ValueData>();
		// Map<KeyValues, ValueData> al = new HashMap<KeyValues, ValueData>();
		ValueData vl = null;
		KeyValues kv = null;
		FileOutputStream fos = new FileOutputStream(".\\src\\com\\ExcelData\\writeExcel.xlsx");
		int rowno = 1;
		for (int i = 0; i < limit; i++) {
			Map<KeyValues, ValueData> al = new HashMap<KeyValues, ValueData>();
			System.out.println("Enter the Name:\t");
			name = sc.nextLine();
			System.out.println("Enter the Gender:\t");
			gender = sc.nextLine();
			System.out.println("Enter the date:\t");
			date = sc.nextLine();
			System.out.println("Enter the Address:\t");
			address = sc.nextLine();
			vl = new ValueData(name, gender, date, address);
			kv = new KeyValues("Name", "Gender", "Date", "Address");
			al.put(kv, vl);			
			System.out.println(al.toString());
			row = sheet.createRow(0);
			row.createCell(0).setCellValue(kv.getFname());
			System.out.println(kv.getFname());
			row.createCell(1).setCellValue(kv.getFgender());
			row.createCell(2).setCellValue(kv.getFdate());
			row.createCell(3).setCellValue(kv.getFaddress());
			row1 = sheet.createRow(rowno++);
			row1.createCell(0).setCellValue(vl.getName());
			row1.createCell(1).setCellValue(vl.getGender());
			row1.createCell(2).setCellValue(vl.getDate());
			row1.createCell(3).setCellValue(vl.getAddress());
			
		}
			excel.write(fos);
			fos.close();
			excel.close();
			System.out.println("Write Success");
		}
	
		
		public void display()
		{
			
			
		}
			
			
			
}	
		
		/*for (int i = 0; i < limit; i++) {
			Map<KeyValues, ValueData> al = new HashMap<KeyValues, ValueData>();

		}*/

		// System.out.println("Mappin values :"+al);
		/*Set<Map.Entry<KeyValues, ValueData>> entry = al.entrySet();
		XSSFRow row1;
		int rowno = 0;
		for (Map.Entry<KeyValues, ValueData> emp : entry) {
			rowno++;
			row = sheet.createRow(0);
			row.createCell(0).setCellValue(kv.getFname());
			System.out.println(kv.getFname());
			row.createCell(1).setCellValue(kv.getFgender());
			row.createCell(2).setCellValue(kv.getFdate());
			row.createCell(3).setCellValue(kv.getFaddress());
			row1 = sheet.createRow(rowno++);
			row1.createCell(0).setCellValue(vl.getName());
			row1.createCell(1).setCellValue(vl.getGender());
			row1.createCell(2).setCellValue(vl.getDate());
			row1.createCell(3).setCellValue(vl.getAddress());
			excel.write(fos);
		}*/

		// excel.write(fos);
		

// ValueData v3 = new ValueData("anu","female","fifth","oldaddress");
// Map<Integer,String>al = new HashMap<Integer,String>();

// al.put(102, v3);
// al.put(205,"Hello");
//		int rowno=0;
// Set<Map.Entry<String,ValueData>> entry = al.entrySet();
// Set<Map.Entry<String,String>> entry = al.entrySet();
// for(Map.Entry<String,ValueData> emp:entry)
/*
 * for(Map.Entry<String,String>emp:entry) { row= sheet.createRow(0);
 * row.createCell(0).setCellValue(emp.getKey());
 * row.createCell(1).setCellValue(emp.getKey());
 * row.createCell(2).setCellValue(emp.getKey());
 * row.createCell(3).setCellValue(emp.getKey());
 * System.out.println(emp.getKey()); row=sheet.createRow(rowno++);
 * row.createCell(0).setCellValue(emp.getValue());
 * row.createCell(1).setCellValue(emp.getValue());
 * row.createCell(2).setCellValue(emp.getValue());
 * row.createCell(3).setCellValue(emp.getValue()); //ValueData v2 =
 * emp.getValue(); /*row.createCell(1).setCellValue(v2.getName());
 * row.createCell(2).setCellValue(v2.getGender());
 * row.createCell(3).setCellValue(v2.getDate());
 * row.createCell(4).setCellValue(v2.getAddress());
 */
// System.out.println(v2.getName());
// System.out.println(emp.getValue());

// System.out.println(al);
// System.out.println(al.size());
// System.out.println(vl.getName());

// }

//}
