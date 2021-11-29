package com.testNG;

import java.applet.Applet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.Ebay_Home_page;
//import org.testng.Assert;

public class EbayHome_Sanity extends AbstractBaseClass {
	
	//Ebay_Home_Page_Elements web;
	
 
	@Test
  public void empty_search_test() {
	//WebClass web;
	  SoftAssert sa=new SoftAssert();
	  appl().first().pages().ClickOnSearch();
	  //page.ClickOnSearch();
	  //web.searchbtn.click();
	  //driver.findElement(By.cssSelector("#gh-btn")).click();
	  String expected="Shop by Category | eBay";
	  String actual=driver.getTitle();
	  sa.assertEquals(expected,actual,"Test case is pass");
	  //driver.close();
	  sa.assertAll();
  	  }
	@Test
	public void second_search_test() 
	{
		String value ="Iphone";
		appl().first().pages().SearchString(value);
		appl().first().pages().BtnClick();
		//page.SearchString(value);
		//page.BtnClick();
		//web.searchvalue.sendKeys("phone");
		//web.submitbtn.click();
		//driver.findElement(By.cssSelector("#gh-ac")).sendKeys("phone");
		//driver.findElement(By.cssSelector("#gh-btn")).click();
		// TODO Auto-generated method stub
	}
	
	}
	

