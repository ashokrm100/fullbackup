package com.Gmail.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Gmail.qa.Pages.LoginPage;
import com.Gmail.qa.TestBase.TestBase;

public class GmailLoginTest extends TestBase {
	LoginPage newlogin;
	
	public GmailLoginTest() throws IOException
	{
		super();
	}
	
@BeforeMethod
public void setup() throws IOException
{
	Initialization();
	newlogin = new LoginPage();
}
	
@AfterMethod

public void breakdown()
{
	driver.close();
}

@Test

public void FirstEmailIdTest()
{
	newlogin.LogIntoId();
}

}
