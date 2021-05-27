package RestApi;

	import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.vavr.collection.HashMap;
//import io.vavr.collection.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import org.junit.runner.RunWith;

import TestBase.TestBase;

import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.lang.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasItem;



	@RunWith(SerenityRunner.class)
	public class authenticationassign4 extends TestBase {
	  
		@Title("Verify authentication ")
	@Test
	   public void auth(){
		
			ValidatableResponse response = SerenityRest.given().auth().preemptive().basic("postman1", "password")
					.get("https://postman-echo.com/basic-auth").then().assertThat().statusCode(401)
					//.body("authenticated",equalTo(true));
					.body(containsString("Unauthorized"));
		 
		}	}

