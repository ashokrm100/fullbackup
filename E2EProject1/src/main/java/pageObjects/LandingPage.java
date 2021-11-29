package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class LandingPage {
	
	WebDriver driver;
	By Login =By.cssSelector("a[href*='sign_in']");
	
	@FindBy(css=".text-center>h2") WebElement title;
	
	@FindBy(css=".navbar-collapse.collapse") WebElement navi;
	
	public LandingPage(WebDriver driver)
	{
				
		PageFactory.initElements(driver,this);
		this.driver =driver;
	}
	
	public WebElement getLogin() throws IOException
	{
		return driver.findElement(Login);
	}
	
	public WebElement getitle()
	{
		return title;
	}
	
	public WebElement NavigationBar()
	{
		return navi;
	}

}
