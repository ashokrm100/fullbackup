package com.pdf.compare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class SecondInvoice {
	
	/*@Test(priority =1)
	
	public static void invoiceData() throws Exception
	{
		String OriginalInvoicePath="C:\\Users\\ashok\\Downloads\\Originalrp_PaySlip._may2015-converted.xlsx";
		//String excel1= "C:\\Users\\ashok\\Downloads\\SalarySlip_May_2015-converted.xlsx";
		XSSFWorkbook fileName = new XSSFWorkbook(OriginalInvoicePath);
		XSSFSheet sheet = fileName.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col= sheet.getRow(0).getLastCellNum();
		
		String value = "Designation";
		
		for(int i=0; i<row;i++)
		{
			XSSFRow row1= sheet.getRow(i);
			for(int j=0; j<col;j++)
			{
				XSSFCell cell=row1.getCell(j);
												
				if(cell.getStringCellValue().contains(value))
				{
				String output=cell.getStringCellValue();
				System.out.println(output);
				File textfile = new File("C:\\Users\\ashok\\Downloads\\slip.txt");
				FileUtils.write(textfile,output);
				/*List<String> list = FileUtils.readLines(textfile);
				for(String x: list)
				{
					//String[] str1=output.split(":");
					FileUtils.write(textfile,x.replaceAll("[ ]","")+"\n",true);
					
					//System.out.println(x);
				}
				
				}
				
				}
				break;
			}
			
			
		}
	}
		

@Test(priority =2)

public static void secondFile() throws IOException
{
	
String excel1= "C:\\Users\\ashok\\Downloads\\SalarySlip_May_2015-converted.xlsx";
//SECOND FILE PATH
String excel2= "C:\\Users\\ashok\\Downloads\\SalarySlip_May_2015-converted.xlsx";
XSSFWorkbook workbook = new XSSFWorkbook(excel1);
XSSFSheet sheet = workbook.getSheet("Table 1");
//System.out.println(sheet);
int rows = sheet.getLastRowNum();
//System.out.println(rows);
int coll = sheet.getRow(0).getLastCellNum();
String value ="Designation";

for(int r=0;r<rows;r++)
{
	XSSFRow row=sheet.getRow(r);
	for(int c=0;c<coll;c++)
	{
	XSSFCell cell=row.getCell(c);
	//System.out.println(cell.getStringCellValue());
	
	if(cell.getStringCellValue().contains(value))
			
			{
				String output1=cell.getStringCellValue();
				//System.out.println(output1);
				File textfile1 = new File("C:\\Users\\ashok\\Downloads\\slip1.txt");
				FileUtils.write(textfile1,output1);
				/*List<String> list1 = FileUtils.readLines(textfile1);
				for(String y: list1)
				{
					//String[] str1=output.split(":");
					FileUtils.write(textfile1,y.replaceAll("[ ]","")+"\n",true);
					System.out.println(y);
				}
				
			}
				}
		break;
		}
	}
}
*/

/*@Test (priority=1)
public static void filterdata() throws IOException
	{
	
	Scanner parafile =new Scanner(new File("C:\\Users\\ashok\\Downloads\\Originalrp_PaySlip._may2015-converted.docx"));
	File file2 = new File("C:\\Users\\ashok\\Downloads\\slip.txt");
	String words ="";
	while(parafile.hasNextLine())
	{
		String curLine = parafile.nextLine();
		System.out.println("********************************************");
		System.out.println(curLine);
		System.out.println("********************************************");
		int size = curLine.length();
		System.out.println("Length displayed in size:" + size);
		char ch = curLine.charAt(size-1);
		//System.out.println("SIZE OF THE CHARACTER OF THE WORD "+ ch);
		//if(ch == ' ')
		//{
		StringTokenizer st = new StringTokenizer(curLine," ");
		//System.out.println("Printing value from tokenizer" +st);
		int num = st.countTokens();
		System.out.println("Displayed from tokenizer token"+num);
		for(int i =1; i<=num; i++)
		{
			String tok = st.nextToken();
			System.out.println("Printing from filer token  :" +tok);
			if(tok.equals("OT")||tok.equals("Hrs")||tok.equals("0.00")||tok.equals("Absent")||tok.equals("Days")||tok.equals("31.00"))
				continue;
			else
			words=words+tok;
			System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
			System.out.println("Words print :"+words);
			//continue;
			//else
			FileUtils.write(file2,words);
			/*if(ch=='\n')
			{
				words= words+tok+'\n';
			}
		}
	
		//System.out.println(size);
		}
	}
}
	/*FileReader alt = new FileReader(file2);
	
	BufferedReader readdoc = new BufferedReader(alt);
	
	String addstring = readdoc.readLine();
	int l = addstring.length();
	System.out.println("********************"+l);
	System.out.println("\n");
	System.out.println("**************");
	System.out.println(addstring);
	
	char ch= addstring.charAt(l-1);
	StringTokenizer st = new StringTokenizer(addstring, " ");
	String f = "";
	String del = "OT Hrs";
	String del1 ="Absent Days  :    31.00";
	int n = st.countTokens();
	for (int i =1; i<=n; i++)
	{
		String t = st.nextToken();
		if(t.equals(del) || t.equals(del1))
				continue;
		else
			f=f+t;
		FileUtils.write(file2,f);
	}
	f=f.trim()+ch;
	*/
		
//		}
	//}*/


@Test(priority = 1)
public static void comparingtxtfile() throws IOException
	{
	
	File file1 = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\Additlabs.txt");
	File file2 = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\Mayoriginal.txt");
	
	FileReader f1 = new FileReader (file1);
	FileReader f2 = new FileReader (file2);
	
	BufferedReader read1 = new BufferedReader(f1);
	BufferedReader read2 = new BufferedReader(f2); 
	
	String str1 = read1.readLine();
	String str2 = read2.readLine();
	boolean areEqual=false;
	
	int count =1;
	
	while(str1 !=null && str2 !=null)
	{
		if(str1.equalsIgnoreCase(str2))
		{
			areEqual = true;
			System.out.println(str1);
			count++;
		}else {
			areEqual = false;
			System.out.println("notsame");
			System.out.println(str1);
	}
	str1 = read1.readLine();
	str2 = read2.readLine();	
	}
	if(areEqual)
		System.out.println("File's are Same");
		else
			System.out.println("File's are not same at lineno:"+count);
		
	}
}
