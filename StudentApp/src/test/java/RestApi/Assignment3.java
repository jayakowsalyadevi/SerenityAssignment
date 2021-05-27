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
	public class Assignment3 extends TestBase {
	  
		@Title("Post method ")
	@Test
	   public void post(){
			Map<String,String> users = new HashMap<>();
			users.put("id", "123");
			users.put("email", "test@gmail.com");
			users.put("first_name", "testfname");
			users.put("last_name", "testlname");
			users.put("avatar", "https://reqres.in/img/faces/10-image.jpg");
					

			ValidatableResponse response=SerenityRest.given()
			.contentType("application/json")
			.body(users)
			.when().post().then()
			.statusCode(200);
			
			/*
			 * System.out.println(response.statusLine());
			 * System.out.println(response.statusCode());
			 */
			 
		}	}

