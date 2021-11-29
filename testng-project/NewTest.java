import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void empty_search_test() 
  {
	  System.setProperty("webdriver.chrome.driver","E://SELENIUM//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
  }
}
