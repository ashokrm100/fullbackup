import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmxpath {
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@id='txtUsername' or @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	}

}
