import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorConcept {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(" https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&pageType=3984&ru=https%3A%2F%2Fmy.ebay.com%2Fws%2FeBayISAPI.dll%3FMyEbayBeta%26MyEbay%3D%26gbh%3D1%26guest%3D1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26pageType%3D3984%26ru%3Dhttps%253A%252F%252Fmy.ebay.com%252Fws%252FeBayISAPI.dll%253FMyEbayBeta%2526MyEbay%253D%2526gbh%253D1%2526guest%253D1");
		driver.findElement(By.id("firstname")).sendKeys("ashok");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("ashokrm100@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Lokesh@123232");
		driver.findElement(By.id("showpasswordcontainer")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOn(driver, driver.findElement(By.xpath("//input[contains(@id,'EMAIL_REG_FORM_SUBMIT']")),20);
				
	}

	private static void clickOn(WebDriver driver, WebElement Locator, int timeout) {
		// TODO Auto-generated method stub
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(Locator));
	Locator.click();

		
	}
}
