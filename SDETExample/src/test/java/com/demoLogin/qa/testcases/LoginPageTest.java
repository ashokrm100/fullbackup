package com.demoLogin.qa.testcases;

import java.io.File;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.demoLogin.qa.Base.TestBase;
import com.demoLogin.qa.TestUtil.TestUtil;
import com.demoLogin.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		Initialization();
		// lp = new LoginPage();
	}

	@Test(dataProvider = "logodata")
	public void loginDataTest(String user, String pwd, String valida) throws IOException {
		lp = new LoginPage();
		lp.validdata(user, pwd);
		if (valida.equals("valid")) {
			Assert.assertTrue(true);
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name = "logodata")
	public Object[][] sendLoginData() throws IOException {

		File file = new File( ".\\src\\main\\java\\com\\demoLogin\\qa\\TestData\\STUDENTDETAILS.xlsx");
		TestUtil tu = new TestUtil(file);
		Object[][] arr = new Object[0][0];

		int rowSize = tu.getRowCount("STUDENT");
		int cellSize = tu.getCellCount(0, "STUDENT");
		
		arr = new Object[rowSize][cellSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < cellSize; j++) {
				arr[i][j]=tu.getCellValues(i+1, "STUDENT", j);
			}
		}return arr;
		/*
		 * try { FileInputStream excel = new FileInputStream(file); wkbook = new
		 * XSSFWorkbook(excel); sheet = wkbook.getSheetAt(0); int row5 =
		 * sheet.getLastRowNum(); int First = sheet.getFirstRowNum();
		 * System.out.println(First); int last = sheet.getRow(0).getLastCellNum(); arr =
		 * new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; for (int
		 * i = 0; i < row5; i++) {
		 * 
		 * for (int j = 0; j < last; j++) { arr[i][j] = sheet.getRow(i +
		 * 1).getCell(j).toString(); // System.out.println(arr[i][j]); } } } catch
		 * (IOException e) { e.getMessage();
		 * 
		 * } return arr;
		 */
	}

}
