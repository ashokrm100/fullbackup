package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.lib.Applib;
import com.pages.Ebay_Home_page;

public class AbstractBaseClass {
	WebDriver driver;
	private Applib appl;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		driver=new ChromeDriver();
		appl=new Applib(driver);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//page = new Ebay_Home_page(driver);
		//web= new Ebay_Home_Page_Elements(driver);
	}
	@AfterTest
	public void finish() {
		driver.close();
	}
	
	public Applib appl() {
		return appl;
	}
}
