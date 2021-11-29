package com.qaacademy.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaacademy.qa.Base.TestBase;
import com.qaacademy.qa.PageObjects.HomePage;
import com.qaacademy.qa.PageObjects.LoginPage;
import com.qaacademy.qa.PageObjects.WelcomePage;

public class LoginPageTest extends TestBase {
	WelcomePage wp;
	LoginPage lp;
	HomePage homepage;
	
	public LoginPageTest() throws IOException {
		super();
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
	
		lp=new LoginPage();
		wp.Login();
		
	}
	
	@Test
	public void getData()
	{
		homepage=lp.LoginData(prop.getProperty("username"),prop.getProperty("password"));
	}
	

}
