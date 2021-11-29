package com.AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		WebElement work=driver.findElement(By.xpath("//a[text()='Work From Home']"));
		JavaScriptUtil.drawBorder(work, driver);
		System.out.println(JavaScriptUtil.getTitle(driver));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		String message = "This is my alert";
		js1.executeScript("alert('"+message+"')");
		driver.close();
		
	}

}
