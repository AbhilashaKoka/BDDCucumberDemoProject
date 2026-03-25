package restassuredTest.SerializeDeserializeDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.List;
import static io.restassured.RestAssured.given;

public class SerializeAndDeserializeExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";
        User newUser = new User(101, "Abhilasha", "abhilasha@test.com");
        Response response = given().contentType(ContentType.JSON).body(newUser)// <-- Serialization happens here
                        .when().get("/users/2")
                        .then().statusCode(200)
                        .extract().response();

        // Deserialize JSON into POJO
        User user = response.as(User.class);
        System.out.println("ID: " + user.getId()+"Name: " + user.getName()+"Email: " + user.getEmail());

        Response response2 = given()
                .when()
                .get("/users")
                .then()
                .extract()
                .response();
        List<User> usersList = response2.jsonPath().getList("", User.class);
        usersList.forEach(user1 -> System.out.println(user.getName()));
        List<User> createdUser = response.jsonPath().getList("data", User.class);//
//        {
//            "data": [
//            { "id": 1, "name": "John" }
//  ]
//        }

    }
}