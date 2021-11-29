package com.Ekart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.name("travel_date")).click();

		while (!(driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']"))
				.getText().contains("December"))) {

			driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='next']")).click();
		}

		int size = driver.findElements(By.cssSelector("div[class='datepicker-days'] [class='day']")).size();
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='datepicker-days'] [class='day']"));
		for (int i = 0; i < size; i++) {
			System.out.println(dates.get(i).getText());
			if(dates.get(i).getText().contains("15"))
			{
				System.out.println(dates.get(i).getText());
				dates.get(i).click();
				break;
				//driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='day']")).click();
			}

		}
	}
}
