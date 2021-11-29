
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\\\\\SELENIUM\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("")).sendKeys("Hello");
		List<WebElement> ab =driver.findElements(By.tagName("a"));
		System.out.println(ab.size());
		for(int i=0; i<ab.size();i++)
		{
			System.out.println(ab.get(i).getText());
		}


		
	}

}
