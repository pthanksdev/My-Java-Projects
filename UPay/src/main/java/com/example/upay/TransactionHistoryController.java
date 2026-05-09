package com.example.upay;

import javafx.concurrent.Task;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TransactionHistoryController {

    private static final String SUPABASE_URL = "https://wymihnusscoxyhydexay.supabase.co/rest/v1/transaction_history";
    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."; // same API key

    private final HttpClient httpClient = HttpClient.newHttpClient();

    public void logTransaction(String userId, String type, String platform, String account, double amount, String date) {
        String json = String.format("""
            {
                "user_id": "%s",
                "type": "%s",
                "platform": "%s",
                "account": "%s",
                "amount": %f,
                "date": "%s"
            }
            """, userId, type, platform, account, amount, date);

        Task<Void> task = new Task<>() {
            @Override
            protected Void call() throws Exception {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(SUPABASE_URL))
                        .header("apikey", API_KEY)
                        .header("Authorization", "Bearer " + API_KEY)
                        .header("Content-Type", "application/json")
                        .header("Prefer", "return=representation")
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .build();

                httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                return null;
            }
        };

        new Thread(task).start();
    }
}
