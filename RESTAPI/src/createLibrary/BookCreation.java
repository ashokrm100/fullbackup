package createLibrary;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import pageLoad.ReusableMethod;

public class BookCreation {
	
	
	@Test (dataProvider = "bookcollection")
	public static void BookLib( String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String value = given().log().all().header("Content-Type","application/json").body(ReusableMethod.BookData(isbn,aisle))
				.when().post("Library/Addbook.php").then().log().all().statusCode(200).extract().response().asString();
		//JsonPath js= new JsonPath(value);
		JsonPath js = ReusableMethod.rawToJson(value);
		
		//String id = js.get("ID");
		System.out.println(js.getString("ID"));
		
		
	}
	
	@DataProvider (name ="bookcollection")
	
	public Object[][] arrayReturn()
	{
		return new Object[][] {{"anu","april10"},{"nandhan","kundhan"},{"mahesh","taufeeq"}};
	}

}
