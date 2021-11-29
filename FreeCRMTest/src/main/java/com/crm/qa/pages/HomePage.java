package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//div[@id='main-nav']//div[3]//button[1]//i[1]") WebElement addcontact;
	@FindBy(xpath="//span[contains(text(),'Contacts')]") WebElement  contacts;
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addContact() throws Exception
	{
		Actions action = new Actions(driver);
		action.moveToElement(contacts).build().perform();
		addcontact.click();
		
	}

}
