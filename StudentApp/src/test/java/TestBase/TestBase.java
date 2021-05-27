package TestBase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {
	@BeforeClass
	public static void init()
	{
		//RestAssured.baseURI="http://demo.guru99.com/V4/sinkministatement.php";
		RestAssured.baseURI="https://reqres.in/api/login";
	//	RestAssured.baseURI="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	}
	

}
