package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InterviewSetup {
	@Test
	public void setup() //throws NoSuchElementException
	{
		System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello");
		//driver.switchTo().window("https://www.facebook.com");
		driver.navigate().forward();
		driver.navigate().back();
		WebElement ele=driver.findElement(By.name("qz"));
		ele.sendKeys("Hello");
		ele.sendKeys(Keys.BACK_SPACE);
		ele.sendKeys(Keys.CONTROL,"A","Hi");
		ele.sendKeys("hi");
		System.out.println("Before closing:"+driver.getTitle());
		driver.close();
		}
		finally
		{
			System.out.println("error caught");
			//System.out.println(e.getMessage());
		}
		//System.out.println(driver.getTitle());
		//driver.navigate().to("https://www.facebook.com");
	}
}