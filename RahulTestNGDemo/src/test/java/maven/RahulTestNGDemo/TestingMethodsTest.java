package maven.RahulTestNGDemo;

import org.testng.annotations.Test;

public class TestingMethodsTest {
	
	@Test
	public void smokeTest()
	{
		System.out.println("Printing SmokeTesting");
	}
	
	@Test
	public void systemTest()
	{
		System.out.println("Printing SystemTesting");
	}
	
	@Test
	public void regressionTest()
	{
		System.out.println("Printing Regression");
	}

}
