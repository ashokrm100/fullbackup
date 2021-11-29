package com.pdfUtil;

import java.io.IOException;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

public class ReadPdfText {
	
	public static void main(String args[]) throws IOException
	{
	String pdfLocation="C:\\Users\\ashok\\Downloads\\Originalrp_PaySlipJune2015.pdf";
	String pdfLocation2="C:\\Users\\ashok\\Downloads\\SalarySlip_June_2015.pdf";
	String duplicate = "C:\\Users\\ashok\\Downloads\\Originalrp_PaySlipJune2015 copy.pdf";
	
	String folderLocation="C:\\Users\\ashok\\Downloads\\PDF UTILITY";
	PDFUtil pdfUtil= new PDFUtil();
	/*int count = pdfUtil.getPageCount(pdfLocation);
	Boolean b;
	
	b = pdfUtil.compare(pdfLocation, pdfLocation2);
	System.out.println(b);
	
	b = pdfUtil.compare(pdfLocation, duplicate);
	System.out.println("Second try :"+ b);
	
	System.out.println("The page cout is :" +count);
	String content= pdfUtil.getText(pdfLocation);
	System.out.println("content is :" +content); */
	
	pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
	pdfUtil.highlightPdfDifference(true);
	pdfUtil.setImageDestinationPath(folderLocation);
	pdfUtil.compare(pdfLocation, duplicate);
	System.out.println("itz done");
	}
}
