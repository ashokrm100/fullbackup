package oAuthRahulshetty;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class OAuthTest {
	
	public static void main(String args[])
	{
		//RestAssured.baseURI="";
		
		String accesstokenresponse=given().queryParams("code","")
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("Client Secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type","authorization_code")
		.when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js = new JsonPath(accesstokenresponse);
		String accesstoken=js.getString("access_token");
		
		
		
		
		String response=given().queryParam("access_token",accesstoken)
		.when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
		
		System.out.println(response);
		
	}

}
