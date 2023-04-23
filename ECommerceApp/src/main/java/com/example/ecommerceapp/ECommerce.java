package com.example.ecommerceapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ECommerce extends Application {
   UserInterface userInterface = new UserInterface();

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(userInterface.createContent());
        stage.setTitle("E-Commerce App!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}