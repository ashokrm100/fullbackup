package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	public static LoginPage login;
	public static HomePage home;
	
	public HomePageTest() throws IOException
	{
		super();
	}
	
@BeforeMethod

public void setup() throws IOException
{
	intialization();
	login = new LoginPage();
	home = login.userlogin(prop.getProperty("username"),prop.getProperty("password"));
}
	
/*@AfterMethod
public void breakdown()
{
	driver.close();
}
*/
@Test
public void addcontactclick() throws Exception
{
	home.addContact();
}


}
