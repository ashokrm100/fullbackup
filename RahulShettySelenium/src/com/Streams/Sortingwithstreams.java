package com.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sortingwithstreams {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.cssSelector("a[href='#/offers']")).click();
		Set<String> pages =driver.getWindowHandles();
		Iterator<String> it = pages.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(By.cssSelector("span[class$='sort-descending']")).click();
		List<String> sortlist;
		do
		{
		
		List<WebElement> groceries = driver.findElements(By.cssSelector(".table.table-bordered td:nth-child(1)"));
		List<String>arranged=groceries.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedtext=arranged.stream().sorted().collect(Collectors.toList());
		
		sortlist=groceries.stream().filter(s -> s.getText().contains("Orange")).map(s -> getpricevalue(s)).collect(Collectors.toList());
		sortlist.stream().forEach(s->System.out.println(s));
		//System.out.println(sortlist.size());
		
		if(sortlist.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(sortlist.size()<1);

		
	}
	
	public static String getpricevalue(WebElement s)
	{
		String text = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return text;
	}

}
