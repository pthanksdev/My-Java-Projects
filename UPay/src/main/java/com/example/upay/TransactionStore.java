package com.example.upay;

import java.util.ArrayList;
import java.util.List;

public class TransactionStore {
    private static final List<Transaction> transactions = new ArrayList<>();

    public static void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public static List<Transaction> getTransactions() {
        return transactions;
    }
}
