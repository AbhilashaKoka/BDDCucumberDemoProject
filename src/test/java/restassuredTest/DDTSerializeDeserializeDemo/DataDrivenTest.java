package restassuredTest.DDTSerializeDeserializeDemo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.File;
import java.util.List;
import static io.restassured.RestAssured.*;

public class DataDrivenTest {
    public static void main(String[] args) throws Exception {
        RestAssured.baseURI = "https://reqres.in/api";

        // Deserialize JSON file into List<User>
        ObjectMapper mapper = new ObjectMapper();
        List<Users> users = mapper.readValue(
                new File("src/test/java/restassuredTest/DDTSerializeDeserializeDemo/users.json"),
                new TypeReference<List<Users>>() {}
        );

        // Loop through users and post each one
        for (Users user : users) {
            Response response =
                    given()
                            .contentType(ContentType.JSON)
                            .body(user)   // Serialization
                            .when()
                            .post("/users")
                            .then()
                            .statusCode(201)
                            .extract().response();

            // Deserialize response back into POJO
            Users createdUser = response.as(Users.class);

            System.out.println("Created User -> ID: " + createdUser.getId() +
                    ", Name: " + createdUser.getName() +
                    ", Email: " + createdUser.getEmail());
        }
    }
}
