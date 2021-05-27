package RestApi;

	import static org.hamcrest.Matchers.hasItem;

	import java.util.HashMap;
	import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;

import TestBase.TestBase;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import net.serenitybdd.junit.runners.SerenityRunner;
//import io.vavr.collection.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

	@RunWith(SerenityRunner.class)
	public class auth extends TestBase {
	  
		@Title("verify authentication  method ")
	@Test
	   public void verifyauth(){
			
				 
				   SerenityRest.given().queryParam("CUSTOMER_ID","1")
				           .queryParam("PASSWORD","12345!")
				           .queryParam("Account_No","1")
				           .when().get().then().log()
				           .body().statusCode(200);
				   //guru99
				}			 
		}	

