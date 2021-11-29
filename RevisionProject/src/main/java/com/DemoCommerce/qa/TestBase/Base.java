package com.DemoCommerce.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.DemoCommerce.qa.TestUtils.WebEventListener;

public class Base {
	public Properties prop;
	public WebDriver driver;
	FileInputStream fis;
	static long Timeouts = 10;
	EventFiringWebDriver e_driver;
	WebEventListener eventlistener;

	public Base() {
		try {
			prop = new Properties();
			fis = new FileInputStream(".\\src\\main\\java\\com\\DemoCommerce\\qa\\Config\\config.Properties");
			prop.load(fis);
		} catch (Exception e) {

		}
	}

	public void Initialization() throws IOException {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		e_driver = new EventFiringWebDriver(driver);
		eventlistener = new WebEventListener();
		e_driver.register(eventlistener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Timeouts, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

}
