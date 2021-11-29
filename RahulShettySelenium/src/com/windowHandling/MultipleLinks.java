package com.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column = footer.findElement(By.xpath("//ul"));
		int size=column.findElements(By.tagName("a")).size();
		String value=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=1;i<size;i++)
		{
			column.findElements(By.tagName("a")).get(i).sendKeys(value);
		}
		Set<String> windows = driver.getWindowHandles();
		int windowsize=windows.size();
		System.out.println("Window Size:"+windowsize);
		Iterator<String> it = windows.iterator();
		//for(int j=0;j<windowsize;j++)
		while(it.hasNext())
		{
		
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		//driver.navigate().back();
	}

}
