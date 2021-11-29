import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDataLink {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#u_7_8")).click();
		/*driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);
		Set <String> window=driver.getWindowHandles();
		for(String windows:window)
		{
			if(!windows.equals(parenthandle))
			{
				driver.switchTo().window(windows);
			}
		}
		driver.findElement(By.xpath("//a[@href=\"/r.php?locale=en_GB\"]")).click();
		driver.switchTo().window(parenthandle);*/
	}

}
