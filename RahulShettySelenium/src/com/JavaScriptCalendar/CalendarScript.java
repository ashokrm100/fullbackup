package com.JavaScriptCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CalendarScript {
	
	@Test
	public void handleCalendar() throws InterruptedException
	{
			System.setProperty("webdriver.gecko.driver","E://firefox//geckodriver.exe");
			DesiredCapabilities ffCapabilities = DesiredCapabilities.firefox();
			ffCapabilities.setCapability("marionette",true);
			WebDriver driver = new FirefoxDriver(ffCapabilities);
			/*System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
			WebDriver driver = new ChromeDriver();*/
			//WebDriver driver;
			/*System.setProperty("webdriver.ie.driver","E://IEDRIVER//IEDriverServer.exe");
			driver = new InternetExplorerDriver();*/
			Actions action = new Actions(driver);
			driver.get("http://demo.guru99.com/v4/");
			WebElement user=driver.findElement(By.cssSelector("input[type='text'][name='uid']"));
			//user.sendKeys("mngr330489");
			action.sendKeys(user,"mngr330489").build().perform();
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ugybunU");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
			//driver.findElement(By.id("dob")).click();
			Thread.sleep(2000);
			
			//String dated="12/12/1990";
			WebElement dated= driver.findElement(By.id("dob"));
			//dated.sendKeys("12/01/1990");
			action.sendKeys(dated,"12/01/1990").build().perform();
			Thread.sleep(3000);
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("document.getElementById('dob').value='12/12/1990'");
			//WebElement dated= driver.findElement(By.cssSelector("input#dob"));
			//js.executeScript("argument[0].values='12/11/1990'",dated);
		
			
		
	}

}
