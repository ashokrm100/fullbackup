import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssUdemy {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		driver.findElement(By.cssSelector(""));

	}

}
