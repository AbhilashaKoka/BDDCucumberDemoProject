package restassuredTest.SerializeDeserializeDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class SerializeExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        User newUser = new User(101, "Abhilasha", "abhilasha@test.com");

        given()
                .contentType(ContentType.JSON)
                .body(newUser)   // <-- Serialization happens here
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();
    }
}