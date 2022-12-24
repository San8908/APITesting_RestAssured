package sampleTest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Test02_POST {
	
	@Test
	public void Test02Post() {
		RestAssured.baseURI="http://localhost:3000/";
		
//		RequestSpecification httpRequest = RestAssured.given();
//		
		Map<String,String> params = new HashMap<String, String>();
		params.put("firstName", "Sanjibanee");
		params.put("lastName", "Baral");
		params.put("subjectId", "4");
		params.put("id", "4");
//		
//		JSONObject requestParams = new JSONObject(params);
//		//JSONObject requestParams = new JSONObject();
//		
//		httpRequest.header("Content-Type","application/json");
//		httpRequest.body(requestParams.toJSONString());
//		
//		Response res = httpRequest.request(Method.POST, "/users");
//		
//		Assert.assertTrue(res.getBody().asString().contains("Sanjibanee"));
//		Assert.assertEquals(res.getStatusCode(), 201);
//		
//		System.out.println("===================Finished=======================");
		
//		Method2
		
//		Map<String,String> m1 = new HashMap<String, String>();
//		
//		given()
//		.accept(ContentType.JSON)
//		.contentType(ContentType.JSON)
//		.header("Content-Type", "application/json")
//		.body(JSONObject.toJSONString(m1))
//		.when()
//		.post("http://localhost:3000/users")
//		.then()
//		.statusCode(200);
		
		given()
		.contentType(ContentType.JSON)
		.basePath("{basePath}")
		.pathParam("basePath", "users")
		.body(JSONObject.toJSONString(params))
		.when()
		.post()
		.then()
		.statusCode(201)
		.log()
		.all();
		
		
	}
		

}
