package com.example.csc_311_lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnCalculate;

    @FXML
    private Label lblTotalPayment;

    @FXML
    private TextField txtInterestrate;

    @FXML
    private TextField txtNumYears;

    @FXML
    private TextField txtLoanAmount;

    @FXML
    private TextField txtMonthlyPayment;

    @FXML
    private TextField txtTotalPayment;


    private static double getDoubleFromTextField(TextField t) {
        return Double.parseDouble(t.getText());
    }

    @FXML
    protected void onHelloButtonClick() {

        int totalAmount = 0;
        int interestRate = Integer.parseInt(txtInterestrate.getText());
        int numYears = Integer.parseInt(txtNumYears.getText());
        int loanAmount = Integer.parseInt(txtLoanAmount.getText());
        int monthlyPayment = Integer.parseInt(txtMonthlyPayment.getText());

        totalAmount = loanAmount * interestRate/100 * numYears + loanAmount;

        txtTotalPayment.setText(String.valueOf(totalAmount));


    }
}