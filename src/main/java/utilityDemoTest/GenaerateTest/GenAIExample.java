package utilityDemoTest.GenaerateTest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GenAIExample {

    public static void main(String[] args) throws Exception {

        String apiKey ="YOUR_API_KEY";

        String requestBody = """
        {
          "model": "gpt-4.1-mini",
          "input": "Generate test cases for login page with valid and invalid scenarios"
        }
        """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/responses"))
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}