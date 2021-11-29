import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupMessage {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\SELENIUM\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		alert.accept();
		driver.quit();
	}

}
