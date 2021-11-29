package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoguruTest {
	WebDriver driver;
@BeforeTest
public void setup() {
System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://www.demo.guru99.com/v4");
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
driver.manage().window().maximize();
}

  @Test(priority=0,groups="Login")
  public void link() throws InterruptedException {
	  /*driver.findElement(By.name("uid")).sendKeys("mngr311662");
	  driver.findElement(By.name("password")).sendKeys("uhymAjA");
	  driver.findElement(By.name("btnLogin")).click();*/
	  driver.findElement(By.linkText("here")).click();
	  driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
  }
   
 @Test(priority=1, groups="Login")
  public void email()
  {
	  //driver.get("\"http://demo.guru99.com/\"");
	  //driver.findElement(By.linkText("New Customer")).click();
	 	driver.findElement(By.name("emailid")).sendKeys("ashokrm100@gmail.com");
	 	driver.findElement(By.name("btnLogin")).click();
  }
 
 @Test(priority=2, groups="Agile")
 public void Logincredentials()
 {
	String Username= driver.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(2)")).getText();
	String Pwd= driver.findElement(By.cssSelector("tbody tr:nth-child(5) td:nth-child(2)")).getText();
	System.out.println(Username);
	System.out.println(Pwd);
	driver.findElement(By.linkText("Agile Project")).click();
	driver.findElement(By.name("uid")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Pwd);
	driver.findElement(By.name("btnLogin")).click();
 }
 
  @AfterTest
  public void close()
  {
	  driver.close();
  }
}
