package com.DemoCommerce.qa.TestCases;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;

	public BaseTest() 
	{
		try {
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\RevisionProject\\"
				+ "src\\main\\java\\com\\DemoCommerce\\qa\\Config\\config.Properties");
		prop.load(fis);
		}catch(Exception e) {
			
		}
	}
	
	public void preCondition() throws Exception {
		
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			// driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		}
	}
}
