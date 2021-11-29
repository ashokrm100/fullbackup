package com.demoLogin.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoLogin.qa.Base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(css="#Email") WebElement email;
	@FindBy(css="input[class='password']") WebElement password;
	@FindBy(css="button[type='submit']") WebElement submit;
	
	public LoginPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement Email()
	{
		return email;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Submit()
	{
		return submit;
	}
	
	public DashBoardPage validdata(String username, String pwd1)
	{
		email.clear();
		password.clear();
		email.sendKeys(username);
		password.sendKeys(pwd1);
		submit.click();
		return new DashBoardPage();
	}


	public void simple() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
