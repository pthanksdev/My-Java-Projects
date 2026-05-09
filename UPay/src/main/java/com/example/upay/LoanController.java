package com.example.upay;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LoanController {
    @FXML private TextField amountField;
    @FXML private TextField durationField;
    @FXML private TextField purposeField;
    @FXML private Label messageLabel;

    @FXML private TableView<LoanApplication> loanTable;
    @FXML private TableColumn<LoanApplication, String> amountColumn;
    @FXML private TableColumn<LoanApplication, String> durationColumn;
    @FXML private TableColumn<LoanApplication, String> purposeColumn;
    @FXML private TableColumn<LoanApplication, String> statusColumn;
    @FXML private TableColumn<LoanApplication, Void> actionColumn;

    private final ObservableList<LoanApplication> loanApplications = FXCollections.observableArrayList();

    @FXML
    private Button closeButton;

    @FXML
    private void goBackToHomepage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("homepage.css").toExternalForm());
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        // Set up table columns
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));
        purposeColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Add action buttons (Approve / Reject)
        actionColumn.setCellFactory(param -> new TableCell<>() {
            private final Button approveBtn = new Button("Approve");
            private final Button rejectBtn = new Button("Reject");
            private final HBox pane = new HBox(5, approveBtn, rejectBtn);

            {
                approveBtn.setOnAction(event -> {
                    LoanApplication loan = getTableView().getItems().get(getIndex());
                    loan.setStatus("Approved");
                    loanTable.refresh();
                });
                rejectBtn.setOnAction(event -> {
                    LoanApplication loan = getTableView().getItems().get(getIndex());
                    loan.setStatus("Rejected");
                    loanTable.refresh();
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(pane);
                }
            }
        });

        loanTable.setItems(loanApplications);

        // Input validation: allow only digits for amount and duration
        amountField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.matches("\\d*")) {
                amountField.setText(newVal.replaceAll("[^\\d]", ""));
            }
        });

        durationField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.matches("\\d*")) {
                durationField.setText(newVal.replaceAll("[^\\d]", ""));
            }
        });
    }

    @FXML
    public void handleApplyLoan() {
        String amount = amountField.getText().trim();
        String duration = durationField.getText().trim();
        String purpose = purposeField.getText().trim();

        if (amount.isEmpty() || duration.isEmpty()) {
            messageLabel.setText("Amount and duration are required.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        LoanApplication newLoan = new LoanApplication(amount, duration, purpose);
        loanApplications.add(newLoan);

        messageLabel.setText("Loan application submitted!");
        messageLabel.setStyle("-fx-text-fill: green;");

        // Clear inputs
        amountField.clear();
        durationField.clear();
        purposeField.clear();
    }
}
