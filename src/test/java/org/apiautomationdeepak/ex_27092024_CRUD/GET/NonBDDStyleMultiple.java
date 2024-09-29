package org.apiautomationdeepak.ex_27092024_CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleMultiple {
    static RequestSpecification r = RestAssured.given();
    public static void main(String[] args) {
        //Request Specification
        //Response Specification
        //useRelaxedHTTPSValidation(“TLS”);
        r.baseUri("https://api.zippopotam.us");
        Method1();
        Method2();
    }
    private static void Method1() {
        r.basePath("/IN/560017");
        r.when().get();
        r.then().log().all().statusCode(200);
    }

    private static void Method2(){
        r.basePath("/IN/-1");
        r.when().get();
        r.then().log().all().statusCode(404);
    }
}
