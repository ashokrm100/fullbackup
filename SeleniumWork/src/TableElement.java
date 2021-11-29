import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElement {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		//System.out.println(table.size());
		int cnt=0;
		for(WebElement item:table)
		{
			cnt++;
			if(cnt==1)
			{
				continue;
			}
				String first=(item.findElement(By.xpath("td[1]")).getText());
				System.out.println(driver.findElement(By.xpath("//table[@class='tg']/tbody/tr/td[2]")).getText());
				//item.findElement(By.xpath("td[3]")).click();
				//item.findElement(By.xpath("td[4]")).click();
				//List<WebElement> box=driver.findElements(By.xpath("//table[@class='tg']/tbody/tr/td[5]/select/option"));
				//for(WebElement down:box)
					if(first.equals("John White"))
						item.findElement(By.xpath("td[5]/select/option[contains(text(),'Sports')]")).click();
					//else
						//item.findElement(By.xpath("td[5]/select/option[contains(text(),'Sedan'")).click();
		
		}
					
	}

}
