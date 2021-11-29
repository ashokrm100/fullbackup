import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Anusha");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumari");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("anuvijaykumar10@gmail.com");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8787878787");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("a");
		driver.findElement(By.id("dateOfBirthInput")).click();
		String expval= "Dec 2020";
		String actval = driver.findElement(By.id("dateOfBirthInput")).getAttribute("value");
		List<WebElement> lis=driver.findElements(By.xpath("//div[@class='react-datepicker__week']//descendant::*)"));
		int cnt=0;
		while(!actval.contains(expval))
		{
			driver.findElement(By.xpath("//button[contains(text(),'Previous Month')]")).click();
			cnt++;
			actval = driver.findElement(By.id("dateOfBirthInput")).getAttribute("value");
			if(cnt==3)
			{
				break;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		System.out.println(lis.size());
		/*driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']//child::option[1]")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']//child::option[91]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, January 7th, 1990']")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("dateOfBirthInput")).getAttribute("value"));
		//driver.close(); 
		
		/*WebElement subjects = driver.findElement(By.xpath("//label[.='Subjects']/../following-sibling::div//div[contains(@class,'subjects-auto-complete__value-container')]/div"));
		/JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",subjects);
		js.executeScript("arguments[0].value=arguments[1]",subjects,"english");*/
	}
}
