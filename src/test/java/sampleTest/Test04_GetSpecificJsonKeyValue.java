package sampleTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test04_GetSpecificJsonKeyValue {
	
	@Test
	public void getSpecificJsonKeyValue() {
		
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response res = httpRequest.request(Method.GET, "/users/1");
		
		JsonPath jsonPath = res.jsonPath();
		System.out.println(jsonPath.get("firstName"));
	}

}
