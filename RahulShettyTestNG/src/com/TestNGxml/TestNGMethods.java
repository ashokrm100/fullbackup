package com.TestNGxml;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGMethods {
	@BeforeMethod
	public void before()
	{
		Reporter.log("This is BeforeMethod", true);
	}
	
	@AfterMethod
	public void after()
	{
		Reporter.log("This is AfterMethod", true);
	}
	
	@BeforeSuite
	public void suite()
	{
		Reporter.log("This is BeforeSuite",true);
	}
	
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("This is AfterSuite",true);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("This is BeforeClass",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("This is AfterClass",true);
	}
	
	@Test(enabled=false)
	public void testmethod() {
		Reporter.log("This is Test1",true);
	}
	
	@Test(enabled=false)
	public void test2method() {
		Reporter.log("This is Test2",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("This is BeforeTest",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("This is AfterTest",true);
	}

}
