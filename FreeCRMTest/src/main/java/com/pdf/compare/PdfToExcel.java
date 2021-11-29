package com.pdf.compare;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import org.testng.Assert;
import java.io.OutputStream;

import java.util.Collection;

import java.util.List;



import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.*;

public class PdfToExcel {
		
	@Test
	public static void pdfFile() throws Exception
	{
		File directory = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\SAB_INVOICE");
		int filecount = directory.list().length;
		System.out.println("File Length :"+filecount);
		File[] listOfFiles =directory.listFiles();
		int i=0;
		String path="C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\SAB_TEXT\\Original";
		for(File file:listOfFiles)
		{
			i=i+1;
			if(file.isFile())
			{
				String pdfLocation=(file.getAbsolutePath());
				String output2;
				PDDocument pd2 = null;
				FileInputStream fis2=new FileInputStream(pdfLocation);
				try
				{
		
					pd2= PDDocument.load(fis2);
					output2=new PDFTextStripper().getText(pd2);
					File textfile3 = new File(path+i+".txt");
					FileUtils.write(textfile3, output2);		
		}catch(Exception e) {
		e.printStackTrace();
				}
			}
		}
	}

	@Test(priority=2)
	public static void LoadSecondFile() throws IOException
	{
		File directory = new File("C:\\Users\\ashok\\Downloads\\ADDITLABS INVOICE\\ADDIT_INVOICE");
		String textOutput;
		File[] listoffiles=directory.listFiles();
		int i=0;
		for(File f:listoffiles)
		{
			i++;
			if(f.isFile())
			{
				String loadpdf=f.getAbsolutePath();
				PDDocument pd =null;
			
				FileInputStream secondFile = new FileInputStream(loadpdf);
				try
				{
				pd=PDDocument.load(secondFile);
				textOutput=new PDFTextStripper().getText(pd);
				File textfile = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\ADDIT_TEXT\\Addit" + i+".txt");
				FileUtils.write(textfile, textOutput);
				
				}catch (Exception e)
				{
				e.printStackTrace();
				}
			}
		}
	}
}