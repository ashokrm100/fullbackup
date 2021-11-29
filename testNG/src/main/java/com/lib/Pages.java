package com.lib;

import org.openqa.selenium.WebDriver;

import com.pages.Ebay_Home_page;

public class Pages {
	private WebDriver driver;
	private Ebay_Home_page page;
	
	Pages(WebDriver driver)
	{
		this.driver=driver;
		page = new Ebay_Home_page(this.driver);
	}
	
	public Ebay_Home_page pages()
	{
		return page;
	}

}
