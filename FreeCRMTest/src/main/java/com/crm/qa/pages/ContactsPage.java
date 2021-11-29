package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(name="first_name") WebElement firstname;
	@FindBy(name ="last_name") WebElement lastname;
	@FindBy(name ="middle_name") WebElement middle_name;
	@FindBy(name ="description") WebElement description;

	public ContactsPage() throws IOException {
	
		PageFactory.initElements(driver, this);
	
	}
	
	public void dataenter(String fname, String lname, String mname, String descrp) 
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);	
		middle_name.sendKeys(mname);
		description.sendKeys(descrp);
	}

	
}
