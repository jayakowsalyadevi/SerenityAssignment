package RestApi;

	import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
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
	public class Assignment2 extends TestBase {
	  
		@Title("Validate capital ")
	@Test
	   public void Validatecapital(){
		
		ExtractableResponse<Response> Response = SerenityRest.given()
		.when().get("/norway")
		.then().log().all()
		.statusCode(200).assertThat().
		body("capital",hasItem("Oslo")).
		extract();
		System.out.println(Response.statusLine());
		System.out.println(Response.statusCode());
		 
		}	}

