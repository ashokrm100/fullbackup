import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement washington=driver.findElement(By.id("box3"));
		WebElement Rome=driver.findElement(By.id("box6"));
		WebElement source=driver.findElement(By.id("box5"));
		WebElement united=driver.findElement(By.id("box103"));
		WebElement Italy=driver.findElement(By.id("box106"));
		WebElement target=driver.findElement(By.id("box105"));
		Actions act = new Actions(driver);
		act.moveToElement(washington).dragAndDrop(washington, united).build().perform();
		act.dragAndDrop(Rome,Italy).build().perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		driver.close();
		
		/*driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions acta = new Actions(driver);
		acta.dragAndDropBy(drag, 300, 0).build().perform();
		driver.switchTo().defaultContent();
		WebElement drop=driver.findElement(By.xpath("//a[normalize-space()='Droppable']"));
		acta.moveToElement(drop).click().build().perform();
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		acta.dragAndDrop(source, target).build().perform();*/
		
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Autocomplete']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("A");
		//Actions act = new Actions(driver);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		System.out.println(elements.size());
		//act.moveToElement(fin).click().build().perform();
		driver.close();
	
	}

}
