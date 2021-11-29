package com.Assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion8 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector(".cen-left-align #autocomplete")).sendKeys("unit");
		List<WebElement> states = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String country = "United States (USA)";
		for (int i = 0; i < states.size(); i++) 
		{
			System.out.println(states.get(i).getText());
			
			
			
			if (states.get(i).getText().equalsIgnoreCase(country))
			{
				states.get(i).click();
			}
		}

	}

}
