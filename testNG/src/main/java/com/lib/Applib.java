package com.lib;

import org.openqa.selenium.WebDriver;

public class Applib {
	private WebDriver driver;
	private Pages page;
	
	public Applib(WebDriver driver)
	{
		this.driver=driver;
		page = new Pages(this.driver);
	}
	
	public Pages first()
	{
		return page;
	}

}
