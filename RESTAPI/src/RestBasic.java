import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pageLoad.BodyData;
import pageLoad.ReusableMethod;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
public class RestBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(BodyData.sendData()).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
					.body("scope", equalTo("APP")).header("server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		JsonPath js = new JsonPath(response);
		String PlaceId=js.getString("place_id");
		
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+PlaceId+"\",\r\n"
				+ "\"address\":\"70 winter walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));
		
		String address=given().log().all().queryParam("key", "qaclick123").queryParam("place_id",PlaceId)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 =ReusableMethod.rawToJson(address);
		
		String Updateaddress= js1.getString("address");
		String actual= "70 winter walk, USA";
		
		Assert.assertEquals(actual, Updateaddress);
		
		

		
	}

}
