package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on LoginPage")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver","E://CHROMEDRIVER//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/v4");
	    driver.manage().window().maximize();

	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pwd) {
	    driver.findElement(By.cssSelector("input[type*='text'][name='uid']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd	);
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("User landed on HomePage");
	}

}
