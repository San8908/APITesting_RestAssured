package sampleTest;

import java.io.File;

import org.testng.annotations.Test;
import org.w3.x2000.x09.xmldsig.ObjectType;

import io.restassured.path.json.JsonPath;

@Test
public class Test06_JsonFilePath {
	
	public void getJsonFilePath() {
		
		//System.out.println(System.getProperty("user.dir")+"\\src\\test\\java\\sampleTest\\SampleJson.json");
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\sampleTest\\SampleJson.json");		
		JsonPath path = new JsonPath(file);
		
		//System.out.println( path.get("store.book.category"));
		
		//System.out.println(path.get("store.book.findAll{it.category=='fiction'}.author"));
		
		System.out.println(path.get(".."));
		
		
	}

}
