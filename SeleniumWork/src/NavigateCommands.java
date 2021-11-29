import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement pwd = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		if(pwd.isEnabled())
		{
			pwd.click();
		}
		
		//driver.navigate().to("https://www.youtube.com/watch?v=cojQy_E16Ms&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=7");
		//System.out.println(driver.getTitle());
		//driver.navigate().back();
		//driver.navigate().forward();
	}

}
