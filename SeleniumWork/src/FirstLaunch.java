
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class FirstLaunch {

		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput","true");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			WebElement search =driver.findElement(By.name("search_query"));
			search.sendKeys("fittuber");
			driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			//driver.close();
			
		}
		
	}


