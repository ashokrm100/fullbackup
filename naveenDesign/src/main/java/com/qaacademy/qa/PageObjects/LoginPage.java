package com.qaacademy.qa.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaacademy.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="user_email") WebElement email;
	@FindBy(id="user_password") WebElement pawd;
	@FindBy(css="[type='submit']") WebElement submit;
	
	public LoginPage() throws IOException
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	public HomePage LoginData(String un, String pwd)
	{
		email.sendKeys(un);
		pawd.sendKeys(pwd);
		submit.click();
		return new HomePage();
	}


	
	

}
