package Academy1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test
	
	public void checkNavigation() throws IOException
	{
		driver = intializebrowser();
		driver.get(url);
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.NavigationBar().isDisplayed());
		log.info("Checking on the navigations");
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}

}
