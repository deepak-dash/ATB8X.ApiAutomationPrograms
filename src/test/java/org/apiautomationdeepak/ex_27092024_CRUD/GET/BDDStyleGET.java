package org.apiautomationdeepak.ex_27092024_CRUD.GET;
 //https://api.zippopotam.us/IN/560017
import io.restassured.RestAssured;
import  io.restassured.RestAssured.*;


public class BDDStyleGET {
    public static void main(String[] args) {

        RestAssured
                .given().relaxedHTTPSValidation()
                     .baseUri("https://api.zippopotam.us/")
                .basePath("IN/560017")
                .when()
                     .log().all().get()
                .then()
                      .log().all().statusCode(200);
    }



}
