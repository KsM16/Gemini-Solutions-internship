import io.restassured.RestAssured;
import io.restassured.response.Response;

public class rest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://gorest.co.in/";
//        String x = RestAssured.given().get("public/v2/users").then().extract().response().body().asString();
//        System.out.println(x);
//        int res = RestAssured.given().get("public/v2/users").then().extract().statusCode();
//        Response res1 =RestAssured.given().get("public/v2/users");
//        System.out.println(res1.getStatusCode());
//        Response response = RestAssured.given().get("public/v2/users").then().extract().response();
//        System.out.println(response.getBody().prettyPrint());
//        System.out.println(response.statusCode());
        Response response = RestAssured.given()
                


    }
}
