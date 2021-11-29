import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {
	private static String obj;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println("HELLO "+elements.size());
		for(WebElement web: elements)
		{
			//System.out.println(web.getText());
			//String ele=web.getText();
			obj = "selenium interview questions";
			if(web.getText().equals(obj))
			{
				web.click();
				break;
			}
		}
		

	}

}
 