
    package com.example.upay;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

    public class PasswordUtil {

        public static String hash(String password) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256"); // Strong hash algorithm
                byte[] hashedBytes = md.digest(password.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : hashedBytes) {
                    sb.append(String.format("%02x", b)); // Convert to hex
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Error hashing password", e);
            }
        }
    }

