package com.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodDemo {
	
@BeforeSuite
public void launchbrowser()
{
	System.out.println("Browser launched");
}
@BeforeMethod
public void search()
{
System.out.println("METHOD IS EXECUTED");
}
@BeforeClass
public void browser()
{
	System.out.println("SEARCH IS CLICKED");
}
@BeforeTest
public void test()
{
	System.out.println("URL IS ENTERED GOOGLE.COM");
}

  @Test
  public void f() {
	  System.out.println("Testcases is being done");
  }
}
