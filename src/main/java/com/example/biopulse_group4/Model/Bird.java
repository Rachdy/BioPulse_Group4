package com.example.biopulse_group4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Bird {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}