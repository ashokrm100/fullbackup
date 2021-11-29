package maven.RahulTestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

public class JavaPrintTest {
	
	@Test(groups={"sanity"})
	public void java()
	{
		System.out.println("Printing from javatest: Second class");
	}
	
	@Test(dependsOnMethods= {"javaScript"}, groups= {"sanity","smoke"})
	public void python()
	{
		System.out.println("Printing from Python: Second Class");
		
	}
	
	
	@Test(groups="regression")
	
	public void javaScript()
	{
		System.out.println("Printing from javaScript: Second Class");
	}
	
	//@Parameters({"url"})
	@Test
	
	public void parameter()
	{
		System.out.println("url");
	}
}
