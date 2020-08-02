package com.hiroshtrazor.test;

import com.hiroshtrazor.common.GoogleEndPoints;
import com.hiroshtrazor.common.PostmanEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test_google {
    @BeforeSuite
    public void initialize(){
        RestAssured.baseURI= GoogleEndPoints.GET_BASE_URI;
    }

    @Test(groups = "google")
    public void makeSureThatGoogleIsUp() {
        Response response = given().when().get();
        System.out.println("Response Code : " + response.statusCode());
        System.out.println("Response : " + response.asString());
        Assert.assertEquals(response.statusCode(), 200, "Response Status");
    }

    @Test(groups = "google")
    public void makeSureThatGoogleIsUp1() {
        ValidatableResponse response = given().when().get(GoogleEndPoints.GET_BASE_URI).then().statusCode(200);
        System.out.println("Response : " + response.toString());
    }
}

