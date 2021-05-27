

	import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.vavr.collection.HashMap;
//import io.vavr.collection.Map;
import net.serenitybdd.rest.SerenityRest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;

import java.util.Map;

import net.serenitybdd.junit.runners.SerenityRunner;


	@RunWith(SerenityRunner.class)
	public class Assignment1 {
	   /**
	 * 
	 */
	/**
	 * 
	 */
	@Test
	   public void verifyTEst(){
		
		String p1= "findAll{it.name=='";
		String p2 = "'}.get(0)";
		String name = "British Indian Ocean Territory";
		Response obj = SerenityRest.rest().given()
		//Response value  =  (Response) SerenityRest.rest().given()
		.when().get("https://restcountries.eu/rest/v1/name/india")
		.then().log().all()
		.statusCode(200)
		.extract().response();		
		String objnew = obj.asString();
		obj.path(p1+name+p2);
		System.out.println("output is "+ obj);
		
//.and().body("data.country code", equalTo("India"));
//.body("RestResponse.result.name", is("India"));
		
		 /*  HashMap<string,Object> value = SerenityRest.rest().given().
		 //  String country = "India";
	      // RestAssured.
	           when().get("https://restcountries.eu/rest/v1/name/india").
	           then().log().all().
	           assertThat().statusCode(200).extract()
	           .path("findAll{it.capital=='New Delhi'});"
	               //and().body("RestResponse.result", is(country));
*/	   }

	private ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}

