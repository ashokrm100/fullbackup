package com.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FontSize {
	@Test
	public void checkSize()
	{
		System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		WebElement username=driver.findElement(By.cssSelector("input[type='text']"));
		System.out.println(username.getCssValue("font-size"));
	}
}
