package com.pdf.compare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class FormatInvoice {
	
	static ArrayList<String> firstarray = new ArrayList<String>();
	static ArrayList<String> clonefirstarray = new ArrayList<String>();
	static ArrayList<String> secondstring = new ArrayList<String>();
	static ArrayList<String> clonesecondstring=new ArrayList<String>();
	static ArrayList<String> notcontains = new ArrayList<String>();	
	static ArrayList<ArrayList<String>> indexfile= new ArrayList<ArrayList<String>>();
	static Map<Integer, ArrayList<String>> myMap = new HashMap<Integer, ArrayList<String>>();

	static File notmatched=new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\notmatched.txt");
	
	
	@Test(priority=1)
	public static void searchInvoice() throws IOException
	{
		File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\SAB_TEXT");
		File[] file1 = directory.listFiles();
		int len=file1.length;
		int j=0;
		int tot=0;
		for(File f:file1)
		{
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
				//String refined=st1.replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", "");
				//String refined1=st2.replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", "");
				firstarray.add(st1);
				firstarray.add(st2);
				firstarray.removeAll(Arrays.asList("",null));
			}
		} 
		System.out.println("Complete text printed in array:" +firstarray);
		myMap.put(j, (ArrayList<String>) firstarray);
		System.out.println("map value:" +myMap.get(j));
		}
	}
}
		
		
	@Test (priority=2)
		public static void iteratorValues() throws IOException
		{
			File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\ADDIT_TEXT");
			File[] file2 = directory.listFiles();
			for(File f:file2)
			{
				if(f.isFile())
				{
					String path = f.getAbsolutePath();
					Scanner searchstring =new Scanner(new File(path));
					String tok1;
					while(searchstring.hasNextLine())
					{
					String value1= searchstring.nextLine();
					StringTokenizer st1 = new StringTokenizer(value1);
					int num1 = st1.countTokens();
					for(int j=0; j<num1; j++)
						{
						tok1=st1.nextToken();
						String str1= tok1.replaceAll("[^A-Za-z-]","");
						String str2=tok1.replaceAll("[^0-9.]","").replaceAll("(\\.00)","");
						secondstring.add(str1);
						secondstring.add(str2);
						secondstring.removeAll(Arrays.asList("",null));
						}
					}
					System.out.println("Complete text printed in secondarray: "+secondstring);
				}
			}
			
			}
			
	
	@Test(priority=3)
	public static void arrayComparision() throws Exception
	{
		int value = firstarray.size();
		int secondvalue = secondstring.size();
		String val;
		String finalrecord="";
		String secondrecord="";
		System.out.println("Size of first array:" +value +"Size of Second Array:" +secondvalue);
		
		for(String s:secondstring)
		{
			val= s;
		for(String s1: firstarray)
		{
			if(s1.equals(val))
			{
		//	System.out.println("Value of Orginial Payslip:"+val);
		//	System.out.println("Value of AdditLabs Paslip:" +s1);
			finalrecord=finalrecord+" "+s1;
			secondrecord=secondrecord + " "+val;
			break;
			}
			else if(!firstarray.contains(val)&&!secondstring.contains(s1))
			{
				notcontains.add(s1);
				notcontains.add(val);
			//	System.out.println("eliminated words set1:"+val);
			//	System.out.println("eliminated words set2:"+s1);
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
		
		
		FileUtils.write(notmatched, notpresent);
	
	}
}
	

