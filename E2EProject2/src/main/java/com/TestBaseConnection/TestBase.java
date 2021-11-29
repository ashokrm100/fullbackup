package com.TestBaseConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
	WebDriver driver;
	Properties prop;
	FileInputStream fis;
	public WebDriver initialization() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\ashok\\Desktop\\workspace\\E2EProject2\\src"
				+ "\\main\\java\\com\\Configuration\\Base.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		return driver;
	}
}
