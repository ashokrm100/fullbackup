import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOk {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\CHROMEDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String alert=driver.findElement(By.id("demo")).getText();
		System.out.println(alert);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		String alert1=driver.findElement(By.id("demo")).getText();
		System.out.println(alert1);
		//alert.accept();
		driver.close();
			
		
	}

}
