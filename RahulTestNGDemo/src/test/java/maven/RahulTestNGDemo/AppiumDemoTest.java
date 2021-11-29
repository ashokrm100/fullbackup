package maven.RahulTestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class AppiumDemoTest {

	@Test(groups= {"smoke"})
	public void appium() {
		System.out.println("Printing from AppiumDemoMethod with main class AppiumDemo");
	}
	
	@Test(groups = {"regression"})

	public void restApi() {
		System.out.println("Printing from RestAPI with main class AppiumDemo  ");
	}
	
	
	@Test(dataProvider="data")
	public void api(String work, String home)
	{
		System.out.println("Printing from Api with main class AppiumDemo");
		System.out.println(work);
		System.out.println(home);
	}
	
	@DataProvider
	public Object[][] data() {
		Object[][]arr = new Object[3][2];
		arr[0][0]="work";
		arr[0][1]="map";
		
		arr[1][0]="second";
		arr[1][1]="map1";
		
		arr[2][0]="Third";
		arr[2][1]="move2";
	
		return arr;
	}

}
