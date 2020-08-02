package com.hiroshtrazor.test;

import com.hiroshtrazor.common.GoogleEndPoints;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test_google {

    @Test
    public void makeSureThatGoogleIsUp() {
        Response response = given().when().get(GoogleEndPoints.GET_BASE_URI);
        System.out.println("Response Code : " + response.statusCode());
        System.out.println("Response : " + response.asString());
        Assert.assertEquals(response.statusCode(), 200, "Response Status");
    }

    @Test
    public void makeSureThatGoogleIsUp1() {
        ValidatableResponse response = given().when().get(GoogleEndPoints.GET_BASE_URI).then().statusCode(200);
        System.out.println("Response : " + response.toString());
    }
}

