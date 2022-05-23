package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Delivery1Controller {

    @FXML
    private Label kiwiLabel, deliveryLable,pizzaLable3,pizzaLabl32,pizzaLable1,deliveryLable2111,nameLable,adressLable;

    @FXML
    private Button cancelButton,confirmButton;



    public void cancelButtonClicked(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("premeniu.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("premeniu.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public void confirmButtonClicked(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("rating.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("rating.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    public void menuButtonOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("menu.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("menu.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }


    public void homeButtonOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("premeniu.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("premeniu.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
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

    public void closeButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("delivery.fxml"));
        Stage primaryStage = (Stage) kiwiLabel.getScene().getWindow();

        Scene scene = new Scene(root, 1920, 1080);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("delivery.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

}
