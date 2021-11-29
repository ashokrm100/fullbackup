package com.Assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.ByteBuddy;

public class Ass6AllElements {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		String checktext=driver.findElement(By.id("checkBoxOption3")).getAttribute("value");
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select values = new Select(dropdown);
		List<WebElement> texts=values.getOptions();
		for(int i=0;i<texts.size();i++)
		{
			String va=texts.get(i).getText();
			System.out.println(va);
			System.out.println(checktext);
			if(checktext.equalsIgnoreCase(va))
			{
				values.selectByIndex(i);
				String va1=texts.get(i).getText();
				driver.findElement(By.id("name")).sendKeys(va1);
				break;
			}
		}
		
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
	}

}
