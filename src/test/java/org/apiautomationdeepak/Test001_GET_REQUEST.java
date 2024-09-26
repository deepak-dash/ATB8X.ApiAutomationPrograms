package org.apiautomationdeepak;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Test001_GET_REQUEST {
    public static void main(String[] args) {
        System.out.println("RestAssured Demo");

        //Gherkin Syntax
      //  given() - urls , headers, body or payload
      //  when() - https method get,post,put,patch,delete
      //  then() - verify the response expected result = actual result

    RestAssured
            .given()
                .baseUri("https://api.escuelajs.co")
            .basePath("api/v1/products/").log().all()
            .when()
                .get()
            .then().log().all()
                .statusCode(200);


    }
}
