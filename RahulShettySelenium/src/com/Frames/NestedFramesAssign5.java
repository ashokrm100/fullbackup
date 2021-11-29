package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFramesAssign5 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");//.frame(string)

		driver.switchTo().frame("frame-middle");//.frame(string)

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());
		System.out.println(driver.findElement(By.id("content")).getText());
		//System.out.println(driver.findElement(By.cssSelector("[name='frame-middle']")).getText());
		driver.switchTo().defaultContent();
		driver.navigate().back();
		//driver.switchTo().frame("frame-middle");
		
	}

}
