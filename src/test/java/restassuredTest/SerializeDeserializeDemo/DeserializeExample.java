package restassuredTest.SerializeDeserializeDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeserializeExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .when()
                        .get("/users/2")
                        .then()
                        .statusCode(200)
                        .extract().response();

        // Deserialize JSON into POJO
        User user = response.as(User.class);

        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}