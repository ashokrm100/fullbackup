package com.pdf.compare;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.testng.annotations.Test;

public class TestContinue {
	
	@Test
	
	public static void continueTest() throws IOException
	{
		ArrayList<String> filearray = new ArrayList<String>();
		Scanner st=new Scanner(new File("C:\\Users\\ashok\\Downloads\\slip14.txt"));
		Scanner st3= new Scanner(new File(""));
		while(st.hasNextLine())
		{
			String sum = st.nextLine();
			StringTokenizer tok = new StringTokenizer(sum);
			int size=tok.countTokens();
			for(int i=1; i<=size;i++)
			{
			String str1=tok.nextToken();
			String st1=str1.replaceAll("[^A-Za-z]","");
			String st2=str1.replaceAll("[^0-9.]", "");
			String refined=st1.replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", "");
			String refined1=st2.replaceAll("[0]+$", "").replaceAll("(\\.)(?!.*?[1-9]+)", "");
			filearray.add(refined);
			filearray.add(refined1);
			filearray.removeAll(Arrays.asList("",null));
				
			System.out.println("Value of array is:" +filearray);
			if(st1!=null||st1==null && st2!=null)
			{
			System.out.println("Value in file: "+st1);
			}
			if(st2.contains("0-9."))
			System.out.println("Number in file:"+st2);
			}
		}	
	}

}
		








