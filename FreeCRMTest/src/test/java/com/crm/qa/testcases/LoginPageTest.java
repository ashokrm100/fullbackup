package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	public static LoginPage login;
	public static HomePage home;
	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	
	public void setup() throws IOException
	{
		intialization();
		login = new LoginPage();
	}
	
/*	@AfterMethod
	
	public void clopse()
	{
		driver.close();
	}*/
	
	@Test(priority=1)
	
	public void loginPageTitleTest()
	{
		
		String tite= login.getpagetitle();
		Assert.assertEquals(tite, "Cogmento CRM");
		System.out.println("success");
		
	}
	@Test(priority=2)
	public void loginintouser() throws IOException
	{
		login.userlogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
 
}
