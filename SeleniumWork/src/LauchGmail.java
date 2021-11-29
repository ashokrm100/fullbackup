import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchGmail {
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E://SELENIUM//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
	}

}
