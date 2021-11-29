package com.pdf.compare;

import de.redsix.pdfcompare.PdfComparator;

public class pdfCompare {
	
	public static void main(String args[]) throws Exception
	{
		String pdfLocation="C:\\Users\\ashok\\Downloads\\Originalrp_PaySlipJune2015.pdf";
		String pdfLocation2="C:\\Users\\ashok\\Downloads\\SalarySlip_June_2015.pdf";
		String result ="C:\\Users\\ashok\\Downloads\\resultpdf";
		new PdfComparator(pdfLocation, pdfLocation2).compare().writeTo(result);
		System.out.println("process completed");
		
	}

}
