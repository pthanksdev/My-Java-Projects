package com.example.upay;

public class Transaction {
    private String from;
    private String to;
    private String bank;
    private String amount;
    private String note;
    private String type; // e.g. "Bank Transfer"

    public Transaction(String from, String to, String bank, String amount, String note, String type) {
        this.from = from;
        this.to = to;
        this.bank = bank;
        this.amount = amount;
        this.note = note;
        this.type = type;
    }

    // Getters
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getBank() { return bank; }
    public String getAmount() { return amount; }
    public String getNote() { return note; }
    public String getType() { return type; }
}
