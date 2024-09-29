package org.apiautomationdeepak.ex_27092024_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStylePOST {
    public static void main(String[] args) {

        String payload = "{\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"password123\"\n" +
                "}";
        //Given Request Specification
       RequestSpecification r= RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth");
                r.contentType(ContentType.JSON).log().all();
                r.body(payload);

                //When Response
                Response response =r.when().post();

                //Then validation
                ValidatableResponse validatableResponse=response.then();
                validatableResponse.statusCode(200);


    }

}
