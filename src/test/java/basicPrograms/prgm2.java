package basicPrograms;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

import Utilities.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class prgm2 {

	

	@Test
	public void jsonValidation() {

		JsonPath json = new JsonPath(Payload.body());

		
	String	lastname = json.getString("employees.lastname");

		System.out.println("lastname");

	}
	
}