package org.apiautomationdeepak.ex_27092024_CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {
    public static void main(String[] args) {
        //Request Specification
        //Response Specification
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("IN/560017");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);

    }

}
