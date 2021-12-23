import org.testng.Assert;
import org.testng.annotations.Test;
//change import io.restassured.RestAssured;
//to below static import to validate get response
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
@Test
public class FirstTest1 {
public void first_test() {
	Response response=get("https://reqres.in/api/users?page=2");
	//to get the status of the response 
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getBody());
	
	int statuscode=response.getStatusCode();
	System.out.println(statuscode);
	Assert.assertEquals(statuscode, 200);
}
@Test
public void second_test() {
	baseURI="https://reqres.in/api";
given()
.get("/users?page=2")
.then().statusCode(200)
.body("data[1].id",equalTo(8))
.log().all();
}


}
