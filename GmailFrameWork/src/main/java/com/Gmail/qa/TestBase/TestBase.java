package com.Gmail.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	Properties prop;
	FileInputStream ip;
	public TestBase() throws IOException
	{
	prop = new Properties();
	ip = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\GmailFrameWork\\src\\main\\java\\com\\Gmail\\qa\\Config\\config.properties");
	prop.load(ip);
	}
	
public void Initialization()
{
	System.out.println(prop.getProperty("browser"));
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CHROMEDRIVER\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
}
	
	

}
