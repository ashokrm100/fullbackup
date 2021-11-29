package com.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestBaseConnection.TestBase;

public class LandingPage extends TestBase {
	WebDriver driver;
	public LandingPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
	}
	
	By Login=By.xpath("//a[span='Login']");
	
	public WebElement Login() throws IOException
	{
		return driver.findElement(Login);
	}
	

}
