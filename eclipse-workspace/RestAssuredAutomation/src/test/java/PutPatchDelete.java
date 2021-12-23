import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDelete {
//	@Test
//	public void put() {
//	//we are using json object to post values to the api it works as a map having keys and values
//		JSONObject j1=new JSONObject();
//j1.put("Sameer", "QA");
//j1.put("sam", "UI");
//baseURI="https://reqres.in";
//given().
////we are saying type of header we want to post
//header("Content-Type","application/json").
////content type is the type of content we are serving
//contentType(ContentType.JSON).
////we are asking the server to accept the json request
//accept(ContentType.JSON).
////we are saying to convert the post we have provided to be changed to json string
//body(j1.toJSONString()).
//when().
//put("/api/users/2")
//.then()
////201 is the status code for put 
//.statusCode(200).log().all();
//	}

////F O R     P A T C H
//
//@Test
//public void patch() {
//    //we are using json object to post values to the api it works as a map having keys and values
//	JSONObject j1=new JSONObject();
//j1.put("Sameer", "QA");
//j1.put("sam", "UI");
//baseURI="https://reqres.in";
//given().
//  //we are saying type of header we want to post
//header("Content-Type","application/json").
//   //content type is the type of content we are serving
//contentType(ContentType.JSON).
//  //we are asking the server to accept the json request
//accept(ContentType.JSON).
//////we are saying to convert the post we have provided to be changed to json string
//body(j1.toJSONString()).
//when().
//patch("/api/users/2")
//.then()
//////201 is the status code for patch 
//.statusCode(200).log().all();
//}
//}
	
	
//F O R        D E L E T E
@Test
public void delete() {
baseURI="https://reqres.in";
when().
delete("/api/users/2")
.then()
//201 is the status code for delete 
.statusCode(204).log().all();
}


}


