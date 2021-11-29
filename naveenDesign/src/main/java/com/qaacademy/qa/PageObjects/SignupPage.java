package com.qaacademy.qa.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaacademy.qa.Base.TestBase;

public class SignupPage extends TestBase {
	
	@FindBy(css="[class=' login-button']") WebElement signupbutton;

	public SignupPage() throws IOException
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	public HomePage SignupButton()
	{
		
		signupbutton.click();
		return new HomePage();
		
	}
	
	
	
	
}
