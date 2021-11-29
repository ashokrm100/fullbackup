import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		Set <String> s =driver.getWindowHandles();
		for(String i:s)
		{
			String title= driver.switchTo().window(i).getTitle();
			System.out.println(title);
			String expect = "Frames & windows";
			if(expect.equals(title)==true)
			{
				driver.close();
			}
			//driver.close();
		}
		
		
		
			
	}
	
	

}
