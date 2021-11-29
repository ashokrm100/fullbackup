import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement admin=driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		WebElement user=driver.findElement(By.xpath("//a[normalize-space()='User Management']"));
		WebElement user1=driver.findElement(By.xpath("//a[normalize-space()='Users']"));
		Actions act = new Actions(driver);
		act.moveToElement(admin).moveToElement(user).moveToElement(user1).click().build().perform();
	}

}
