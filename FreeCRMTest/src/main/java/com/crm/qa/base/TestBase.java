package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException
	{
	//public static void main(String args[]) throws IOException
	
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\Config\\config.properties");
		prop.load(ip);
	}
	
	public static void intialization()
	{
		//System.out.println(prop.getProperty("browser"));
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		//System.out.println("not Working");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
}

/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	static Properties prop;
	static WebDriver driver;
	
			
	public TestBase()
	{
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\Config\\config.properties");
		prop.load(ip);
	}	catch(FileNotFoundException e) {
		e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

		public void Intialization()
		{
			String browsername= prop.getProperty("browser");
			if(browsername.equals("chrome"))
			{
				driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver.exe");
				driver.get(prop.getProperty("url"));
			}else if(browsername=="firefox")
			{
				driver = new FirefoxDriver();
				System.setProperty("webdriver.gecko.driver", "E://SELENIUM//chromedriver.exe");
				driver.get(prop.getProperty("url"));
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
		}
	}*/