package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Label kiwiLabel, menuLabel;

    public void homeButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("premeniu.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("premeniu.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public void menuButtonOnAction(ActionEvent event) {

    }

    public void chatButtonOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("chat.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("chat.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) kiwiLabel.getScene().getWindow();
        stage.close();
    }
}
