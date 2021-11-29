package com.DemoCommerce.qa.TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.DemoCommerce.qa.PageObjects.HomePage;
import com.DemoCommerce.qa.PageObjects.WelcomePage;
//import com.DemoCommerce.qa.TestBase.Base;
import com.DemoCommerce.qa.TestBase.Base;

public class WelcomePageTest extends BaseTest {

	public static Logger log = LogManager.getLogger(WelcomePageTest.class.getName());
	public WelcomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HomePage homepage;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		log.info("Driver Initialized. Ready to Launch browser");
		preCondition();
		log.info("Browser opened successfully");
		//Initialization();
		//page=new WelcomePage();
	}
	
//	@Test(enabled = false)
//		public void getTitleTest()
//	{
//		String expected ="Welcome, please sign in1!";
//		String actual= page.sendTitle();
//		Assert.assertEquals(actual, expected, "String are not same");
//	}

	@Test
	public void LoginTest() throws Exception {
		log.info("Sending data to Login page with username and password");
		WelcomePage page = new WelcomePage(driver);
		page.LoginPage();
		log.info("Login successfull");
	}
	
	@Test(enabled = false)
	
	public void clickSubmit() throws Exception
	{
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
			
	}

}
