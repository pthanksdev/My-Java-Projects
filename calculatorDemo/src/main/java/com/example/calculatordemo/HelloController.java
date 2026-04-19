//package com.example.calculatordemo;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//
//public class HelloController {
//    @FXML
//    private Label calculations;
//    @FXML
//    private Label result;
//    @FXML
//    private Button one, two, three, four, five, six, seven, eight, nine, zero;
//    @FXML
//    private Button plus, minus, multiply, divide, percentage, C, CE, point, equals, raised;
//
//    private double firstNumber = 0;
//    private String operator = "";
//    private boolean startNewNumber = true;
//
//
//    @FXML
//    public void print(ActionEvent event) {
//        if (calculations == null) {
//            System.out.println("Error: Label 'calculations' is not initialized.");
//            return;
//        }
//        Button clickedButton = (Button) event.getSource(); // Get the clicked button
//        String buttonText = clickedButton.getText(); // Get button text (number/operator)
//        if (startNewNumber) {
//            calculations.setText(buttonText);
//            startNewNumber = false;
//        } else {
//            calculations.setText(calculations.getText() + buttonText);
//        }
//    }
//
//    @FXML
//    public void fullStop(ActionEvent event) {
////        if (!calculations.getText().contains(".")) {
////            calculations.setText(calculations.getText() + ".");
//        String text = calculations.getText();
//
//        // Ensure the last number in the calculations does not already contain a '.'
//        if (!text.isEmpty() && !text.substring(text.lastIndexOf(" ") + 1).contains(".")) {
//            calculations.setText(text + ".");
//        }
//    }
//
//    @FXML
//    public void operatorClicked(ActionEvent event) {
//        Button clickedButton = (Button) event.getSource();
//        operator = clickedButton.getText(); // Store operator
//        firstNumber = Double.parseDouble(calculations.getText()); // Store first number
//        calculations.setText(calculations.getText() + " " + operator + " ");
//        startNewNumber = true; // Reset for next number
//    }
//
//    @FXML
//    public void calculateResult(ActionEvent event) {
//        if (operator.isEmpty()) return;
//
//        double secondNumber = Double.parseDouble(calculations.getText());
//        double finalResult = 0;
//
//        switch (operator) {
//            case "+":
//                finalResult = firstNumber + secondNumber;
//                break;
//            case "-":
//                finalResult = firstNumber - secondNumber;
//                break;
//            case "*":
//                finalResult = firstNumber * secondNumber;
//                break;
//            case "/":
//                if (secondNumber == 0) {
//                    calculations.setText("Error");
//                    return;
//                }
//                finalResult = firstNumber / secondNumber;
//                break;
//            case "%":
//                finalResult = firstNumber % secondNumber;
//                break;
//            case "^": // Raising to power
//                finalResult = Math.pow(firstNumber, secondNumber);
//                break;
//        }
//
//        result.setText(String.valueOf(finalResult)); // Show only result in the result label
//        calculations.setText(""); // Clear calculation field for next input
//        firstNumber = finalResult; // Store the result for further calculations
//        startNewNumber = true;
//    }
//
//    @FXML
//    public void clear(ActionEvent event) {
//        calculations.setText("");
//        result.setText("");
//        firstNumber = 0;
//        operator = "";
//        startNewNumber = true;
//    }
//
//    @FXML
//    public void clearOne(ActionEvent event) {
//        String text = calculations.getText();
//        if (!text.isEmpty()) {
//            calculations.setText(text.substring(0, text.length() - 1)); // Remove last character
//            if (calculations.getText().isEmpty()) {
//                startNewNumber = true;
//            }
//        }
//    }
//}
//
//
package com.example.calculatordemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Stack;
import java.util.StringTokenizer;

public class HelloController {
    @FXML
    private Label calculations;
    @FXML
    private Label result;

    private String currentExpression = ""; // Stores the full equation

    @FXML
    public void print(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();

        currentExpression += buttonText;
        calculations.setText(currentExpression);
    }

    @FXML
    public void fullStop(ActionEvent event) {
        if (!currentExpression.endsWith(".")) {
            currentExpression += ".";
            calculations.setText(currentExpression);
        }
    }

    @FXML
    public void operatorClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();

        // Prevent adding multiple operators in a row
        if (!currentExpression.isEmpty() && !"+-×÷%^".contains(currentExpression.substring(currentExpression.length() - 1))) {
            currentExpression += " " + buttonText + " ";
            calculations.setText(currentExpression);
        }
    }

    @FXML
    public void calculateResult(ActionEvent event) {
        try {
            double finalResult = evaluateExpression(currentExpression);
            result.setText(String.valueOf(finalResult));
        } catch (Exception e) {
            result.setText("Error");
        }
    }

    @FXML
    public void clear(ActionEvent event) {
        currentExpression = "";
        calculations.setText("");
        result.setText("");
    }

    @FXML
    public void clearOne(ActionEvent event) {
        if (!currentExpression.isEmpty()) {
            currentExpression = currentExpression.substring(0, currentExpression.length() - 1);
            calculations.setText(currentExpression);
        }
    }

    // Method to evaluate an expression using BODMAS rules
    private double evaluateExpression(String expression) {
        return evaluatePostfix(infixToPostfix(expression));
    }

    // Convert infix to postfix using the Shunting Yard Algorithm
    private String infixToPostfix(String infix) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        StringTokenizer tokenizer = new StringTokenizer(infix, " +-×÷%^()", true);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (token.isEmpty()) continue;

            if (token.matches("\\d+(\\.\\d+)?")) { // If token is a number
                output.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push('(');
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop(); // Remove '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token.charAt(0))) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(token.charAt(0));
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        return output.toString().trim();
    }

    // Evaluate the postfix expression
    private double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(postfix);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (token.matches("\\d+(\\.\\d+)?")) { // Number
                stack.push(Double.parseDouble(token));
            } else { // Operator
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        if (b == 0) return Double.NaN; // Handle division by zero
                        stack.push(a / b);
                        break;
                    case "%":
                        stack.push(a % b);
                        break;
                    case "^":
                        stack.push(Math.pow(a, b));
                        break;
                }
            }
        }

        return stack.pop();
    }

    // Determine operator precedence
    private int precedence(char operator) {
        switch (operator) {
            case '+': case '-':
                return 1;
            case '×': case '÷': case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
