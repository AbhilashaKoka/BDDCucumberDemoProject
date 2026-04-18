package utilityDemoTest.GenaerateTest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GenAIClient {
public static void main(String[] args) throws IOException, InterruptedException {
    String testCases = GenAIClient.generate(
            "Generate Selenium test cases for login page"
    );

    System.out.println(testCases);
}
    public static String generate(String prompt) {
        try {
            String apiKey = "YOUR_API_KEY";

            String requestBody = """
            {
              "model": "gpt-4.1-mini",
              "input": "%s"
            }
            """.formatted(prompt);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.openai.com/v1/responses"))
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.body());

            System.out.println("RAW RESPONSE:\n" + response.body());
            return root.path("output").get(0)
                    .path("content").get(0)
                    .path("text").asText();

        } catch (Exception e) {
            return "AI Error: " + e.getMessage();
        }
    }


    public static String extractText(String responseBody) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(responseBody);

            if (root.has("output") && root.path("output").size() > 0) {
                return root.path("output").get(0)
                        .path("content").get(0)
                        .path("text").asText();
            }

            if (root.has("output_text")) {
                return root.path("output_text").asText();
            }

            if (root.has("error")) {
                return "API Error: " +
                        root.path("error").path("message").asText();
            }

            return "Unknown response format";

        } catch (Exception e) {
            return "Parsing Error: " + e.getMessage();
        }
    }
}