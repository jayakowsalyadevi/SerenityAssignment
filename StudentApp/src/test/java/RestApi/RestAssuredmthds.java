package RestApi;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
@RunWith(SerenityRunner.class)
public class RestAssuredmthds {
	@WithTag("POSITIVE")
	@Title("Verify authentication with valid credential")
@Test
   public void Validateauthinvalidcredetial(){
	
		ValidatableResponse response = SerenityRest.given().auth().preemptive().basic("postman1", "password")
				.get("https://postman-echo.com/basic-auth").then().assertThat().statusCode(401)
				//.body("authenticated",equalTo(true));
				.body(containsString("Unauthorized"));
	 
	}
	@WithTag("POSITIVE")
	@Title("Verify authentication with valid credential")
@Test
   public void Validateauthvalidvalidcredetial(){
	
		ValidatableResponse response = SerenityRest.given().auth().preemptive().basic("postman", "password")
				.get("https://postman-echo.com/basic-auth").then().assertThat().statusCode(200)
				.body("authenticated",equalTo(true));
				//.body(containsString("Unauthorized"));
	 
	}
	@WithTag("POSITIVE")
	@Title("Repubilc of India is present")
@Test
	 public void VerifyRepublicofIndia (){
			
			ExtractableResponse<Response> test = SerenityRest.given()
			.when().get("https://restcountries.eu/rest/v1/name/INDIA")
			.then().log().all()
			.statusCode(200).assertThat().
			body(containsString("Republic of India")).
			extract();
			System.out.println(test.statusLine());
			System.out.println(test.statusCode());
			 
			}
	@WithTag("NEGATIVE")
	@Title("XYZ country  is not present")
@Test
	 public void Verifyxyz (){
			
			ExtractableResponse<Response> test = SerenityRest.given()
			.when().get("https://restcountries.eu/rest/v1/name/INDIA/xyz")
			.then().log().all()
			.statusCode(404).assertThat().
			//body(containsString("Republic of India")).
			extract();
			System.out.println(test.statusLine());
			System.out.println(test.statusCode());
			 
			}

}
