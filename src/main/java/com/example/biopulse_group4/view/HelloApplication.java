package com.example.biopulse_group4.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane mainLayout = new BorderPane();

        Button btnNewEntry = new Button("+ New Entry");
        btnNewEntry.setStyle("-fx-background-color: #1b5e20; -fx-text-fill: white; -fx-font-weight: bold;");

        Button btnDashboard = new Button("Dashboard");
        Button btnCatalog = new Button("Catalog");
        Button btnMap = new Button("Map");
        Button btnSightings = new Button("Sightings");



        VBox sidebar = new VBox(15, btnNewEntry, btnDashboard, btnCatalog,btnMap,btnSightings);
        sidebar.setStyle("-fx-background-color: #f4f4f4; -fx-padding: 20px;");
        sidebar.setPrefWidth(200);

        VBox centerContent = new VBox();
        centerContent.setStyle("-fx-background-color: #ffffff;");

        mainLayout.setLeft(sidebar);
        mainLayout.setCenter(centerContent);

        Scene scene = new Scene(mainLayout, 1000, 700);
        primaryStage.setTitle("GlobalWild / BioPulse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}