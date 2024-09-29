package org.apiautomationdeepak.ex_27092024_CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylePUT {

    RequestSpecification RequestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    //id
    //token
    //payload
    //POST - AUTH - Token
    //POST booking ID
    //PUT - Token booking ID
   public void get_token(){

   }
   public void get_booking_id(){

   }

    @Test
    public void test_put_positive_tc(){
        String token = "7f551c88485234f";
        String bookingid="1509";
        String payload_patch="{\n" +
                "        \"firstname\": \"Deepak\",\n" +
                "        \"lastname\": \"Dash\",\n" +
                "        \"totalprice\": 1222,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2024-01-01\",\n" +
                "            \"checkout\": \"2024-01-02\"\n" +
                "        }";
        RequestSpecification = RestAssured.given();
        RequestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        RequestSpecification.basePath("/booking/" + bookingid);
        RequestSpecification.contentType(ContentType.JSON);
        RequestSpecification.cookie("token", token);
        RequestSpecification.body(payload_patch).log().all();

        Response response = RequestSpecification.when().put();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


    }
}
