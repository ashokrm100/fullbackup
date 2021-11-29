package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver;
	Properties prop = new Properties();
	protected String url;

	public WebDriver intializebrowser() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ashok\\Desktop\\workspace\\E2EProject1" + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		//String browserName = prop.getProperty("browser");
		String browserName = System.getProperty("browser");
		//System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E://CHROMEDRIVER//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			url = prop.getProperty("url");
			//System.out.println(url);
			//driver.get(url);

		} else if (browserName.equals("Firefox")) {
			driver = new ChromeDriver();
			String url = prop.getProperty("url");
			System.out.println(url);
			driver.get(url);
		}
		return driver;
	}
	
	
	public void getScreenShot(String methodName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+methodName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		
		
	}
	
}
