package com.Gmail.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Gmail.qa.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//div[@id='profileIdentifier' and @data-email='ashokrm100@gmail.com']") WebElement EmailId;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	
	public void LogIntoId()
	{
		EmailId.click();
	}

}
