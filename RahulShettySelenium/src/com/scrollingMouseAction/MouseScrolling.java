package com.scrollingMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrolling {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='travel_date']")).click();
		
		
	}

}
