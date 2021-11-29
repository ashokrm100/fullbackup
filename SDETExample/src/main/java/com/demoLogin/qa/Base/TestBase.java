package com.demoLogin.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.demoLogin.qa.TestUtil.WebEventListener;

public class TestBase {
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;
	public TestBase() throws IOException {
		
			fis = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\SDETExample"
					+ "\\src\\main\\java\\com\\demoLogin\\qa\\config\\config.properties");
			prop = new Properties();

			prop.load(fis);
		
		}
	
	
	public void Initialization() throws IOException
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
			driver = new ChromeDriver();			
			driver.get(prop.getProperty("url"));
		}
		e_driver= new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	

}
