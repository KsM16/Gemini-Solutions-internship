    package com.reqres.tests;

    import com.reqres.base.BaseTest;
    import com.reqres.models.*;
    import io.restassured.response.Response;
    import org.testng.Assert;
    import org.testng.SkipException;
    import org.testng.annotations.Test;

    import java.util.List;
    import java.util.Map;

    import static io.restassured.RestAssured.given;

    public class ReqResTests extends BaseTest {

        // Q1
        @Test(priority = 1)
        public void Q1_getUsersList() {
            Response r = given()
                    .queryParam("page", 2)
                    .when().get("/users")
                    .then().statusCode(200).extract().response();

            List<?> users = r.jsonPath().getList("data");
            Assert.assertTrue(users.size() >= 6, "need atleast 6 users");
            String firstEmail = r.jsonPath().getString("data[0].email");
            Assert.assertTrue(firstEmail.endsWith("@reqres.in"), "1st  email should end with @reqres.in");
        }

        // Q2
        @Test(priority = 2)
        public void Q2_getSingleUser() {
            Response r = given()
                    .when()
                    .get("/users/2")
                    .then().statusCode(200).extract().response();
            String firstName = r.jsonPath().getString("data.first_name");
            Assert.assertEquals(firstName, "Janet", "1st name not janet");
            int id = r.jsonPath().getInt("data.id");
            Assert.assertEquals(id, 2, "id should be 2");
        }

        // Q3
        @Test(priority = 3)
        public void Q3_createUser() {
            CreateUserRequest req = new CreateUserRequest("kshitiz", "QA");

            CreateUserResponse resp = given()
                    .body(req)
                    .when().post("/users")
                    .then().statusCode(201)
                    .extract().as(CreateUserResponse.class);

            Assert.assertNotNull(resp.getId(), "id should be present");
            Assert.assertNotNull(resp.getCreatedAt(), "createdAt should be present");


        }

        // Q4
        @Test(priority = 4)
        public void Q4_updateUser() {
            UpdateUserRequest req = new UpdateUserRequest("kshitiz", "Gemini Solutions");

            UpdateUserResponse resp = given()
                    .body(req)
                    .when().put("/users/2")
                    .then().statusCode(200)
                    .extract().as(UpdateUserResponse.class);

            Assert.assertNotNull(resp.getUpdatedAt(), "updatedAt should be present");
            Assert.assertEquals(resp.getJob(), req.getJob());
        }

        // Q5
        @Test(priority = 5)
        public void Q5_deleteUser() {
            Response r = given()
                    .when().delete("/users/2")
                    .then().statusCode(204)
                    .extract().response();

             Assert.assertTrue(r.asString() == null || r.asString().isEmpty(), "body should be empty");
        }

        // Q6
        @Test(priority = 6)
        public void Q6_chainedScenario_CreateThenGet() {
            CreateUserRequest req = new CreateUserRequest("chainuser", "tester");
            CreateUserResponse createResp = given()
                    .body(req)
                    .when().post("/users")
                    .then().statusCode(201)
                    .extract().as(CreateUserResponse.class);

            String createdId = createResp.getId();
            Assert.assertNotNull(createdId);

             Response getResp = given()
                    .when().get("/users/" + createdId)
                    .then().extract().response();



             String fetchedFirstName = getResp.jsonPath().getString("data.first_name");
             Assert.assertEquals(fetchedFirstName, req.getName(), "first nam eshould match");
        }

        // Q7
        @Test(priority = 7)
        public void Q7_getNonExistingUser() {
            Response r = given()
                    .when().get("/users/23")
                    .then().extract().response();

            Assert.assertEquals(r.getStatusCode(), 404, "404 expected");
            String body = r.asString();
             Assert.assertTrue(body == null || body.trim().isEmpty() || body.trim().equals("{}"),
                    "body shopuld be empty");
        }

        // Q8
        @Test(priority = 8)
        public void Q8_extractSingleField() {
            String firstName = given()
                    .when().get("/users/2")
                    .then().statusCode(200)
                    .extract().jsonPath().getString("data.first_name");

            Assert.assertEquals(firstName, "Janet");
        }

        // Q9
        @Test(priority = 9)
        public void Q9_extractListOfFields() {
            List<String> emails = given()
                    .queryParam("page", 2)
                    .when().get("/users")
                    .then().statusCode(200)
                    .extract().jsonPath().getList("data.email");

            System.out.println("Emails: " + emails);
            Assert.assertFalse(emails.isEmpty(), "emails are empty");
            for (String e : emails) {
                Assert.assertTrue(e.endsWith("@reqres.in"), "maills should end with @reqres.in ");
            }
        }

        // Q10
        @Test(priority = 10)
        public void Q10_validateFieldCount() {
            List<Map<String, Object>> data = given()
                    .queryParam("page", 2)
                    .when().get("/users")
                    .then().statusCode(200)
                    .extract().jsonPath().getList("data");

            Assert.assertEquals(data.size(), 6, "Expected exactly 6 objects in data array for page=2");
        }

        // Q11
        @Test(priority = 11)
        public void Q11_nestedJsonValidation() {
            String supportUrl = given()
                    .when().get("/users/2")
                    .then().statusCode(200)
                    .extract().jsonPath().getString("support.url");

            Assert.assertTrue(supportUrl.contains("reqres.in"));
        }

        // Q12
        @Test(priority = 12)
        public void Q12_jsonKeyValueMatching() {
            CreateUserRequest req = new CreateUserRequest("jsonuser", "qa");
            CreateUserResponse resp = given()
                    .body(req)
                    .when().post("/users")
                    .then().statusCode(201)
                    .extract().as(CreateUserResponse.class);

             if (resp.getName() != null) {
                Assert.assertEquals(resp.getName(), req.getName());
            }
            if (resp.getJob() != null) {
                Assert.assertEquals(resp.getJob(), req.getJob());
            }
        }

        // Q13
    //    @Test(priority = 13)
    //    public void Q13_searchInsideJsonArray() {
    //         String firstName = given()
    //                .queryParam("page", 2)
    //                .when().get("/users")
    //                .then().statusCode(200)
    //                .extract().jsonPath().getString("data.find { it.id == 8 }.first_name");
    //
    //        Assert.assertEquals(firstName, "Lindsay");
    //    }

        // Q14
        @Test(priority = 14)
        public void Q14_dynamicJsonPath() {
            CreateUserRequest req = new CreateUserRequest("manral", "dev");
            Response resp = given()
                    .body(req)
                    .when().post("/users")
                    .then().statusCode(201)
                    .extract().response();

             String id = resp.jsonPath().getString("id");
            System.out.println("CREATED user id  " + id);
            Assert.assertNotNull(id, "id  not in request");
        }
    }
