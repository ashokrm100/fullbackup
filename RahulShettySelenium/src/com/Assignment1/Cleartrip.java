package com.Assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		WebElement adult = driver.findElement(By.id("Adults"));
		Select options = new Select(adult);
		options.selectByIndex(5);

		WebElement children = driver.findElement(By.id("Childrens"));
		Select child = new Select(children);
		child.selectByValue("1");
		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.manage().window().maximize();
		WebElement division = driver.findElement(By.id("Class"));
		Select state = new Select(division);
		List<WebElement> values = state.getOptions();

		for (WebElement value : values) {
			if (value.getText().contains("Business")) {
				value.click();
				break;
			}

		}

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("air");
		List<WebElement> airlines = driver.findElements(By.xpath("//li[@class='list']"));
		int len = airlines.size();
		System.out.println(len);
		for (int j = 0; j < len; j++) {
			System.out.println(airlines.get(j).getText());
			if (airlines.get(j).getText().contains("APG Airlines (GP)")) 
			{
				airlines.get(j).click();
				break;
			}
		}
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
