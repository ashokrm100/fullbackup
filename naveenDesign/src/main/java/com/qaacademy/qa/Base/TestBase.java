package com.qaacademy.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qaacademy.qa.TestUtil.Utils;

public class TestBase {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace"
				+ "\\naveenDesign\\src\\main\\java\\com\\qaacademy\\qa\\Config\\config.properties");
		prop.load(fis);
	}
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utils.Timouts,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.ImplicitWait,TimeUnit.SECONDS);
		
	}
	

}
