package com.TestNGxml;

import org.testng.annotations.Test;

public class TestngXmlCreation {
	
	@Test
	
	public void hello()
	{
		System.out.println("Check on TestNG");
	}
	
	@Test
	
	public void hello2()
	{
		System.out.println("This method is to be exculded");
	}
	
	@Test
	public void hello3()
	{
		System.out.println("This method to be inculded");
	}

}
