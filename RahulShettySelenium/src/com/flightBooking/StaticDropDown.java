package com.flightBooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		WebElement value = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(value);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		List<WebElement>fullist=dropdown.getOptions();
		int size = fullist.size();
		
		for(int i =0; i<size; i++)
		{
			System.out.println(fullist.get(i).getText());
		}
		
		driver.close();
		
		}
}
