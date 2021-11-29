package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.Util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {
	

		public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

		public static LoginPage login;
		public static HomePage home;
		ContactsPage contact;
		
		
		@BeforeMethod
		
		public void setup() throws Exception
		{
			intialization();
			login = new LoginPage();
			login.userlogin(prop.getProperty("username"),prop.getProperty("password"));
			home = new HomePage();
			home.addContact();
		}
		
		
		@DataProvider
		
		public Object[][] getCRMTestData()
		{
			Object data[][]=TestUtil.readfile();
			return data;
		}
		
		
		@Test(priority=1, dataProvider= "getCRMTestData")
		public void loginintouser(String fname, String mname, String lname, String description) throws IOException
		{
			contact = new ContactsPage();
			contact.dataenter(fname, mname, lname, description);
		}
	
	 
	}	
	
	
	/*LoginPage login;
	HomePage home;

		
	public ContactPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	
	public void setup() throws Exception
	{
		intialization();
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		//System.out.println("driver =" + driver);
		login.userlogin(prop.getProperty("username"), prop.getProperty("password"));
		//
	}
	
	@Test
	public void formfillup()
	{
		
		
	}
	
	
	@AfterMethod
	public void breakdown()
	{
		driver.close();
	}
	
	

}*/
