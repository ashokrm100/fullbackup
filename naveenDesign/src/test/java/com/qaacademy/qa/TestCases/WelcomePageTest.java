package com.qaacademy.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaacademy.qa.Base.TestBase;
import com.qaacademy.qa.PageObjects.LoginPage;
import com.qaacademy.qa.PageObjects.WelcomePage;

public class WelcomePageTest extends TestBase {
	
	WelcomePage wp;
	LoginPage lp;

	public WelcomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		wp= new WelcomePage();
		if(wp.PopupSize().size()>0)
		{
			wp.Popup().click();
		}	
	}
			
	@Test
	public void getLogin() throws IOException
	{
		
		lp=wp.Login();
	}

}
