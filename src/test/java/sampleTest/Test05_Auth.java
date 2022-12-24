package sampleTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test05_Auth {
	
	@Test
	public void TestAuth() {
		
		RequestSpecification httpReq = RestAssured.given();
		httpReq.auth().preemptive().basic("postman", "password");
		Response res = httpReq.get("https://postman-echo.com/basic-auth");
		System.out.println(res.getStatusCode()); //200 should be the code
		System.out.println(res.getBody().asPrettyString());
		
	}

}
