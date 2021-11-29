package com.pdf.compare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class DynamicFilePath {
	static ArrayList<String> firstarray = new ArrayList<String>();
	//static ArrayList<ArrayList<String>> bulk = new ArrayList<ArrayList<String>>();
	static Map demo=new HashMap<String,ArrayList<String>>();
	static ArrayList<String> secondstring = new ArrayList<String>();
	static ArrayList<String> notcontains = new ArrayList<String>();
	static File notmatched=new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\notmatched.txt");
	
	//@DataProvider (name="provider")
	
	@Test
	public static  void CountFiles() throws IOException 
	{
		File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\SAB_TEXT");
		File[] file1 = directory.listFiles();
		int len=file1.length;
		int j=0;
		for(File f:file1)
		{			
			System.out.println(j);
			j++;
			firstarray.clear();
			if(f.isFile())
			{
				String path=f.getAbsolutePath();
				System.out.println(path);
				Scanner formatstring =new Scanner(new File(path));
				String tok;
				int num=0, val=0;
		while(formatstring.hasNextLine())
		{
			String value = formatstring.nextLine();
			StringTokenizer st = new StringTokenizer(value);
			num = st.countTokens();
			for(int i=0; i<num; i++)
			{
				tok = st.nextToken();
				String st1=tok.replaceAll("[^A-Za-z-]","").replaceAll("(\\.00)","");
				String st2=tok.replaceAll("[^0-9.]","").replaceAll("(\\.00)","");
				firstarray.add(st1);
				firstarray.add(st2);
				firstarray.removeAll(Arrays.asList("",null));
			}
		}//System.out.println("Value of first array in first loop:" +firstarray); 
		File directory1 = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\ADDIT_TEXT");
		File[] file2 = directory1.listFiles();
		int count=0;
		for(File f1:file2)
		{ 
			if(f1.isFile())
			{
				secondstring.clear();
				String path1 = f1.getAbsolutePath();
				System.out.println(path1);
				Scanner searchstring =new Scanner(new File(path1));
				String tok1;
				while(searchstring.hasNextLine())
				{
				String value1= searchstring.nextLine();
				StringTokenizer st1 = new StringTokenizer(value1);
				int num1 = st1.countTokens();
				for(int jm=0; jm<num1; jm++)
					{
					tok1=st1.nextToken();
					String str1= tok1.replaceAll("[^A-Za-z-]","");
					String str2=tok1.replaceAll("[^0-9.]","").replaceAll("(\\.00)","");
					secondstring.add(str1);
					secondstring.add(str2);
					secondstring.removeAll(Arrays.asList("",null));
					}
				}//System.out.println("Value from bulk list : " +secondstring);
				System.out.println(count);
				demo.put(count++,secondstring);
				
				System.out.println("Value from bulk list : " +secondstring);
				//System.out.println(count);
					
			}
		}	//display(firstarray,secondstring);
					
		}System.out.println("value from firstarray:"+firstarray);
		System.out.println(firstarray.size());
		System.out.println("Value from bulk list : " +demo);
			}
		}			
	
	
	
	public static void  display (ArrayList<String> valuearray, ArrayList<String> value2array ) throws IOException
	{
		System.out.println("Value of firstarray:" +valuearray);
		System.out.println("Value of Secondarray:" +value2array);
		/*int value = valuearray.size();
		int secondvalue = value2array.size();
		String val;
		String finalrecord="";
		String secondrecord="";
		System.out.println("Size of first array:" +value +"Size of Second Array:" +secondvalue);
		
		for(String s:value2array)
		{
			val= s;
		for(String s1: valuearray)
		{
			if(s1.equals(val))
			{
			finalrecord=finalrecord+" "+s1;
			secondrecord=secondrecord + " "+val;
			break;
			}
			else if(!valuearray.contains(val)&&!value2array.contains(s1))
			{
				notcontains.add(s1);
				notcontains.add(val);
			
			}
			}
	}
		Set<String> fresh=new LinkedHashSet<String>(notcontains);
		System.out.println("Set values :" +fresh);
		FileWriter writer = new FileWriter("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\notmatched.txt");
		String notpresent ="";
		for(String s: fresh)
		{
			notpresent = notpresent +" "+s;
		}
		File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\SAB_TEXT");
		int size = directory.listFiles().length;
		System.out.println("Value of Orginial Payslip:"+finalrecord);
		System.out.println("Value of AdditLabs Paslip:"+secondrecord);
		File mayOrginialinvoice= new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\Mayoriginal.txt");
		
		for(int i=0;i<size;i++)
		{
			File comparedpath = new File("C:\\Users\\ashok\\Downloads\\COMPARED_INVOICE\\SAB_INVOICE\\original"+i+".txt");
			FileUtils.write(comparedpath,finalrecord);
		}
		
		for(int i=0;i<size;i++)
		{
			File comparedpath = new File("C:\\Users\\ashok\\Downloads\\COMPARED_INVOICE\\ADDIT_INVOICE\\ADDIT"+i+".txt");
			FileUtils.write(comparedpath,secondrecord);
		}
		
		FileUtils.write(notmatched, notpresent);*/
	
	}
	}
		
		
		
		/*File directory = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE");
		int filecount = directory.list().length;
		System.out.println("File Length :"+filecount);
		File[] listOfFiles =directory.listFiles();
		for(File file:listOfFiles)
		{
			if(file.isFile())
			{
				System.out.println(file.getAbsolutePath());
			}
		}*/
				
	
	


