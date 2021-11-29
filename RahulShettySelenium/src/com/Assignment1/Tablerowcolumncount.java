package com.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablerowcolumncount {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int row =driver.findElements(By.cssSelector("table[name='courses'] tr")).size();
		System.out.println("Now of rows in table:" +row);
		int column = driver.findElements(By.cssSelector("table[name='courses'] th")).size();
		System.out.println("Now of rows in table:" +column);
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());
				
	}
}
