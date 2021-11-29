package com.pdf.compare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.testng.annotations.Test;

public class DocumentConversion {

	/*@Test(priority=1)
	
	public static void invoiceData() throws Exception
	{
		String OriginalInvoicePath="C:\\Users\\ashok\\Downloads\\Originalrp_PaySlip._may2015-converted.xlsx";
		File textfile = new File("C:\\Users\\ashok\\Downloads\\slip5.txt");
		if(textfile.delete())
		{
		//String excel1= "C:\\Users\\ashok\\Downloads\\SalarySlip_May_2015-converted.xlsx";
		XSSFWorkbook fileName = new XSSFWorkbook(OriginalInvoicePath);
		XSSFSheet sheet = fileName.getSheet("Sheet1");
		String output;
		double numer;
		int row = sheet.getLastRowNum();
		int col= sheet.getRow(0).getLastCellNum();
		//String value = "Designation";
		for(int i=0; i<row;i++)
		{
			XSSFRow row1= sheet.getRow(i);
			for(int j=0; j<col;j++)
			{
				XSSFCell cell=row1.getCell(j);				
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());
				output = cell.getStringCellValue();
				System.out.println("After assigining output");
				System.out.println(output);
				File textfile1 = new File("C:\\Users\\ashok\\Downloads\\slip5.txt");
				FileUtils.write(textfile1,output,true);
				break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());
				//System.out.println(numer);
				//FileUtils.write(textfile,numer);
				break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());
				break;				
					}
				}
			}
		}
	}*/
	@Test (priority=2)
	public static void filterdata() throws IOException
		{
		
		Scanner parafile =new Scanner(new File("C:\\Users\\ashok\\Downloads\\slip13.txt"));
		File file2 = new File("C:\\Users\\ashok\\Downloads\\may2015addit.txt");
		String words ="";
		String tok= "\n";
		int count=0;
		String val ="";
		while(parafile.hasNextLine())
		{
			String curLine = parafile.nextLine();
			System.out.println("********************************************");
			System.out.println(curLine);
			System.out.println("********************************************");
			int size = curLine.length();
			System.out.println("Length displayed in size:" + size);
			char ch = curLine.charAt(size-1);
			StringTokenizer st = new StringTokenizer(curLine);
			//System.out.println("Printing value from tokenizer" +st);
			int num = st.countTokens();
			System.out.println("Displayed from tokenizer token"+num);
			tok="";
			if(!(count==0))
			{
			words = words+tok+"\n";
			}
			for(int i =1; i<=num; i++)
			{
				tok = st.nextToken();
				System.out.println("Printing from filer token  :" +tok);
				if(tok.equals(":"))
					continue;
				if(tok.equals("OT")||tok.equals("Hrs")||tok.equals("0.00")||tok.equals("Absent")||tok.equals("Days")||tok.equals("31.00"))
				{
					val = val + tok+" ";
					continue;
				}
				else
				{
				words=words+" "+tok;
				System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
				System.out.println("Words print :"+words);
				FileUtils.write(file2,words);
				}
			}
			count++;			
			}
		System.out.println("Value of removed items:"+val);
		val = words+val;
		FileUtils.write(file2, val);
		}
	}	
		
		
	

