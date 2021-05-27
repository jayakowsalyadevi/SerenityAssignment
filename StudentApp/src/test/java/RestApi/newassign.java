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


	@RunWith(SerenityRunner.class)
	public class newassign extends TestBase {
	  
		@Title("Assignmnet1")
	@Test
	   public void verifyTEst(){
		
			String p1= "findAll{it.altSpellings=='";
			String p2 = "'}.get(0)";
			String name = "IN";
		ExtractableResponse<Response> test = SerenityRest.given()
		.when().get()
		.then().log().all()
		.statusCode(200)
		.extract();
		 
	
	List<List> arraylist = new ArrayList<List>(); 
	arraylist  = test.path("altSpellings");
		System.out.println("printed arraylist values" +arraylist );
		for (Object var : arraylist)
		{
			String []	arrst=var.toString().split(",");
			
			System.out.println(arrst.length);
			List<String> arrlist = new ArrayList<>(Arrays.asList(arrst));
			//System.out.println(arrlist.get(2));
			System.out.println(arrlist.contains("Republic of India"));

			System.out.println(var);
		}
		//test.path(p1+name+p2);
		/*System.out.println(arraylist.get(1));
		List arr=arraylist.get(1);
		System.out.println(arr);
String []	arrst=arr.toString().split(",");
		
System.out.println(arrst.length);
List<String> arrlist = new ArrayList<>(Arrays.asList(arrst));
System.out.println(arrlist.get(2));
System.out.println(arrlist.contains(" Republic of India"));
	*/
		
		/*
		 * boolean ans = arrst[1].contains("Bh?rat");
		 * 
		 * if (ans) System.out.println("The list contains IO"); else
		 * System.out.println("The list does not contains IO");
		 */
        
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

