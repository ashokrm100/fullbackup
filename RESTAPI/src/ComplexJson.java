import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import pageLoad.ReusableMethod;

public class ComplexJson {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		
		// Creating Json
		
		JsonPath js = new JsonPath(ReusableMethod.Coursedata());
		int i;
		int value = js.getInt("courses.size()");
		System.out.println(js.getInt("dashboard.purchaseAmount"));
		System.out.println(js.getString("courses[0].title"));
		
		for (i=0; i<value; i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
			System.out.println(js.getString("courses["+i+"].price"));
		}
		
		System.out.println("Print NO of copies sold by RPA course");
		
		for(i=0;i<value;i++)
		{
			if(js.getString("courses["+i+"].title").equals("RPA"))
			{
				System.out.println(js.getString("courses["+i+"].copies"));
				break;
			}
		}
		
		System.out.println("Verify the Sum of all copies sold is equal to the total");
		int a = 0;
		int b = 0;
		int sum=0;
		int c=0;
		int valued=0;
		for (i=0;i<value;i++)
		{
			a = js.getInt("courses["+i+"].price");
			b= js.getInt("courses["+i+"].copies");
			c = a*b;
			sum=c+sum;
		}
		System.out.println(sum);
		valued = js.getInt("dashboard.purchaseAmount");
		if (valued==sum)
		{
		
			System.out.println("hi this is "+sum);
		
		//Assert.assertEquals(sum,valued);
		}
		

	}

}
