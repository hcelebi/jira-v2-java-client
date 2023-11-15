package io.github.hcelebi.jirav2.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.hcelebi.jirav2.domain.dto.UserProperty;
import io.github.hcelebi.jirav2.exception.JiraV2RunTimeException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JiraV2RestClient {
    private final String baseUri;
    private final String token;
    private final HttpClient client;

    public JiraV2RestClient(String baseUri, String token) {
        this.baseUri = baseUri;
        this.token = token;
        client = HttpClient.newHttpClient();
    }

    public UserProperty getUserPropertyByKey(String propertyKey, String accountId) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse<String> response = client.send(HttpRequest.newBuilder()
                    .uri(URI.create(baseUri + "/user/properties/" + propertyKey + "?accountId=" + accountId))
                    .header("Authorization", "Basic " + token)
                    .header("Content-Type", "application/json")
                    .GET()
                    .build(), BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), UserProperty.class);
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JiraV2RunTimeException(e.getMessage());
        }
    }
}
