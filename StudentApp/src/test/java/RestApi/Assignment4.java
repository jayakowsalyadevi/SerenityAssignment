package RestApi;

	import static org.hamcrest.Matchers.hasItem;

	import java.util.HashMap;
	import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;

import TestBase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import net.serenitybdd.junit.runners.SerenityRunner;
//import io.vavr.collection.Map;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;
//import org.springframework.http.HttpStatus;
	@RunWith(SerenityRunner.class)
	public class Assignment4 extends TestBase {
	  
		@Title("verify login")
	@Test
	   public void login(){
			
			Response response= SerenityRest.given().get();

			// = request.get();
			System.out.println("Status code: " + response.getStatusCode());
			System.out.println("Status message " + response.body().asString());
		SerenityRest. given().urlEncodingEnabled(true)
			  .param("Username","Admin@@@") 
			  //.param("Password", "admin123")
			  .header("Accept", ContentType.JSON.getAcceptHeader()) .post("")
			  .then().statusCode(200);
			System.out.println("Status code: " + response.getStatusCode());
			System.out.println("Status message " + response.body().asString());
			 	//below is final one 
			 /* SerenityRest. given().auth()
			  .preemptive()
			  .basic("eve.holt@reqres.in", "cityslicka")
			  .when().post("/login") .then().extract().contentType();
			 */ 
			//<<<<ok	/*
				// * SerenityRest. given().auth() .preemptive() .basic("Adminnew", "admin123")
				 //* .when().post("/login") .then().statusCode(200).extract().contentType();
				 //*/
			 
			System.out.println("The content type of response "+
			           SerenityRest.given().get().then().extract()
			              .contentType());
			//  .assertThat() .statusCode(200);
			  
				/*
				 * SerenityRest.given().auth() .basic("eve.holt@reqres.in", "cityslicka")
				 * .when() .post("/login") .then() .assertThat() .statusCode(200);
				 */		}	}

