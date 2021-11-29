package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Home_Page_Elements {
	WebDriver driver;
	@FindBy(css="#gh-btn") public WebElement searchbtn;
	@FindBy(css="#gh-ac") public WebElement searchvalue;
	@FindBy(css="#gh-btn") public WebElement submitbtn;


public Ebay_Home_Page_Elements(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}   