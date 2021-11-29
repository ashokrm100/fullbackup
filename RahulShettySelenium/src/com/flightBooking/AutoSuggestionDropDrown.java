package com.flightBooking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDrown {
	public static void main(String args[]) throws Exception {
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("fra");
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("France"))
			{
			option.click();
			break;
			}
			
		}
		//driver.close();
		
	}
}
