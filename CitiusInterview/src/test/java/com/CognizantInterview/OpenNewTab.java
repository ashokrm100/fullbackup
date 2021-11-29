package com.CognizantInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenNewTab {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://www.google.com");

	}
}
