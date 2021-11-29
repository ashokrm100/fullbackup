package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email") WebElement Email;
	@FindBy(name="password") WebElement Password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement submit;
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	
	public HomePage userlogin(String un, String pwd) throws IOException
	{
		Email.sendKeys(un);
		//System.out.println(un);
		Password.sendKeys(pwd);
		//System.out.println(pwd);
		submit.click();
		return new HomePage();
	}
	
	

}
