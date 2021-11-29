import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFill {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E://SELENIUM//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("A");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> element= driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		System.out.println(element.size());
		for(WebElement web:element)
		{
			if(web.getText().equalsIgnoreCase("asp"))
			{
				web.click();
			}
		}
		
			
	}

}
