package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleLaunch {
	WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
  @Test
  public void search() {
	  driver.findElement(By.id("gh-ac")).sendKeys("Mobile");
	  driver.findElement(By.id("gh-btn")).click();
  }
  
  
}
