package addIT;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowClick {
	
	@Test
	public void getClick() throws Exception
	{
		String downloadPath=System.getProperty("user.dir");
		HashMap<String,Object>chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups",0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/pdf-to-excel");
		driver.findElement(By.cssSelector(".sc-1rd62mt-2.ejRuwW")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ashok\\Documents\\Check\\fileupload.exe");
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//List<WebElement> values = driver.findElements(By.)
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.
				xpath("//div[@class=\"sc-6ytb27-0 clQFqQ\"]//div[1]/div[1]/div")));
		driver.findElement(By.xpath("//div[@class=\"sc-6ytb27-0 clQFqQ\"]//div[1]/div[1]/div")).click();
		
		driver.findElement(By.cssSelector("button[class$=\"gHRELX\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
				
	}

}
