package com.DemoCommerce.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	@FindBy(css =".title strong") WebElement title;
	@FindBy(id="Email") WebElement email;
	
	@FindBy(id="Password") WebElement password;
	
	@FindBy(css="button[type='submit']") WebElement submit;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String sendTitle()
	{
		String value = title.getText();
		return value;
	}
	
	public void LoginPage() throws Exception
	{
		email.clear();
		password.clear();
		Thread.sleep(2000);
		email.sendKeys("admin@yourstore.com");
		password.sendKeys("admin");
		Thread.sleep(2000);
		submit.click();
//		return new HomePage();
	}

}
