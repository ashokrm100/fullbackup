package pOMFramework;

import org.testng.annotations.Test;

import com.PageObjects.LandingPage;
import com.TestBaseConnection.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LandPageTest extends TestBase {

	WebDriver driver = null;

	@Test
	public void linkClick() throws IOException {
		driver = initialization();
		LandingPage lp = new LandingPage(driver);
		lp.Login().click();

	}

}
