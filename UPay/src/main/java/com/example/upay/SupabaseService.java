package com.example.upay;

import javafx.concurrent.Task;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

public class SupabaseService {

    private static final String BASE_URL = "https://wymihnusscoxyhydexay.supabase.co/rest/v1/";
    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Ind5bWlobnVzc2NveHloeWRleGF5Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDc5NjU3MTUsImV4cCI6MjA2MzU0MTcxNX0.0_kHrEfrnoANdenTr1g9BNIjl3-mWMJzX9NShdBY77Q";

    private final HttpClient httpClient;

    public SupabaseService() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public Task<String> fetchUsersTask() {
        return new Task<>() {
            @Override
            protected String call() throws IOException, InterruptedException {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + "users?select=*"))
                        .header("apikey", API_KEY)
                        .header("Authorization", "Bearer " + API_KEY)
                        .header("Accept", "application/json")
                        .GET()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    return response.body();
                } else {
                    throw new IOException("Failed to fetch users. Status code: " + response.statusCode());
                }
            }
        };
    }

    public Task<String> insertUserTask(String jsonData) {
        return insertDataTask("users", jsonData);
    }

    public Task<String> insertBettingTransactionTask(String jsonData) {
        return insertDataTask("transactions", jsonData);
    }

    public Task<String> insertTransactionHistoryTask(String jsonData) {
        return insertDataTask("transaction_history", jsonData);
    }

    private Task<String> insertDataTask(String tableName, String jsonData) {
        return new Task<>() {
            @Override
            protected String call() throws Exception {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + tableName))
                        .header("apikey", API_KEY)
                        .header("Authorization", "Bearer " + API_KEY)
                        .header("Content-Type", "application/json")
                        .header("Prefer", "return=representation")
                        .POST(BodyPublishers.ofString(jsonData))
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 201) {
                    return response.body();
                } else {
                    throw new RuntimeException("Insert failed into " + tableName + " with status: " + response.statusCode() + " - " + response.body());
                }
            }
        };
    }
}
