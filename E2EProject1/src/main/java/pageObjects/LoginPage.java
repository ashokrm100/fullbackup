package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	By email = By.id("user_email");
	@FindBy(id="user_password") WebElement pwd;
	
	@FindBy(css = "[value='Log In']") WebElement submit;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public WebElement sendEmailId()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement sendpwd()
	{
		return pwd;
	}
	
	public WebElement submit()
	{
		return submit;
	}

}
