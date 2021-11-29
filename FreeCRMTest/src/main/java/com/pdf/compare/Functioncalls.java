package com.pdf.compare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
import org.testng.annotations.Test;

public class Functioncalls {
	static List<String> firstarray= new ArrayList<String>();
	static List<String> firstarray1= new ArrayList<String>();
	static File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\ADDIT_TEXT");
	static int fu=0;
	static ArrayList<String> notcontains = new ArrayList<String>();
	@Test
	public static void checking() throws Exception
	{
		
		File[] file1 = directory.listFiles();
		for(File f:file1)
		{
			firstarray.clear();
			firstarray1.clear();
			if(f.isFile())
			{
				String path=f.getAbsolutePath();
				Scanner sc =new Scanner(new File(path));
		int num,pos=0;
		int size =0;
		while(sc.hasNextLine())
		{
			String value = sc.nextLine();
			StringTokenizer st = new StringTokenizer(value);
			num = st.countTokens();
			String tok;
			for(int i=0; i<num; i++)
			{
				tok = st.nextToken();
				String st1=tok.replaceAll("[^A-Za-z-]","").replaceAll("(\\.00)","");
				String st2=tok.replaceAll("[^0-9.]","").replaceAll("(\\.00)","");
				firstarray.add(st1);
				firstarray.add(st2);
				firstarray.removeAll(Arrays.asList("",null));
				if(tok.charAt(i)=='\n')
				{
				pos=firstarray.indexOf(i);
				System.out.println("index of new line:"+i);
				}
			}
		}
		size= firstarray.size();
		System.out.println("Position of the occurence:"+pos);
		List<String> firstarray2 = firstarray.subList(0, pos);
		List<String> firstarray3 = firstarray.subList(pos+1,size);
	
	arrayComparision(firstarray2,firstarray3);
			}
		}
	}
	
	public static void arrayComparision(List<String> firstarray2, List<String> firstarray3) throws Exception
	{
		System.out.println(firstarray2);
		System.out.println(firstarray3);
		int value = firstarray2.size();
		int secondvalue = firstarray3.size();
		String val;
		String finalrecord="";
		String secondrecord="";
		System.out.println("Size of first array:" +value +"Size of Second Array:" +secondvalue);
		
		for(String s:firstarray2)
		{
			val= s;
		for(String s1: firstarray3)
		{
			if(s1.equals(val))
			{
		//	System.out.println("Value of Orginial Payslip:"+val);
		//	System.out.println("Value of AdditLabs Paslip:" +s1);
			finalrecord=finalrecord+" "+s1;
			secondrecord=secondrecord + " "+val;
			break;
			}
			else if(!firstarray3.contains(val)&&!firstarray2.contains(s1))
			{
				notcontains.add(s1);
				notcontains.add(val);
				System.out.println("eliminated words set1:"+val);
				System.out.println("eliminated words set2:"+s1);
			}
			}
	}
		Set<String> fresh=new LinkedHashSet<String>(notcontains);
		System.out.println("Set values :" +fresh);
		String notpresent ="";
		for(String s: fresh)
		{
			notpresent = s +" "+notpresent;
		}
		notcontains.clear();
		File notmatched = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\notmatched "+fu+".txt");
		
		FileUtils.write(notmatched, notpresent);
		

		File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\SAB_TEXT");
		System.out.println("Value of Orginial Payslip:"+finalrecord);
		System.out.println("Value of AdditLabs Paslip:"+secondrecord);
		
		
			File comparedpath = new File("C:\\Users\\ashok\\Downloads\\COMPARED_INVOICE\\SAB_INVOICE\\originalvalue "+fu+".txt");
			FileUtils.write(comparedpath,finalrecord);
	
		
			File comparedpath1 = new File("C:\\Users\\ashok\\Downloads\\COMPARED_INVOICE\\ADDIT_INVOICE\\ADDITvalue "+fu+".txt");
			FileUtils.write(comparedpath1,secondrecord);
		
			
	fu++;
	
		
	}
	
}
