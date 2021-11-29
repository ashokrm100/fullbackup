package Academy1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	WebDriver driver=null;
@Test (dataProvider="LoginValues")
public void click(String uname, String pwd) throws IOException
{
	driver=intializebrowser();
	driver.get(url);
	LandingPage li = new LandingPage(driver);
	li.getLogin().click();
	LoginPage lp = new LoginPage(driver);
	lp.sendEmailId().sendKeys(uname);
	lp.sendpwd().sendKeys(pwd);
	lp.submit().click();
	log.info("Data entered");
}
	
@DataProvider

public Object[][] LoginValues()
{
	Object [][] values= new Object[2][2];
	values[0][0]="ashokumar@gmail.com";
	values[0][1]="pwdenter";
	
	values[1][0]="anushasharma@welforce.com";
	values[1][1]="kumaraguru";
	
	return values;
	
}


@AfterMethod()
public void teardown()
{
	driver.close();
}
	
}
