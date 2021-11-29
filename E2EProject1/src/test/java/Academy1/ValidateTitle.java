package Academy1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	
	WebDriver driver = null;
	
	@Test
	
	public void getTitle() throws IOException
	{
		driver = intializebrowser();
		driver.get(url);
		LandingPage li = new LandingPage(driver);
		String content=li.getitle().getText();
		String actual="FEATURED COURSES";
		Assert.assertEquals(content,actual);
		log.info("Assetering checking");
	}
	
@AfterMethod

public void tearDown()
{
	driver.close();
}

}
