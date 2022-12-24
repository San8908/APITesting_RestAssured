package sampleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test01_GET {
	
	@Test
	public void test_01() {
//		/* Method-1 */
//		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
//		System.out.println("Status code : "+res.getStatusCode());
//		System.out.println("Body : "+ res.getBody().asPrettyString());
//		System.out.println("Time Taken : "+res.getTime());
//		System.out.println("Whole response : " + res.asString());
		
		/* Method-2 */
//		RestAssured.baseURI="http://localhost:3000/";
//		
//		//Request object 
//		RequestSpecification httpRequest = RestAssured.given();
//		
//		//Response object
//		Response resNew = httpRequest.get("/users");
//		
//		//Validating the response
//		Assert.assertTrue(resNew.getBody().asString().contains("Sachin"));
//		Assert.assertEquals(resNew.getStatusCode(), 200);// status code return int value
//		
//		//validatng the headers
//		
//		String cType =resNew.header("Content-Type");
//		Assert.assertEquals(cType, "application/json; charset=utf-8");
		
		/*Method 3*/
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}
}
