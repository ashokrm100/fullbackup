package com.Ekart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vegetables = { "Brinjal", "Cucumber", "Carrot" };
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Addtocart obj = new Addtocart();
		obj.cart(driver, vegetables);
	}

	public void cart(WebDriver driver, String[] vegetables) {
		List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		int size = veggies.size();
		List ar = Arrays.asList(vegetables);
		int j = 0;
		for (int i = 0; i < size; i++) {
			String[] name = veggies.get(i).getText().split("-");
			String finalString = name[0].trim();

			if (ar.contains(finalString)) {
				j++;
				driver.findElements(By.cssSelector("div[class=product-action]")).get(i).click();
				if (j == vegetables.length)
					break;
			}
		}
		driver.findElement(By.cssSelector("img[src='https://res.cloudinary.com/"
				+ "sivadass/image/upload/v1493548928/icons/bag.png']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
	}
}
