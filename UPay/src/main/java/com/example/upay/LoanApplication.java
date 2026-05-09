package com.example.upay;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoanApplication {
    private String amount;
    private String duration;
    private String purpose;
    private String status;

    public LoanApplication(String amount, String duration, String purpose) {
        this.amount = amount;
        this.duration = duration;
        this.purpose = purpose == null || purpose.isEmpty() ? "-" : purpose;
        this.status = "Pending";
    }

    public String getAmount() { return amount; }
    public String getDuration() { return duration; }
    public String getPurpose() { return purpose; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
