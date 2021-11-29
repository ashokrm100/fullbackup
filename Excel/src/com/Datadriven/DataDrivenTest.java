/*package com.Datadriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/7");
		driver.findElement(By.id("btnSave")).click();
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\ashok\\Desktop\\workspace\\Excel\\src\\com\\testdata\\OrangeHRM.xlsx");
		int row = reader.getRowCount("Sheet1");
		for(int rownum=2;rownum<=row;rownum++)
		{	
		String fullname = reader.getCellData("Sheet1","FULL NAME", rownum);
		System.out.println(fullname);
		String middlename = reader.getCellData("Sheet1", "MIDDLE NAME", rownum);
		System.out.println(middlename);
		String lastname = reader.getCellData("Sheet1","LAST NAME", rownum);
		System.out.println(lastname);
		String employeeid = reader.getCellData("Sheet1","EMPLOYEE ID",rownum);
		System.out.println(employeeid);
		String otherid = reader.getCellData("Sheet1","OTHER ID",rownum);
		System.out.println(otherid);
		driver.findElement(By.xpath("//input[@title='First Name']")).clear();
		driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[@title='Middle Name']")).clear();
		driver.findElement(By.xpath("//input[@title='Middle Name']")).sendKeys(middlename);
		driver.findElement(By.xpath("//input[@title='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys(lastname);
		}
				
	}

}*/
