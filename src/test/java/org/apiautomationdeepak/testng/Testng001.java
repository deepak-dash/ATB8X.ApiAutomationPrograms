package org.apiautomationdeepak.testng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Testng001 {

    @Test
    public void test_get(){
        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/59")
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);
    }

}
