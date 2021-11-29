package com.qaacademy.qa.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qaacademy.qa.Base.TestBase;
import com.qaacademy.qa.PageObjects.HomePage;
import com.qaacademy.qa.PageObjects.LoginPage;
import com.qaacademy.qa.PageObjects.SignupPage;
import com.qaacademy.qa.PageObjects.WelcomePage;

public class HomePageTest extends TestBase {
	WelcomePage wp;
	HomePage homepage;
	LoginPage lp;
	SignupPage sp;

	public HomePageTest() throws IOException {
		super();
	}

	/*@BeforeTest
	public void setup() throws IOException {
		initialization();
		wp = new WelcomePage();
		if (wp.PopupSize().size() > 0) {
			wp.Popup().click();
		}
	}

	/*@Test
	public void Login() throws IOException, Exception {
		lp = new LoginPage();
		sp = new SignupPage();
		wp.Register();
		sp.SignupButton();
		Thread.sleep(3000);
		homepage= lp.LoginData(prop.getProperty("username"),prop.getProperty("password"));
	}*/
	
	@Test
	public void getExcelData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ashok\\Documents\\STUDENTDETAILS.xlsx");
		XSSFWorkbook book;
		XSSFSheet sheet;
		Object [] [] arr= new Object[0][0];
		book= new XSSFWorkbook(fis);
		sheet=book.getSheet("STUDENT");
		int col = sheet.getFirstRowNum();
		int row1 = sheet.getLastRowNum();
		int cellvalue=sheet.getRow(col).getLastCellNum();
		arr = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=col; i<row1;i++)
		{
			for(int j=col; j<cellvalue; j++)
			{
				arr[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(arr[i][j]);
				
			}
		}
		
		
		Iterator<Row> row = sheet.iterator();
		//
		
		while(row.hasNext())
		{
			Row rows=row.next();
			System.out.println(rows.cellIterator().toString());
			Iterator<Cell> cell= rows.cellIterator();
			while(cell.hasNext())
			{
			Cell value = cell.next();
			System.out.println("This are records for excel:" +value);
			}
		}
		
		book.close();
		
		
	}

}
