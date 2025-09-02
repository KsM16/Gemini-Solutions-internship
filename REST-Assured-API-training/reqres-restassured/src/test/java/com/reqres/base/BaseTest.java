package com.reqres.base;

import com.reqres.utils.ApiSpec;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static RequestSpecification spec;

    @BeforeClass
    public void setUp() {
        spec = ApiSpec.getSpec();
            RestAssured.requestSpecification = spec;
    }
}
