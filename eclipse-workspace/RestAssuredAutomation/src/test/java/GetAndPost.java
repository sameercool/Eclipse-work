import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPost
{
//@Test
//	
//    //get method
//	
//	
//public void put() {
//baseURI="https://reqres.in/api";
//given().
//get("/users?page=2").
//then().
//statusCode(200).
//	  //to get this body parameters we need to copy the path using jsonpathfinder
//body("data[1].first_name",equalTo("Lindsay")).
//body("data.first_name",hasItems("George","Tobias")); 
//	}
//}
	//post method
	@Test
	public void post() {
	//we are using json object to post values to the api it works as a map having keys and values
		JSONObject j1=new JSONObject();
j1.put("Sameer", "QA");
j1.put("sam", "UI");
baseURI="https://reqres.in/api";
given().
//we are saying type of header we want to post
header("Content-Type","application/json").
//content type is the type of content we are serving
contentType(ContentType.JSON).
//we are asking the server to accept the json request
accept(ContentType.JSON).
//we are saying to convert the post we have provided to be changed to json string
body(j1.toJSONString()).
when().
post("/users")
.then()
//201 is the status code for post 
.statusCode(201).log().all();
	}
	
}
