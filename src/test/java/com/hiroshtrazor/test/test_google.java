package com.hiroshtrazor.test;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test_google {
    @Test
    public void makeSureThatGoogleIsUp_1(){
        ValidatableResponse response = given().when().get("http://www.google.com").then().statusCode(200);
        System.out.println("Response : " + response);
    }
}

