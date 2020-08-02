package com.hiroshtrazor.apiframework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;


@BeforeSuite(alwaysRun = true)
public class RestAssuredConfiguration {
    public void configure() {
        RestAssured.baseURI = "https://postman-echo.com";
//        RestAssured.port=8080;
//        RestAssured.basePath="/basepath";
    }
    public RequestSpecification getRequestSpecification() {
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
