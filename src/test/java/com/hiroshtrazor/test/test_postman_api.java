package com.hiroshtrazor.test;

import com.hiroshtrazor.apiframework.RestAssuredConfiguration;
import com.hiroshtrazor.common.GoogleEndPoints;
import com.hiroshtrazor.common.PostmanEndPoints;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class test_postman_api {
    @Test(groups = "postman") // Runs using the testng.xml file
    public void validateLeapYearHardAssertion() {
        RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();
        requestSpecification.queryParam("timestamp", 2016 - 10 - 10).log().all();
        given().get(PostmanEndPoints.GET_IS_LEAP_YEAR_QUERY_PARAM).then().statusCode(200).log().all();

        Response response = given().spec(requestSpecification).get(PostmanEndPoints.GET_IS_LEAP_YEAR_QUERY_PARAM);
        System.out.println("Response : " + response);
    }

    @Test
    public void retrieveCurrentUTCTime(){
        Response response = given().when().get(PostmanEndPoints.GET_BASE_URI+PostmanEndPoints.GET_CURRENT_TIME);
        System.out.println("Response Code : " + response.statusCode());
        System.out.println("Response : " + response.asString());
        Assert.assertEquals(response.statusCode(), 200, "Response Status");
    }
}
