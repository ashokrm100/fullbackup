package com.Datadriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class OrangeHrmLaunch {

	WebDriver driver;
	
@BeforeMethod
public void launchBrowser()
{
	
	System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/7");
	driver.findElement(By.id("btnSave")).click();
}

@DataProvider
public Iterator<Object[]> getmyExceldata()
{
	ArrayList<Object[]> testData=TestUtil.getExceldata();
	return testData.iterator();

}


@Test(dataProvider="getmyExceldata")
public void dataenter(String fullname, String middlename, String lastname, String employeeid, String otherid)
{
	driver.findElement(By.xpath("//input[@title='First Name']")).clear();
	driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys(fullname);
	driver.findElement(By.xpath("//input[@title='Middle Name']")).clear();
	driver.findElement(By.xpath("//input[@title='Middle Name']")).sendKeys(middlename);
	driver.findElement(By.xpath("//input[@title='Last Name']")).clear();
	driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys(lastname);
	driver.findElement(By.id("personal_txtEmployeeId")).clear();
	driver.findElement(By.id("personal_txtEmployeeId")).sendKeys(employeeid);
	driver.findElement(By.id("personal_txtOtherID")).clear();
	driver.findElement(By.id("personal_txtOtherID")).sendKeys(otherid);
}

@AfterMethod
public void complete()
{
	driver.close();
}

}
