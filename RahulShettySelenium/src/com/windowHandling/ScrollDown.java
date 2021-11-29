package com.windowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.manage().window().maximize();
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> numbers=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int values;
		int sum=0;
		for(int i=0 ;i<numbers.size();i++)
		{
			values=Integer.parseInt(numbers.get(i).getText());
			sum = sum+values;
		}
		System.out.println(sum);
		int txt=Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		if(txt==sum)
		{
			System.out.println("Bothe are equal");
		}
	}

}
