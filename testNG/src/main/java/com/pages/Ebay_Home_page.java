package com.pages;

import org.openqa.selenium.WebDriver;

import com.testNG.Ebay_Home_Page_Elements;

public class Ebay_Home_page {
WebDriver driver;
Ebay_Home_Page_Elements web;

public Ebay_Home_page(WebDriver driver)
{
	this.driver = driver;
 	web = new Ebay_Home_Page_Elements(driver);
}

// empty click method
public void ClickOnSearch()
{
	web.searchbtn.click();
}

// text search method
public void SearchString(String value)
{
	web.searchvalue.sendKeys(value);
}

// search button click method

public void BtnClick()
{
	web.submitbtn.click();

}

}

