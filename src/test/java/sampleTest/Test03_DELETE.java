package sampleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test03_DELETE {
	
	@Test
	public void Test03Delete() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.request(Method.DELETE, "/users/4");
		int sCode = res.getStatusCode();
		Assert.assertTrue(sCode==200);
	}

}
