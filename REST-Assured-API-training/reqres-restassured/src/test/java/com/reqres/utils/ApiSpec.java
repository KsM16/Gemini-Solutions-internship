package com.reqres.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ApiSpec {
    private static final RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/api")
            .setContentType(ContentType.JSON)
            .addFilter(new RequestLoggingFilter())
            .addFilter(new ResponseLoggingFilter())
            .build();

    public static RequestSpecification getSpec() {
        return spec;
    }
}
