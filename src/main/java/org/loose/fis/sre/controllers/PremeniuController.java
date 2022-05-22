package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class PremeniuController {

    @FXML
    private Label kiwiLabel, orderLabel, menuLabel, deliveryLabel;

    public void orderButtonOnAction(ActionEvent event){

    }

    public void deliveryButtonOnAction(ActionEvent event){

    }

    public void menuButtonOnHomeOnAction(ActionEvent event){

    }

    public void homeButtonOnAction(ActionEvent event) {

    }

    public void menuButtonOnAction(ActionEvent event) {

    }

    public void chatButtonOnAction(ActionEvent event) {

    }

    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) kiwiLabel.getScene().getWindow();
        stage.close();
    }
}
