package com.qaacademy.qa.PageObjects;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaacademy.qa.Base.TestBase;

public class WelcomePage extends TestBase {

	@FindBy(css = "li[class='active'] a") WebElement home;
	
	@FindBy(css = "ul[class='nav navbar-nav navbar-right'] li:nth-child(2) a") WebElement course;
	
	@FindBy(xpath="//a[span='Login']") WebElement Login;
	
	@FindBy(xpath="//button[contains(text(),'NO THANKS')]") WebElement popup;
	
	@FindBy(xpath="//a[span='Register']") WebElement register;
	
	public WelcomePage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage Login() throws IOException
	{
		Login.click();
		return new LoginPage();
	}
	
	public WebElement Home()
	{
		return home;
	}
	
	public WebElement Popup()
	{
		return popup;
	}
	
	public List<WebElement> PopupSize()
	{
		return driver.findElements(By.xpath("//button[contains(text(),'NO THANKS')]"));
	}
	
	public SignupPage Register() throws IOException
	{
		register.click();
		return new SignupPage();
	}
	
	
	public WebElement course()
	{
		return course;
	}
	

}
