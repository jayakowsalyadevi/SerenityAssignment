package RestApi;

	import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.vavr.collection.HashMap;
//import io.vavr.collection.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import TestBase.TestBase;

import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.serenitybdd.junit.runners.SerenityRunner;
import static org.hamcrest.CoreMatchers.containsString;


	@RunWith(SerenityRunner.class)
	public class Assignment1 extends TestBase {
	  
		@Title("Assignmnet1")
	@Test
	   public void verifyTEst(){
		
		ExtractableResponse<Response> test = SerenityRest.given()
		.when().get("xyz")
		.then().log().all()
		.statusCode(404).assertThat().
		//body(containsString("Republic of India")).
		extract();
		System.out.println(test.statusLine());
		System.out.println(test.statusCode());
		 
		}	}

