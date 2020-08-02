package com.hiroshtrazor.test;

import com.hiroshtrazor.apiframework.RestAssuredConfiguration;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class test_postman_api {
    @Test(groups = "postman") // Runs using the testng.xml file
    public void validate_leapYear_hardAssertion() {
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        requestSpecification.queryParam("timestamp", 2016 - 10 - 10).log().all();
        given().get(EndPoints.GET_IS_LEAP_YEAR_QUERY_PARAM).then().statusCode(200).log().all();

        Response response = given().spec(requestSpecification).get(EndPoints.GET_IS_LEAP_YEAR_QUERY_PARAM);
        System.out.println("Response : " + response);
    }
}
