package com.demoLogin.qa.TestUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demoLogin.qa.Base.TestBase;
//import com.aventstack.extentreports.ExtentReports;

public class TestUtil extends TestBase {
	static ExtentReports extent;
	FileInputStream fi;
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String data;
	File path;
	//Object[][] values = new Object[0][0];

	public TestUtil(File path) throws IOException
	{
		this.path = path;
	}
	public int getRowCount(String sheetName) throws IOException
	{
		fi=new FileInputStream(path);
		book = new XSSFWorkbook(fi);
		sheet= book.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		book.close();
		fi.close();
		return rows;
	}
	
	public int getCellCount(int rownum, String sheetName) throws IOException
	{
		fi=new FileInputStream(path);
		book = new XSSFWorkbook(fi);
		sheet = book.getSheet(sheetName);
		int cols= sheet.getRow(rownum+1).getLastCellNum();
		book.close();
		fi.close();
		return cols;
	}
	
	public String getCellValues(int rownum, String sheetName, int cellnum) throws IOException
	{
		fi=new FileInputStream(path);
		book = new XSSFWorkbook(fi);
		sheet = book.getSheet(sheetName);
		String data=sheet.getRow(rownum).getCell(cellnum).toString();
		book.close();
		fi.close();
		return data;
	
	}
	
	public static void takesScreenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user.dir");
		FileUtils.copyFile(src,new File(currentdir + "//screenshots//" +System.currentTimeMillis() + ".png"));
	}
	
	
	public static ExtentReports extentReport()
	{
		//ExtentReports extent;
		String path = System.getProperty("user.dir")+"\\reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("goodMorning");
		reporter.config().setDocumentTitle("DemoLogin");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Ashok Kumar");
		return extent;
	}
	
	/*@Test(dataProvider="Exceldata")
	public void getdataTest(String username, String pwsd, String submitvalue) {

		//TestUtil val = new TestUtil();
		// val.loadExcelfile();
		System.out.println(System.getProperty("user.dir"));
		System.out.println(username);
		System.out.println(pwsd);
		System.out.println(submitvalue);
		// Object [] [] dats= val.loadExcelfile();
		// System.out.println(dats);

	}

	//@DataProvider(name = "Exceldata")

/*	public Object[][] loadExcelfile() throws IOException {
		File file = new File(".\\src\\main\\java\\com\\demoLogin\\qa\\TestData\\STUDENTDETAILS.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		Object[][] arr = new Object[0][0];
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook = new XSSFWorkbook(excel);
			sheet = wkbook.getSheetAt(0);
			int row5 = sheet.getLastRowNum();
			int First = sheet.getFirstRowNum();
			System.out.println(First);
			int last = sheet.getRow(0).getLastCellNum();
			arr = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i < row5; i++) {

				for (int j = 0; j < last; j++) {
					arr[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					// System.out.println(arr[i][j]);
				}
			}
		} catch (IOException e) {
			e.getMessage();

		}
		return arr;
	}

	/*
	 * public Object[][] loadExcelfile() throws IOException {
	 * 
	 * fi = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\SDETExample"
	 * + "\\src\\main\\java\\com\\demoLogin\\qa\\TestData\\STUDENTDETAILS.xlsx");
	 * 
	 * book = new XSSFWorkbook(fi); sheet = book.getSheetAt(0);
	 * //row=sheet.getRow(0); //cell=row.getCell(0); int rows=
	 * sheet.getLastRowNum(); int cols = sheet.getRow(0).getLastCellNum(); values =
	 * new Object[rows][cols];
	 * 
	 * for(int i=0; i<rows; i++) { for(int j=0; j<cols; j++) { values[i][j] =
	 * sheet.getRow(i).getCell(j).toString(); System.out.println(values[i][j]);
	 * 
	 * } }
	 * 
	 * return values; }
	 */

}
