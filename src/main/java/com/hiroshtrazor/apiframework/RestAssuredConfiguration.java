package com.hiroshtrazor.apiframework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;


public class RestAssuredConfiguration {
//    @BeforeSuite(alwaysRun = true)
//    public void configure() {
//        RestAssured.baseURI = "https://postman-echo.com";
//    }

    public RequestSpecification getRequestSpecification() {
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
